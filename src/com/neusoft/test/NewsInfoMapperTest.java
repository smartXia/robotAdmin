package com.neusoft.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.neusoft.mapper.AdminMapper;
import com.neusoft.mapper.NewsInfoMapper;
import com.neusoft.po.NewsInfo;
import com.neusoft.po.NewsInfoExample;

public class NewsInfoMapperTest {
	private ApplicationContext applicationContext;
	private NewsInfoMapper newsInfoMapper;

	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext(
				"classpath:spring/applicationContext-dao.xml");
		newsInfoMapper = (NewsInfoMapper) applicationContext
				.getBean("newsInfoMapper");
	}

	@Test
	public void testCountByExample() {
		NewsInfoExample example = new NewsInfoExample();
		System.out.println(newsInfoMapper.countByExample(example));
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

	@Test
	public void testFindNewsInfoList() {
		newsInfoMapper.showNewsinfodetailList();
	}

}
