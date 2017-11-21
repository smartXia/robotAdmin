package com.neusoft.test;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.neusoft.mapper.AdminMapper;
import com.neusoft.po.Admin;
import com.neusoft.po.AdminExample;

public class AdminMapperTest {
	private ApplicationContext applicationContext;
	private AdminMapper adminMapper;

	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext(
				"classpath:spring/applicationContext-dao.xml");
		adminMapper = (AdminMapper) applicationContext.getBean("adminMapper");
	}

	@Test
	public void testCountByExample() {
		Admin admin = new Admin();
		admin.setAdminName("admin");
		admin.setAdminPwd("123");
		admin = adminMapper.loginbyadmin(admin);
		System.out.println(admin);
	}

	@Test
	public void testDeleteByExample() {
		Admin admin = new Admin();
		admin.setAdminName("xia");
		AdminExample example = new AdminExample();
		example.or().andAdminNameEqualTo("xia");

	}

	@Test
	public void testDeleteByPrimaryKey() {
		Admin record = new Admin();
		record.setAdminId(1);
		record.setAdminPwd("12345");
		adminMapper.updateByPrimaryKeySelective(record);
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
	public void testLoginbyadmin() {
		fail("Not yet implemented");
	}

}
