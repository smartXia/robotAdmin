package com.neusoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.mapper.RobotTypeMapper;
import com.neusoft.po.RobotType;
import com.neusoft.po.RobotTypeExample;
import com.neusoft.service.IRobotTypeService;

@Service
public class RobotTypeImpl implements IRobotTypeService {
	@Autowired
	RobotTypeMapper robotTypeMapper;

	@Override
	public int addRobotType(RobotType robotType) {
		// TODO Auto-generated method stub
		return robotTypeMapper.insertSelective(robotType);
	}

	@Override
	public List<RobotType> RobotTypeList() {
		RobotTypeExample example = new RobotTypeExample();

		return robotTypeMapper.selectByExample(example);
	}

	@Override
	public int delRobotType(RobotType robotType) {

		Integer typeId = robotType.getTypeId();
		return robotTypeMapper.deleteByPrimaryKey(typeId);
	}

	@Override
	public int updateRobotType(RobotType robotType) {
		// TODO Auto-generated method stub
		return robotTypeMapper.updateByPrimaryKeySelective(robotType);
	}

}
