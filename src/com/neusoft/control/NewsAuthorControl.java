package com.neusoft.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neusoft.po.NewsAuthor;
import com.neusoft.service.INewsAuthorService;

@Controller
@RequestMapping("/author")
public class NewsAuthorControl {
	@Autowired
	INewsAuthorService authorService;

	@RequestMapping("findAuthorList")
	public String newsAuthorsList(Model model) {
		List<NewsAuthor> newsAuthorList = authorService.findauhtorList();
		for (NewsAuthor newsAuthor : newsAuthorList) {
			System.out.println(newsAuthor.getAuthorName());
		}
		System.out.println("新增作者");
		model.addAttribute("newsAuthorList", newsAuthorList);

		return "manageNewsAuthor";
	}

	@RequestMapping("newsAuthorDel")
	public String newsAuthorDel(Model model, NewsAuthor newsAuthor) {
		// 删除操作
		authorService.newsAuthorDel(newsAuthor);
		// 删除后再将其中所有的值传回来//????????Ajax自动传值
		this.newsAuthorsList(model);
		return this.newsAuthorsList(model);
	}

	@RequestMapping("newsAuthorUpdate")
	public String newsAuthorUpdate(Model model, NewsAuthor newsAuthor) {
		// 更新操作
		System.out.println(newsAuthor.getAuthorName());
		authorService.updateByPrimaryKey(newsAuthor);
		// 将其中所有的值传回来//????????Ajax自动传值
		this.newsAuthorsList(model);
		return this.newsAuthorsList(model);
	}

	@RequestMapping("newsAuthorAdd")
	public String newsAuthorAdd(Model model, NewsAuthor newsAuthor) {
		System.out.println(newsAuthor.getAuthorName());
		authorService.newsAuthorAdd(newsAuthor);
		// 将其中所有的值传回来//????????Ajax自动传值
		return this.newsAuthorsList(model);
	}
}
