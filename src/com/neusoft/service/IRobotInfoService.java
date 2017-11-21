package com.neusoft.service;

import java.util.List;

import com.neusoft.po.RobotInfo;

public interface IRobotInfoService {
	public List<RobotInfo> robotInfoList(int startRow);
	public int allcount();
	public List<RobotInfo> robotInfodetailList();

	/*
	 * 根据id删除
	 */
	public int deleteByExample(RobotInfo robotInfo);

	/*
	 * 根据对象查找更新RobotInfo
	 */
	public RobotInfo findRobotByone(RobotInfo robotInfo);

	/*
	 * 新增RobotInfo
	 */
	public int insertRobotInfo(RobotInfo RobotInfo);

	public int updateRobotInfo(RobotInfo robotInfo);

}
