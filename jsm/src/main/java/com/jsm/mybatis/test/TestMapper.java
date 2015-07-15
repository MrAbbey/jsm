package com.jsm.mybatis.test;
import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.jsm.entity.Blog;
public class TestMapper {
	public static void main(String[] args) {
		String resource = "mybatis-config.xml";
		InputStream inputStream;
		SqlSessionFactory sqlSessionFactory;
		SqlSession session = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			session = sqlSessionFactory.openSession();
			Blog blog = (Blog) session.selectOne("com.jsm.mapper.BlogMapper.selectBlog", 101);
			System.out.println(blog);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(session != null)
				session.close();
		}
	}
}
