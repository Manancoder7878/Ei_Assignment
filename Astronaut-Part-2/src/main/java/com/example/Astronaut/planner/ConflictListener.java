package com.example.Astronaut.planner;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ConflictListener {
	
	 @EventListener
	    public void onTaskConflict(TaskConflictEvent event) {
	        TaskFactory conflictingTask = event.getTask();
	        System.out.println("Task Conflict Detected: Task '" + conflictingTask.getActivity() + 
	                           "' conflicts with an existing task.");
	    }
}
