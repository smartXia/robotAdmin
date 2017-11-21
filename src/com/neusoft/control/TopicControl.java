package com.neusoft.control;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neusoft.po.Topic;
import com.neusoft.service.ITopicService;

@Controller
@RequestMapping("/topic")
public class TopicControl {
	@Autowired
	ITopicService iTopicService;

	@RequestMapping("topicList")
	public String topicList(Model model, HttpSession session, Integer pageNo,
			Topic topic) {
		int pageNums;// 页码最大值
		int newsNums = iTopicService.allcount();
		if (newsNums % 6 == 0) {
			pageNums = newsNums / 6;
		} else {
			pageNums = newsNums / 6 + 1;
		}
		session.setAttribute("pageNums", pageNums);
		if (pageNo != null) {
			List<Topic> topicList = iTopicService.topicList((pageNo - 1) * 6);
			session.setAttribute("topicList", topicList);
			session.setAttribute("pageNo", pageNo);
		} else {
			List<Topic> topicList = iTopicService.topicList(0);
			session.setAttribute("topicList", topicList);
			session.setAttribute("pageNo", 1);
		}

		return "topic/topicList";
	}

	@RequestMapping("/addTopic")
	public String addTopic(Model model, Topic topic,
			HttpServletRequest request, Integer pageNo, HttpSession session)
			throws IllegalStateException, IOException {
		String sqlPath = null;
		// 定义文件保存的本地路径
		String localPath = "E:\\File\\";
		// 定义 文件名
		String filename = null;
		if (!topic.getFile().isEmpty()) {
			// 生成uuid作为文件名称
			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			// 获得文件类型（可以判断如果不是图片，禁止上传）
			String contentType = topic.getFile().getContentType();
			// 获得文件后缀名
			String suffixName = contentType
					.substring(contentType.indexOf("/") + 1);
			// 得到 文件名
			filename = uuid + "." + suffixName;
			System.out.println(filename);
			// 文件保存路径
			topic.getFile().transferTo(new File(localPath + filename));
		}
		// 把图片的相对路径保存至数据库
		sqlPath = "/images/" + filename;
		topic.setTopicImage(sqlPath);
		System.out.println(topic.getTopicImage());
		iTopicService.addTopic(topic);
		System.out.println("添加成功");
		return this.topicList(model, session, pageNo, topic);
	}

	@RequestMapping("delTopic")
	public String delTopic(Model model, Topic topic, Integer pageNo,
			HttpSession session) {
		iTopicService.delTopic(topic);
		System.out.println("删除成功");
		return this.topicList(model, session, pageNo, topic);
	}

	@RequestMapping("updateTopic")
	public String updateTopic(Model model, Topic topic, Integer pageNo,
			HttpSession session) {
		topic = iTopicService.findByOne(topic);
		model.addAttribute("topic", topic);
		System.out.println("查询成功");
		return "topic/updateTopic";
	}

	@RequestMapping("updateTopicAfter")
	public String updateTopicAfter(Model model, Topic topic,
			HttpSession session, Integer pageNo) throws IllegalStateException,
			IOException {

		String sqlPath = "";
		// 定义文件保存的本地路径
		String localPath = "E:\\File\\";
		// 定义 文件名
		String filename = "topic";
		if (!topic.getFile().isEmpty()) {
			// 生成uuid作为文件名称
			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			// 获得文件类型（可以判断如果不是图片，禁止上传）
			String contentType = topic.getFile().getContentType();
			// 获得文件后缀名
			String suffixName = contentType
					.substring(contentType.indexOf("/") + 1);
			// 得到 文件名
			filename = uuid + "." + suffixName;
			System.out.println(filename);
			// 文件保存路径
			topic.getFile().transferTo(new File(localPath + filename));
		}
		// 把图片的相对路径保存至数据库
		sqlPath = "/images/" + filename;
		topic.setTopicImage(sqlPath);
		System.out.println(topic.getTopicImage());

		iTopicService.updateTopic(topic);
		System.out.println("更新成功");
		return this.topicList(model, session, pageNo, topic);
	}
}
