package com.example.Astronaut.planner;

import org.springframework.context.ApplicationEvent;

@SuppressWarnings("serial")
public class TaskConflictEvent extends ApplicationEvent {
	
	
    
	private final TaskFactory conflictedTask;
	public TaskConflictEvent(Object source,TaskFactory conflictedTask) {
		super(source);
		this.conflictedTask = conflictedTask;
		// TODO Auto-generated constructor stub
	}
	
	public TaskFactory getTask() {
		return conflictedTask;
	}

}
