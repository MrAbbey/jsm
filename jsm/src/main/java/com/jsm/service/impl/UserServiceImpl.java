package com.jsm.service.impl;
import org.springframework.transaction.annotation.Transactional;

import com.jsm.dao.UserDao;
import com.jsm.entity.Blog;
import com.jsm.service.UserService;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	/**
	 * ÊÂÎñµÄ²âÊÔ
	 */
	@Transactional
	public void addBlog() {
		Blog blog = new Blog();
		blog.setTitle("blog title1");
		blog.setContent("blog content1");
		userDao.addBlog(blog);
		Blog blog2 = new Blog();
		blog2.setTitle("blog2 title1");
		blog2.setContent("blog2 content1");
		userDao.addBlog(blog2);
	}

}
