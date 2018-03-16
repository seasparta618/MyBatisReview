package past.project.mybatisReview.junit;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import past.project.mybatisReview.dao.UserDao;
import past.project.mybatisReview.dao.impl.UserDaoImpl;
import past.project.mybatisReview.pojo.User;

public class UserDaoTest {

	private SqlSessionFactory sqlSessionFactory;

	@Before
	public void before() throws Exception {
		String resource = "sqlMapConfig.xml";

		InputStream is = Resources.getResourceAsStream(resource);
		// create sql session factory
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
	}

	@Test
	public void testFindUserById() throws Exception {
		UserDao userDao = new UserDaoImpl(sqlSessionFactory);
		User user = userDao.selectUserById(10);
		System.out.println(user.toString());

	}

}
