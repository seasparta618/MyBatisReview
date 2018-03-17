package past.project.mybatisReview.mapper;

import java.util.List;

import past.project.mybatisReview.pojo.UserOrder;

public interface UserOrderMapper {
	
	public UserOrder findOrderById(Integer orderId);
	
	public List<UserOrder> selectUserOrders();
	

}
