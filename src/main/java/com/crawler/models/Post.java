package com.crawler.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;

@Data
public class Post {
	
	@Id
	@JsonSerialize(using = ToStringSerializer.class)
	private ObjectId id;

	private String hashtag;
	
	private String body;
	
	private Category category;
	
	@Field("task_id")
	private ObjectId taskId;

}
