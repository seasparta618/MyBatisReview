package past.project.mybatisReview.junit;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import past.project.mybatisReview.mapper.UserMapper;
import past.project.mybatisReview.pojo.User;

public class UserMapperTest {

	@Test
	public void testMapper() throws Exception {
		String resource = "sqlMapConfig.xml";

		InputStream is = Resources.getResourceAsStream(resource);
		// create sql session factory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		// create sql session
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//SqlSession will initialize automatically based on the interface
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		User user = userMapper.findUserById(10);
		System.out.println(user);
		
	}
}
