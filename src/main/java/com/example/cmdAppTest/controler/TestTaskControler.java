package com.example.cmdAppTest.controler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cmdAppTest.entity.TestTaskEntity;
import com.example.cmdAppTest.service.TestTaskService;
import com.example.dto.CreateTaskDTO;

@RestController
@RequestMapping("/tasks")
public class TestTaskControler {
	
	@Autowired
	TestTaskService testTaskService;
	@Autowired
	CreateTaskDTO createTaskDTO;

	@GetMapping("")
	public ResponseEntity<List<TestTaskEntity>> getTasks(){
		var tasks = testTaskService.getTasks();
		
		return ResponseEntity.ok(tasks);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<TestTaskEntity> getTaskById(int id){
		var task = testTaskService.getTaskById(id);
		if(task==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(task);
	}
	
	@PostMapping("")
	public ResponseEntity<TestTaskEntity> addTask(@RequestBody CreateTaskDTO body){
		
		var task = testTaskService.addTask(body.getTitle(), body.getDescription(), body.getDeadline());
		
		return ResponseEntity.ok(task);
	}
}
