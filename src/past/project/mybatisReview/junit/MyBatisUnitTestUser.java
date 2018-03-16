package past.project.mybatisReview.junit;

import java.io.InputStream;
import java.sql.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import past.project.mybatisReview.pojo.User;

public class MyBatisUnitTestUser {

	// @Test
	// public void testFindUserById() throws Exception {
	//
	// // loading the core mybatis xml config
	// String resource = "sqlMapConfig.xml";
	//
	// InputStream is = Resources.getResourceAsStream(resource);
	// // create sql session factory
	// SqlSessionFactory sqlSessionFactory = new
	// SqlSessionFactoryBuilder().build(is);
	// // create sql session
	// SqlSession sqlSession = sqlSessionFactory.openSession();
	// // executing sql query
	// User user = sqlSession.selectOne("test.findUserById", 10);
	//
	// System.out.println(user);
	// }

	// @Test
	// public void testFindUserByName() throws Exception {
	//
	// String resource = "sqlMapConfig.xml";
	//
	// InputStream is = Resources.getResourceAsStream(resource);
	// // create sql session factory
	// SqlSessionFactory sqlSessionFactory = new
	// SqlSessionFactoryBuilder().build(is);
	// // create sql session
	// SqlSession sqlSession = sqlSessionFactory.openSession();
	// // executing sql query
	// List<User> userList = sqlSession.selectList("test.findUserByName", "Îå");
	// for(User user : userList){
	// System.out.println(user);
	// }
	// }

//	@Test
//	public void testAddUser() throws Exception {
//		String resource = "sqlMapConfig.xml";
//
//		InputStream is = Resources.getResourceAsStream(resource);
//		// create sql session factory
//		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
//		// create sql session
//		SqlSession sqlSession = sqlSessionFactory.openSession();
//		// executing sql query
//		User user = new User();
//		user.setUsername("seasparta");
//		user.setBirthday("2999-12-31");
//		user.setAddress("Australia");
//		user.setSex("male");
//		int result = sqlSession.insert("test.insertUser", user);
//		sqlSession.commit();
//		System.out.println(user.getId());
//	}
	
//	@Test
//	public void testUpdateUserById() throws Exception {
//		String resource = "sqlMapConfig.xml";
//
//		InputStream is = Resources.getResourceAsStream(resource);
//		// create sql session factory
//		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
//		// create sql session
//		SqlSession sqlSession = sqlSessionFactory.openSession();
//		// executing sql query
//		User user = new User();
//		user.setId(32);
//		user.setUsername("seasparta");
//		user.setBirthday("2999-12-31");
//		user.setAddress("Australia, Melbourne");
//		user.setSex("male");
//		int result = sqlSession.update("test.updateUserById", user);
//		sqlSession.commit();
//	}
	
	@Test
	public void testUpdateUserById() throws Exception {
		String resource = "sqlMapConfig.xml";

		InputStream is = Resources.getResourceAsStream(resource);
		// create sql session factory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		// create sql session
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// executing sql query
		User user = new User();
		user.setId(32);
		user.setUsername("seasparta");
		user.setBirthday("2999-12-31");
		user.setAddress("Australia, Melbourne");
		user.setSex("male");
		int result = sqlSession.update("test.deleteUserById", user.getId());
		sqlSession.commit();
	}
}
