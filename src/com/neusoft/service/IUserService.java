package com.neusoft.service;

import java.util.List;

import com.neusoft.po.Users;

public interface IUserService {
	/**
	 * 增
	 * 
	 * @param user
	 * @return
	 */
	public int addUserInfo(Users user);

	/**
	 * 查
	 * 
	 * @param user
	 * @return
	 */
	public List<Users> userInfoList(int startRow);

	/**
	 * 删除
	 * 
	 * @param user
	 * @return
	 */
	public int delUserInfo(Users users);

	/**
	 * 修改
	 * 
	 * @param user
	 * @return
	 */
	public int updateUserInfo(Users users);

	/*
	 * 单项查找
	 */
	public Users selectById(Users users);
	public int allcount();
	public List<Users> selectByName(String userName);
}
