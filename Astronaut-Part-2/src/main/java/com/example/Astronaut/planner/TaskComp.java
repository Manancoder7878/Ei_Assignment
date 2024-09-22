package com.example.Astronaut.planner;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class TaskComp implements CommandLineRunner{
	Scanner sc = new Scanner(System.in);
	DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
	private final TaskService taskservice;
	LocalTime timeStart;
	LocalTime timeEnd;
	@Autowired
	public TaskComp(TaskService taskservice) {
		super();
		this.taskservice = taskservice;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		int count = 0;
		while(count != 4) {
			System.out.println("MENU:");
			System.out.println("1:Add new task\n2:Remove the task\n3:View All Task\n4:Exit");
			int choice = sc.nextInt();
			count = choice;
			sc.nextLine();
			switch(choice) {
			case 1:
				addTask();
				break;
			case 2:
				removeTask();
				break;
			case 3:
				viewTask();
				break;
			case 4:
				break;
			}
		}
			
	}
	
	private void viewTask() {
		// TODO Auto-generated method stub
		if(taskservice.countTask() != 0) {
				taskservice.showTask().forEach(task -> {
				System.out.println(task);
			});
		}
		else {
			System.out.println("No tasks scheduled for the day.");
		}
	}

	private void removeTask() {
		// TODO Auto-generated method stub
		System.out.println("Enter the description you want to delete");
		String myactivity = sc.nextLine();
		Boolean flag = taskservice.findByUsername(myactivity);
		if(flag == true) {
			taskservice.deleteByActivity(myactivity);
			System.out.println("Task removed successfully.");
		}
		else {
			System.out.println("Error: Task not found.");
		}
		
	}
	private void addTask() {
		System.out.println("Enter the description:");
		String newactivit = sc.nextLine();
		
		//START TIME
		//Exception handling mechanism for incorrect time
		try {
			System.out.println("Enter the start time");
			String newstart = sc.nextLine();
		    timeStart = LocalTime.parse(newstart, timeFormatter);
		}
		catch (DateTimeParseException e){
			System.out.println("Error: Invalid time format.");
		}
		
		//END TIME
		//Exception handling mechanism for incorrect time
		try {
			System.out.println("Enter the end time");
			String newend = sc.nextLine();
			timeEnd = LocalTime.parse(newend, timeFormatter);
			
		}
		catch (DateTimeParseException e){
			System.out.println("Error: Invalid time format.");
		}
		
		System.out.println("Enter the priority");
		String newpriority = sc.nextLine();
		
		if(timeStart != null && timeEnd !=null) {
			taskservice.addnewTask(newactivit, timeStart, timeEnd, newpriority);
			System.out.println("Task added successfully. No conflicts.");
		}
	}

}
