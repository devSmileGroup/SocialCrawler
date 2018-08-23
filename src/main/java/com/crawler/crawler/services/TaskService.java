package com.crawler.crawler.services;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crawler.crawler.dao.TaskRepository;
import com.crawler.crawler.models.Task;

@Service
public class TaskService {
	
	@Autowired
	private TaskRepository taskRepository;

	@Autowired
	private List<ICrawler> crawlers;
	
	public ObjectId create(Task task) {
		// TODO
		return null;
	}
	
	public Task findById(ObjectId id) {
		// TODO
		return null;
	}
	
	public void deleteById(ObjectId id) {
		// TODO
	}
	
	
}
