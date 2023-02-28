package com.example.cmdAppTest.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.cmdAppTest.entity.TestTaskEntity;
@Service
//@Repository
public class TestTaskService {
	
	
//	@Autowired
//	TestTaskEntity testTaskEntity;
//	
	 private ArrayList<TestTaskEntity> tasks = new ArrayList<>();
	 private int taskId = 1;
	 private final SimpleDateFormat deadlineFormatter = new SimpleDateFormat("yyyy-MM-dd");
	 
	 public TestTaskEntity addTask(String title, String description, String deadline) throws ParseException {
		 
		 TestTaskEntity test=new TestTaskEntity();
		 test.setId(taskId);
		 test.setTitle(title);
		 test.setDescription(description);
		 test.setDeadline(deadlineFormatter.parse(deadline));
		 test.setCompleted(false);
		 tasks.add(test);
		 taskId++;
		 
		 return test;
	 }
	
	public ArrayList<TestTaskEntity> getTasks(){
		return tasks;
	}
	
	
	public TestTaskEntity getTaskById(int id) {
		for(TestTaskEntity tte : tasks) {
			if(tte.getId() == id) {
				return tte;
			}
		}
		return null;
	}

}
