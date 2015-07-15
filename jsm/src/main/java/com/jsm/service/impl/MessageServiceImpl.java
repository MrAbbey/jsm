package com.jsm.service.impl;

import org.springframework.transaction.annotation.Transactional;

import com.jsm.entity.Blog;
import com.jsm.mapper.BlogMapper;
import com.jsm.service.MessageService;

public class MessageServiceImpl implements MessageService {
	
	private BlogMapper blogMapper;

	public String getMessage() {
		System.out.println("----------MessageServiceImpl   getMessage------------");
		Blog blog = blogMapper.selectBlog(101L);
		return "hello world!!!";
		
		
	}
	
	@Transactional
	public String addMessage() {
		System.out.println("----------MessageServiceImpl   getMessage------------");
		Blog blog = new Blog();
		blog.setTitle("test02");
		blog.setContent("test02");
		blogMapper.addBlog(blog);
		int i = 1/0;
		return "add success!!!";
	}

	public void setBlogMapper(BlogMapper blogMapper) {
		this.blogMapper = blogMapper;
	}
}
