package past.project.mybatisReview.dao;

import past.project.mybatisReview.pojo.User;

public interface UserDao {
	public User selectUserById(Integer userId);
}
