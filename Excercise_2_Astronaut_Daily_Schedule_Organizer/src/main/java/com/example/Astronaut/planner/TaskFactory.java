package com.example.Astronaut.planner;

import java.time.LocalTime;

import org.springframework.stereotype.Component;




public class TaskFactory {
	
	private String description;
	private LocalTime start;
	private LocalTime end;
	private String priority;
	
	public TaskFactory(String description, LocalTime start, LocalTime end, String priority) {
		super();
		this.description = description;
		this.start = start;
		this.end = end;
		this.priority = priority;
	}
	
	public String getActivity() {
		return description;
	}
	public void setActivity(String description) {
		this.description = description;
	}
	
	public LocalTime getStart() {
		return start;
	}
	public void setStart(LocalTime start) {
		this.start = start;
	}
	
	public LocalTime getEnd() {
		return end;
	}
	public void setEnd(LocalTime end) {
		this.end = end;
	}
	
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	
	@Override
	public String toString() {
		return "Task [description=" + description + ", start=" + start + ", end=" + end + ", priority="
				+ priority + "]";
	}
	
	
	
}
