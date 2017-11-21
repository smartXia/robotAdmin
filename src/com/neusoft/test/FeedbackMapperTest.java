package com.neusoft.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.neusoft.mapper.AdminMapper;
import com.neusoft.mapper.FeedbackMapper;
import com.neusoft.po.Feedback;
import com.neusoft.po.FeedbackExample;

public class FeedbackMapperTest {
	private ApplicationContext applicationContext;
	private FeedbackMapper feedbackMapper;

	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext(
				"classpath:spring/applicationContext-dao.xml");
		feedbackMapper = (FeedbackMapper) applicationContext
				.getBean("feedbackMapper");
	}

	@Test
	public void testCountByExample() {

		FeedbackExample example = new FeedbackExample();
		example.setPageSize(2);
		example.setStartRow(4);
		List<Feedback> list = feedbackMapper.selectByExample(example);
		for (Feedback feedback : list) {

			System.out.print(feedback.getAnswer());
		}
	}

	@Test
	public void testDeleteByExample() {
		FeedbackExample example = new FeedbackExample();

		System.out.println(feedbackMapper.countByExample(example));
	}

	@Test
	public void testDeleteByPrimaryKey() {
		fail("Not yet implemented");
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
