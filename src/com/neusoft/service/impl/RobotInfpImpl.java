package com.neusoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.mapper.RobotInfoMapper;

import com.neusoft.po.RobotInfo;
import com.neusoft.po.RobotInfoExample;
import com.neusoft.service.IRobotInfoService;

@Service
public class RobotInfpImpl implements IRobotInfoService {
	@Autowired
	RobotInfoMapper robotInfoMapper;

	// 机器人展示页面
	@Override
	public List<RobotInfo> robotInfoList(int startRow) {
		RobotInfoExample example = new RobotInfoExample();
		// 将每页中的大小赋值
		example.setPageSize(6);
		example.setStartRow(startRow);
		example.setOrderByClause("robot_id desc");
		return robotInfoMapper.selectByExample(example);
	}

	@Override
	public List<RobotInfo> robotInfodetailList() {

		return null;
	}

	@Override
	public int deleteByExample(RobotInfo robotInfo) {
		Integer robotId = robotInfo.getRobotId();
		return robotInfoMapper.deleteByPrimaryKey(robotId);

	}

	@Override
	public RobotInfo findRobotByone(RobotInfo robotInfo) {
		Integer robotId = robotInfo.getRobotId();
		return robotInfoMapper.selectByPrimaryKey(robotId);
	}

	@Override
	public int insertRobotInfo(RobotInfo robotInfo) {
		System.out.println("添加产品信息");
		return robotInfoMapper.insertSelective(robotInfo);
	}

	@Override
	public int updateRobotInfo(RobotInfo robotInfo) {
		System.out.println("更新的业务逻辑");
		return robotInfoMapper.updateByPrimaryKeySelective(robotInfo);
	}

	@Override
	public int allcount() {
		// 计算总条数
		RobotInfoExample example = new RobotInfoExample();
		return robotInfoMapper.countByExample(example);
	}

}
