package com.neusoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.mapper.NewsTypeMapper;
import com.neusoft.po.NewsType;
import com.neusoft.po.NewsTypeExample;
import com.neusoft.service.INewsTypeService;

@Service
public class NewsTypeImpl implements INewsTypeService {
	@Autowired
	NewsTypeMapper newsTypeMapper;

	public List<NewsType> findTypeList() {
		NewsTypeExample example = new NewsTypeExample();
		example.or().andTypeIdIsNotNull();
		// TODO Auto-generated method stub
		return newsTypeMapper.selectByExample(example);
	}

	public int newsTypeAdd(NewsType newsType) {
		System.out.println("进入插入种类的type中");
		return newsTypeMapper.insert(newsType);
	}

	public int newsTypeDel(NewsType newsType) {
		Integer typeId = newsType.getTypeId();
		System.out.println("进入删除种类的type中");
		return newsTypeMapper.deleteByPrimaryKey(typeId);
	}

	public int newsTypeUpdate(NewsType newsType) {
		// TODO Auto-generated method stub
		System.out.println("进入更新种类的type中");

		return newsTypeMapper.updateByPrimaryKey(newsType);
	}
}
