package com.neusoft.service;

import java.util.List;

import com.neusoft.po.Orders;

public interface IOrderService {
	public List<Orders> orderdetail(Long detailId);

	public void update(Long water);
}
