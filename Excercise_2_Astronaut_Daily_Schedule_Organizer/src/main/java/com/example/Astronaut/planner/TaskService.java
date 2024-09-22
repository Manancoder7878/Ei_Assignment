package com.example.Astronaut.planner;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class TaskService {
	private ApplicationEventPublisher eventPublisher = null;
	public static int count = 0;
	public static List<TaskFactory> task = new ArrayList<>();
	
	static {
		
	}
	
	public TaskService(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }
	
	public List<TaskFactory> showTask(){
		task.sort(Comparator.comparing(TaskFactory::getStart));
		return task;
	}
	
	public void addnewTask(String description,LocalTime start,LocalTime end,String priority) {
		TaskFactory newtask = new TaskFactory(description,start,end,priority);
		Boolean flag = true;
		for (TaskFactory existingTask : task) {
            if (isConflict(existingTask, newtask)) {
                // Publish conflict event
                eventPublisher.publishEvent(new TaskConflictEvent(this, newtask));
                flag = false;
            }
        }
		if(flag == true) {
			task.add(newtask);
		}
	}
	
	public boolean isConflict(TaskFactory existingTask, TaskFactory newtask) {
		// TODO Auto-generated method stub
		return (newtask.getStart().isBefore(existingTask.getEnd()) &&
                newtask.getEnd().isAfter(existingTask.getStart()));
	}

	public void deleteByActivity(String activity) {
		Predicate<? super TaskFactory> mypredicate = tasks -> tasks.getActivity().equals(activity);
		task.removeIf(mypredicate);
	}
	
	public int countTask() {
		int sizeofList = 0;
		sizeofList = task.size();
		return sizeofList;
	}
	@SuppressWarnings("unused")
	public Boolean findByUsername(String activity) {
		// TODO Auto-generated method stub
		Boolean flag = null;
		Predicate<? super TaskFactory> checkPresent = tasks -> tasks.getActivity().equals(activity);
		if(checkPresent != null) {
			flag = true;
		}
		else {
			flag = false;
		}
		return flag;
	}
}
