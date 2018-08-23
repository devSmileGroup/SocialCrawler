package com.crawler.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.crawler.models.Category;
import com.crawler.models.Post;

@Service
public class TwitterCrawler  implements ICrawler{

	@Override
	public List<Post> getPosts(String hashtag, LocalDateTime from, LocalDateTime to) {
		// TODO
		return null;
	}

	@Override
	public Category getCategory() {
		return Category.TWITTER;
	}
}
