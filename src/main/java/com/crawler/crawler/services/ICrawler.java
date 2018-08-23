package com.crawler.crawler.services;

import java.time.LocalDateTime;
import java.util.List;

import com.crawler.crawler.models.Category;
import com.crawler.crawler.models.Post;

public interface ICrawler {
	List<Post> getPosts(String hashtag, LocalDateTime from, LocalDateTime to);
	Category getCategory();
}
