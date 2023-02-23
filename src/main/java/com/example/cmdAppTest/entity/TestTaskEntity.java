package com.example.cmdAppTest.entity;

import java.util.Date;

//import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TestTaskEntity {
	
	
	   public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	private int id;
	   private String title;
	   private String description;
	   private Date deadline;
	   private boolean completed;

}
