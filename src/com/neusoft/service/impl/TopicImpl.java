package com.neusoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.mapper.TopicMapper;
import com.neusoft.po.Topic;
import com.neusoft.po.TopicExample;
import com.neusoft.service.ITopicService;

@Service
public class TopicImpl implements ITopicService {
	@Autowired
	TopicMapper topicMapper;

	@Override
	public List<Topic> topicList(int startRow) {
		TopicExample example = new TopicExample();
		example.setPageSize(4);
		example.setStartRow(startRow);
		example.setOrderByClause("topic_id desc");
		return topicMapper.selectByExample(example);
	}

	@Override
	public int addTopic(Topic topic) {
		System.out.println(topic.getTopicImage());
		return topicMapper.insertSelective(topic);
	}

	@Override
	public int delTopic(Topic topic) {

		Integer topicId = topic.getTopicId();
		return topicMapper.deleteByPrimaryKey(topicId);
	}

	@Override
	public int updateTopic(Topic topic) {
		System.out.println(topic.getTopicId());
		/**
		 * 编号插入查询不到
		 */
		return topicMapper.updateByPrimaryKeySelective(topic);
	}

	@Override
	public Topic findByOne(Topic topic) {

		Integer topicId = topic.getTopicId();
		System.out.println("需要更新的id为" + topicId);
		return topicMapper.selectByPrimaryKey(topicId);

	}

	@Override
	public int allcount() {

		TopicExample example = new TopicExample();
		return topicMapper.countByExample(example);
	}

}
