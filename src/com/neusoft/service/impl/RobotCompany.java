package com.neusoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.mapper.RobotCompanyMapper;
import com.neusoft.po.RobotCompanyExample;
import com.neusoft.service.IRobotCompanyService;

@Service
public class RobotCompany implements IRobotCompanyService {
	@Autowired
	RobotCompanyMapper companyMapper;

	@Override
	public int addRobotCompany(com.neusoft.po.RobotCompany robotCompany) {

		return companyMapper.insertSelective(robotCompany);
	}

	@Override
	public int delrobotCompany(com.neusoft.po.RobotCompany robotCompany) {

		Integer companyId = robotCompany.getCompanyId();
		return companyMapper.deleteByPrimaryKey(companyId);
	}

	@Override
	public int updaterobotCompany(com.neusoft.po.RobotCompany robotCompany) {

		return companyMapper.updateByPrimaryKeySelective(robotCompany);
	}

	@Override
	public List<com.neusoft.po.RobotCompany> robotCompanyList() {

		RobotCompanyExample example = new RobotCompanyExample();
		return companyMapper.selectByExample(example);
	}

}
