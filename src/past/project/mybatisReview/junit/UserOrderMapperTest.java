package past.project.mybatisReview.junit;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import past.project.mybatisReview.mapper.UserOrderMapper;
import past.project.mybatisReview.pojo.UserOrder;

public class UserOrderMapperTest {

	@Test
	public void testUserOrderById() throws Exception {
		String resource = "sqlMapConfig.xml";

		InputStream is = Resources.getResourceAsStream(resource);
		// create sql session factory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		// create sql session
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// SqlSession will initialize automatically based on the interface
		UserOrderMapper orderMapper = sqlSession.getMapper(UserOrderMapper.class);
		UserOrder order = orderMapper.findOrderById(3);
		System.out.println(order);

	}
}
