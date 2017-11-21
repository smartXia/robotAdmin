package com.neusoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.mapper.OrdersMapper;
import com.neusoft.po.Orders;
import com.neusoft.po.OrdersExample;
import com.neusoft.service.IOrderService;

@Service
public class OrderdetailImpl implements IOrderService {
	@Autowired
	OrdersMapper ordersMapper;

	@Override
	public List<Orders> orderdetail(Long detailId) {
		OrdersExample example = new OrdersExample();
		example.or().andWaterEqualTo(detailId);
		return ordersMapper.selectByExample(example);
	}

	@Override
	public void update(Long water) {
		Orders record = new Orders();
		record.setOrderState("已发货");
		OrdersExample example = new OrdersExample();
		example.or().andWaterEqualTo(water);
		ordersMapper.updateByExampleSelective(record, example);

	}
}
