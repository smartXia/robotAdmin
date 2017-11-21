package com.neusoft.service;

import java.util.List;

import com.neusoft.po.Topic;

public interface ITopicService {
	public List<Topic> topicList(int startRow);
	public int allcount();
	public int addTopic(Topic topic);

	public int delTopic(Topic topic);

	public int updateTopic(Topic topic);

	public Topic findByOne(Topic topic);
}
