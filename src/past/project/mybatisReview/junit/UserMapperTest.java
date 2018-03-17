package past.project.mybatisReview.junit;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import past.project.mybatisReview.mapper.UserMapper;
import past.project.mybatisReview.pojo.QueryVo;
import past.project.mybatisReview.pojo.User;

public class UserMapperTest {

//	@Test
//	public void testMapper() throws Exception {
//		String resource = "sqlMapConfig.xml";
//
//		InputStream is = Resources.getResourceAsStream(resource);
//		// create sql session factory
//		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
//		// create sql session
//		SqlSession sqlSession = sqlSessionFactory.openSession();
//		// SqlSession will initialize automatically based on the interface
//		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//		User user = userMapper.findUserById(10);
//		System.out.println(user);
//
//	}
//
//	@Test
//	public void testMapperQueryVo() throws Exception {
//		String resource = "sqlMapConfig.xml";
//
//		InputStream is = Resources.getResourceAsStream(resource);
//		// create sql session factory
//		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
//		// create sql session
//		SqlSession sqlSession = sqlSessionFactory.openSession();
//		// SqlSession will initialize automatically based on the interface
//		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//		User user = new User();
//		user.setUsername("sparta");
//		QueryVo qVo = new QueryVo();
//		qVo.setUser(user);
//		List<User> userList = userMapper.findUserByQueryVo(qVo);
//		for (User u : userList) {
//			System.out.println(u.toString());
//		}
//		System.out.println(userList.size());
//
//	}
//
//	@Test
//	public void testCountUser() throws Exception {
//		// ����resource�ļ�
//		String resource = "sqlMapConfig.xml";
//		// ����resource�ļ�������
//		InputStream is = Resources.getResourceAsStream(resource);
//		// ���������ļ������첢�ҿ�������
//		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
//		// ����session��������session
//		SqlSession sqlSession = sqlSessionFactory.openSession();
//		// ��session�еõ�mapper
//		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//		int countResult = userMapper.countUser();
//		System.out.println(countResult);
//	}
//
//	@Test
//	public void testFindUserBySexAndUserName() throws Exception {
//		// ����resource�ļ�
//		String resource = "sqlMapConfig.xml";
//		// ����resource�ļ�������
//		InputStream is = Resources.getResourceAsStream(resource);
//		// ���������ļ������첢�ҿ�������
//		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
//		// ����session��������session
//		SqlSession sqlSession = sqlSessionFactory.openSession();
//		// ��session�еõ�mapper
//		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//		User user = new User();
//		user.setUsername("seasparta");
//		user.setSex("male");
//		List<User> userList = userMapper.selectUserBySexAndUserName(user);
//		for(User u : userList){
//			System.out.println(u);
//		}
//	}
//	
//	@Test
//	public void selectUsersByIds() throws Exception {
//		// ����resource�ļ�
//		String resource = "sqlMapConfig.xml";
//		// ����resource�ļ�������
//		InputStream is = Resources.getResourceAsStream(resource);
//		// ���������ļ������첢�ҿ�������
//		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
//		// ����session��������session
//		SqlSession sqlSession = sqlSessionFactory.openSession();
//		// ��session�еõ�mapper
//		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//		List<Integer> idList = new ArrayList<Integer>();
//		QueryVo qVo = new QueryVo();
//		idList.add(1);
//		idList.add(10);
//		idList.add(16);
//		idList.add(22);
//		qVo.setIdList(idList);
//		List<User> userList = userMapper.selectUsersByIds(qVo);
//		for(User u : userList){
//			System.out.println(u);
//		}
//	}
	
	@Test
	public void selectUsersWithOrders() throws Exception {
		// ����resource�ļ�
		String resource = "sqlMapConfig.xml";
		// ����resource�ļ�������
		InputStream is = Resources.getResourceAsStream(resource);
		// ���������ļ������첢�ҿ�������
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		// ����session��������session
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// ��session�еõ�mapper
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		List<User> userList = userMapper.selectUsersWithOrders();
		for(User u : userList){
			u.printUserWithOrders();
		}
	}
}
