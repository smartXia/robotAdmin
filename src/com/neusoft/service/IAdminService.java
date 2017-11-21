package com.neusoft.service;

import java.util.List;

import com.neusoft.po.Admin;

public interface IAdminService {
	public Admin loginbyadmin(Admin admin);

	public Admin admininfo(Admin admin);

	public List<Admin> adminInfo(Admin admin);

	public int updateByPrimaryKeySelective(Admin admin);
}
