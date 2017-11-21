package com.neusoft.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.neusoft.mapper.NewsInfoMapper;
import com.neusoft.mapper.RobotInfoMapper;
import com.neusoft.po.RobotInfo;
import com.neusoft.po.RobotInfoExample;

public class RobotInfoMapperTest {
	private ApplicationContext applicationContext;
	private RobotInfoMapper robotInfoMapper;

	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext(
				"classpath:spring/applicationContext-dao.xml");
		robotInfoMapper = (RobotInfoMapper) applicationContext
				.getBean("robotInfoMapper");
	}

	@Test
	public void testCountByExample() {
		RobotInfoExample example = new RobotInfoExample();
		List<RobotInfo> robot = robotInfoMapper.selectByExample(example);
		for (RobotInfo robotInfo : robot) {
			System.out.println(robotInfo.toString());
		}
	}

	@Test
	public void testDeleteByExample() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteByPrimaryKey() {
		RobotInfo robotInfo = new RobotInfo();
		robotInfo.setRobotId(4);
		robotInfo.setRobotImage("images/menu_bg.jpg");

		robotInfoMapper.insertSelective(robotInfo);
	}

	@Test
	public void testInsert() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertSelective() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectByExample() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectByPrimaryKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByExampleSelective() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByExample() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByPrimaryKeySelective() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByPrimaryKey() {
		fail("Not yet implemented");
	}

}
