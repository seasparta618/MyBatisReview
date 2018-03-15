package past.project.mybatisReview.junit;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import past.project.mybatisReview.pojo.User;

public class MyBatisUnitTestUser {

	@Test
	public void testMyBatisTest1() throws Exception {

		// loading the core mybatis xml config
		String resource = "sqlMapConfig.xml";

		InputStream is = Resources.getResourceAsStream(resource);
		// create sql session factory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		// create sql session
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// executing sql query
		User user = sqlSession.selectOne("test.findUserById", 10);
		
		System.out.println(user);

	}

}
