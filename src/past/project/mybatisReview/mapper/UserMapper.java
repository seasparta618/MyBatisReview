package past.project.mybatisReview.mapper;

import past.project.mybatisReview.pojo.User;

public interface UserMapper {
	
	//follow 4 rules of mapper definition
	//interface name show be as same as the id in .xml file
	//return value should be as same as the resultType in .xml file
	//parameter should be as same as the parameter in .xml file
	//binding with the xml file
	public User findUserById(Integer userId);
	
	
	
}