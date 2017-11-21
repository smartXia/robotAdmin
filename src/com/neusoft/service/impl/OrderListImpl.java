package com.neusoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.mapper.OrderdetailsMapper;
import com.neusoft.po.Orderdetails;
import com.neusoft.po.OrderdetailsExample;
import com.neusoft.service.IOrderDeatil;

@Service
public class OrderListImpl implements IOrderDeatil {
	@Autowired
	OrderdetailsMapper orderdetailsMapper;

	/**
	 * 查询已经完成的订单
	 */
	@Override
	public List<Orderdetails> orderdetails(int startRow) {

		OrderdetailsExample example = new OrderdetailsExample();
		example.setPageSize(5);
		example.setStartRow(startRow);
		example.setOrderByClause("id desc");
		return orderdetailsMapper.selectByExample(example);
	}

	@Override
	public int allcount() {
		OrderdetailsExample example = new OrderdetailsExample();
		return orderdetailsMapper.countByExample(example);
	}

	@Override
	public void update(Long water) {
		Orderdetails record = new Orderdetails();
		record.setOrderStatu("已发货");
		OrderdetailsExample example = new OrderdetailsExample();
		example.or().andDetailIdEqualTo(water);
		orderdetailsMapper.updateByExampleSelective(record, example);

	}

}
