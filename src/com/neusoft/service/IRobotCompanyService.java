package com.neusoft.service;

import java.util.List;

import com.neusoft.po.RobotCompany;

public interface IRobotCompanyService {
	public int addRobotCompany(RobotCompany robotCompany);

	public List<RobotCompany> robotCompanyList();

	public int delrobotCompany(RobotCompany robotCompany);

	public int updaterobotCompany(RobotCompany robotCompany);
}
