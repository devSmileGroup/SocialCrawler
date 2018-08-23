package com.crawler.crawler.dao;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.crawler.crawler.models.Task;

@Repository
public interface TaskRepository extends MongoRepository<Task, ObjectId>{

}
