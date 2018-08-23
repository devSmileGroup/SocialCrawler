package com.crawler.services;

import java.time.LocalDateTime;
import java.util.List;

import com.crawler.models.Category;
import com.crawler.models.Post;

public interface ICrawler {
	List<Post> getPosts(String hashtag, LocalDateTime from, LocalDateTime to);
	Category getCategory();
}
