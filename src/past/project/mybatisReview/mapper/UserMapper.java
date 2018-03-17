package past.project.mybatisReview.mapper;

import java.util.List;

import past.project.mybatisReview.pojo.QueryVo;
import past.project.mybatisReview.pojo.User;

public interface UserMapper {
	
	//follow 4 rules of mapper definition
	//interface name show be as same as the id in .xml file
	//return value should be as same as the resultType in .xml file
	//parameter should be as same as the parameter in .xml file
	//binding with the xml file
	public User findUserById(Integer userId);
	
	public List<User> findUserByQueryVo(QueryVo qVo);
	
	public Integer countUser();
	
	public List<User> selectUserBySexAndUserName(User user);
	
//	public List<User> selectUsersByIds(Integer[] ids);
//	
//	public List<User> selectUsersByIds(List<Integer> idList);
	
	public List<User> selectUsersByIds(QueryVo qVo);
}
