package com.jsm.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.transaction.annotation.Transactional;

import com.jsm.dao.UserDao;
import com.jsm.entity.Blog;

public class UserDaoImpl implements UserDao {
	
	private SqlSession sqlSession;
	
	public SqlSession getSqlSession() {
		return sqlSession;
	}

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public void addBlog(Blog blog) {
		sqlSession.insert("com.jsm.mapper.BlogMapper.addBlog", blog);
	}
}
