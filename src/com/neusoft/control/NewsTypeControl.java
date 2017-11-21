package com.neusoft.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neusoft.po.NewsType;
import com.neusoft.service.INewsTypeService;

@Controller
@RequestMapping("/newstype")
public class NewsTypeControl {
	@Autowired
	INewsTypeService iNewsTypeService;

	@RequestMapping("findTypeList")
	public String findTypeList(Model model) {
		List<NewsType> findTypeList = iNewsTypeService.findTypeList();
		model.addAttribute("findTypeList", findTypeList);
		System.out.println("查询成功");
		return "manageNewsType";
	}

	@RequestMapping("newsTypeAdd")
	public String newsTypeAdd(Model model, NewsType newsType) {
		iNewsTypeService.newsTypeAdd(newsType);
		return this.findTypeList(model);
	}

	@RequestMapping("newsTypeDel")
	public String newsTypeDel(Model model, NewsType newsType) {
		System.out.println("删除的id为：" + newsType.getTypeId());
		iNewsTypeService.newsTypeDel(newsType);
		return this.findTypeList(model);
	}

	@RequestMapping("newsTypeUpdate")
	public String newsTypeUpdate(Model model, NewsType newsType) {
		System.out.println("更新的id为：" + newsType.getTypeId());
		iNewsTypeService.newsTypeUpdate(newsType);
		return this.findTypeList(model);
	}
}
