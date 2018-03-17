package past.project.mybatisReview.mapper;

import past.project.mybatisReview.pojo.UserOrder;

public interface UserOrderMapper {
	
	public UserOrder findOrderById(Integer orderId);

}
