package com.neusoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.mapper.NewsAuthorMapper;
import com.neusoft.po.NewsAuthor;
import com.neusoft.po.NewsAuthorExample;
import com.neusoft.service.INewsAuthorService;

@Service
public class NewsAuthorImpl implements INewsAuthorService {
	@Autowired
	NewsAuthorMapper authorsMapper;

	@Override
	public List<NewsAuthor> findauhtorList() {
		NewsAuthorExample example = new NewsAuthorExample();
		example.or().andAuthorIdIsNotNull();
		System.out.println("进入service");
		return authorsMapper.selectByExample(example);
	}

	@Override
	public int newsAuthorDel(NewsAuthor newsAuthor) {
		int authorId = newsAuthor.getAuthorId();
		System.out.println("删除的id为" + authorId);
		return authorsMapper.deleteByPrimaryKey(authorId);
	}

	@Override
	public int updateByPrimaryKey(NewsAuthor newsAuthor) {
		return authorsMapper.updateByPrimaryKey(newsAuthor);
	}

	@Override
	public int newsAuthorAdd(NewsAuthor newsAuthor) {
		// TODO Auto-generated method stub
		return authorsMapper.insert(newsAuthor);
	}

}
