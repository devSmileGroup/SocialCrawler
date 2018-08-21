package com.crawler.crawler.models;

import java.time.LocalDateTime;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import lombok.Data;

@Data
@Document(collection="tasks")
public class Task {

	@Id
	@JsonSerialize(using = ToStringSerializer.class)
	private ObjectId id;

	private List<String> hashtags;

	private Category category;

	private LocalDateTime from;

	private LocalDateTime to;

	private TaskStatus status;

	@CreatedDate
	@Field("created_date")
	private LocalDateTime createdDate;
	
	@LastModifiedDate
	@Field("modified_date")
	private LocalDateTime modifiedDate;

}
