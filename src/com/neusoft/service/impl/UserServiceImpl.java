package com.neusoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.mapper.UsersMapper;
import com.neusoft.po.Users;
import com.neusoft.po.UsersExample;
import com.neusoft.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	UsersMapper usersMapper;

	@Override
	public int addUserInfo(Users user) {
		System.out.println("插入信息");
		return usersMapper.insertSelective(user);
	}

	/**
	 * 所有的用户查询
	 */
	@Override
	public List<Users> userInfoList(int startRow) {
		UsersExample example = new UsersExample();
		example.setPageSize(5);
		example.setStartRow(startRow);
		return usersMapper.selectByExample(example);
	}

	@Override
	public int delUserInfo(Users users) {
		int userId = users.getUserId();

		return usersMapper.deleteByPrimaryKey(userId);
	}

	@Override
	public int updateUserInfo(Users users) {

		return usersMapper.updateByPrimaryKeySelective(users);
	}

	@Override
	public Users selectById(Users users) {
		users = usersMapper.selectByPrimaryKey(users.getUserId());
		return users;
	}

	@Override
	public List<Users> selectByName(String userName) {

		UsersExample example = new UsersExample();
		example.or().andUserNameEqualTo(userName);
		return usersMapper.selectByExample(example);
	}

	@Override
	public int allcount() {
		// TODO Auto-generated method stub

		UsersExample example = new UsersExample();
		return usersMapper.countByExample(example);
	}
}
