package com.neusoft.service;

import java.util.List;

import com.neusoft.po.NewsType;

public interface INewsTypeService {
	public List<NewsType> findTypeList();

	public int newsTypeAdd(NewsType newsType);

	public int newsTypeDel(NewsType newsType);

	public int newsTypeUpdate(NewsType newsType);

}
