package past.project.mybatisReview.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import past.project.mybatisReview.dao.UserDao;
import past.project.mybatisReview.pojo.User;

public class UserDaoImpl implements UserDao {

	// Factory injection
	private SqlSessionFactory sqlSessionFactory;

	public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}

	// find the user throw user id
	public User selectUserById(Integer userId) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		return sqlSession.selectOne("test.findUserById", userId);

	}
}
