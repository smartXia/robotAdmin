package com.neusoft.service;

import java.util.List;

import com.neusoft.po.RobotType;

public interface IRobotTypeService {
	public int addRobotType(RobotType robotType);

	/**
	 * 查
	 * 
	 * @param robotType
	 * @return
	 */
	public List<RobotType> RobotTypeList();

	/**
	 * 删除
	 * 
	 * @param robotType
	 * @return
	 */
	public int delRobotType(RobotType robotType);

	/**
	 * 修改
	 * 
	 * @param robotType
	 * @return
	 */
	public int updateRobotType(RobotType robotType);
	
}
