package com.crawler.dao;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.crawler.models.Task;

@Repository
public interface TaskRepository extends MongoRepository<Task, ObjectId>{

}
