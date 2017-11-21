package com.neusoft.service;

import java.util.List;

import com.neusoft.po.Orderdetails;

public interface IOrderDeatil {
	public List<Orderdetails> orderdetails(int startRow);

	public int allcount();

	public void update(Long water);

}
