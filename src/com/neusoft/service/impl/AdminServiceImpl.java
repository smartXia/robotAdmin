package com.neusoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.mapper.AdminMapper;
import com.neusoft.po.Admin;
import com.neusoft.po.AdminExample;
import com.neusoft.service.IAdminService;

@Service
public class AdminServiceImpl implements IAdminService {
	@Autowired
	AdminMapper adminMapper;

	public Admin loginbyadmin(Admin admin) {
		return adminMapper.loginbyadmin(admin);

	}

	@Override
	public List<Admin> adminInfo(Admin admin) {

		AdminExample example = new AdminExample();
		return adminMapper.selectByExample(example);
	}

	@Override
	public Admin admininfo(Admin admin) {
		Integer adminId = admin.getAdminId();
		return adminMapper.selectByPrimaryKey(adminId);
	}

	@Override
	public int updateByPrimaryKeySelective(Admin admin) {

		return adminMapper.updateByPrimaryKeySelective(admin);
	}

}
