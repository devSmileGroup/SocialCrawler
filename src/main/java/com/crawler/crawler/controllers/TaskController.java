package com.crawler.crawler.controllers;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crawler.crawler.models.Task;
import com.crawler.crawler.services.TaskService;

@RestController
@RequestMapping("/tasks")
public class TaskController {

	@Autowired
	private TaskService taskService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Task> read(@PathVariable("id") ObjectId id) {
		// Not yet implemented
		return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON_UTF8).body(null);
	}
	
	@PostMapping
	public ResponseEntity<ObjectId> create(@RequestBody Task task) {
		taskService.create(null);
		return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON_UTF8).body(null);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<ObjectId> delete(@PathVariable ObjectId id){
		// Not yet implemented
		return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON_UTF8).body(null);
	}

}
