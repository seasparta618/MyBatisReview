package past.project.mybatisReview.junit;

import java.io.InputStream;
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
	
	@Test
	public void testMapperQueryVo() throws Exception {
		String resource = "sqlMapConfig.xml";

		InputStream is = Resources.getResourceAsStream(resource);
		// create sql session factory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		// create sql session
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//SqlSession will initialize automatically based on the interface
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		User user = new User();
		user.setUsername("sparta");
		QueryVo qVo = new QueryVo();
		qVo.setUser(user);
		List<User> userList = userMapper.findUserByQueryVo(qVo);
		for(User u : userList){
			System.out.println(u.toString());
		}
		System.out.println(userList.size());
		
	}
	
	@Test
	public void testCountUser() throws Exception{
		//����resource�ļ�
		String resource = "sqlMapConfig.xml";
		//����resource�ļ�������
		InputStream is = Resources.getResourceAsStream(resource);
		//���������ļ������첢�ҿ�������
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		//����session��������session
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//��session�еõ�mapper
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		int countResult = userMapper.countUser();
		System.out.println(countResult);
	}
}
