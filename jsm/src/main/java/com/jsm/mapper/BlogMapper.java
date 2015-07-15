package com.jsm.mapper;

import com.jsm.entity.Blog;

public interface BlogMapper {
	Blog selectBlog(Long id);
	void addBlog(Blog blog);
}
