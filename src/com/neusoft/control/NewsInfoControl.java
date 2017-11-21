package com.neusoft.control;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neusoft.po.Feedback;
import com.neusoft.po.NewsAuthor;
import com.neusoft.po.NewsInfo;
import com.neusoft.po.NewsInfoExample;
import com.neusoft.po.NewsType;
import com.neusoft.service.INewsAuthorService;
import com.neusoft.service.INewsInfoService;
import com.neusoft.service.INewsTypeService;

@Controller
@RequestMapping("/news")
public class NewsInfoControl {
	@Autowired
	INewsInfoService iNewsInfoService;
	@Autowired
	INewsAuthorService authorService;
	@Autowired
	INewsTypeService iNewsTypeService;

	@RequestMapping("newsInfodetailList")
	/*
	 * 查找所有新闻并显示
	 */
	public String newsInfoList(Model model, HttpSession session,
			Integer pageNo, NewsInfo newsInfo) {
		int pageNums;// 页码最大值
		int newsNums = iNewsInfoService.allcount();// 数据库中有效条目数
		if (newsNums % 4 == 0) {
			pageNums = newsNums / 4;
		} else {
			pageNums = newsNums / 4 + 1;
		}
		session.setAttribute("pageNums", pageNums);
		if (pageNo != null) {
			List<NewsInfo> newsInfodetailList = iNewsInfoService
					.newsInfoList((pageNo - 1) * 4);
			session.setAttribute("newsInfodetailList", newsInfodetailList);
			session.setAttribute("pageNo", pageNo);
		} else {
			List<NewsInfo> newsInfodetailList = iNewsInfoService
					.newsInfoList(0);
			session.setAttribute("newsInfodetailList", newsInfodetailList);
			session.setAttribute("pageNo", 1);// 页码默认是从一开始的。
		}

		return "manageNewsDetail";
	}

	/*
	 * 删除新闻
	 */
	@RequestMapping("newsInfoListDel")
	public String newsInfoListDel(Model model, NewsInfo newsInfo,
			HttpSession session, Integer pageNo) {
		System.out.println(newsInfo.getNewsId());
		NewsInfoExample example = new NewsInfoExample();
		example.or().andNewsIdEqualTo(newsInfo.getNewsId());
		iNewsInfoService.deleteByExample(example);

		return this.newsInfoList(model, session, pageNo, newsInfo);

	}

	/*
	 * 修改前查找新闻
	 */
	@RequestMapping("findNewsByone")
	public String newsInfoByone(Model model, NewsInfo newsInfo) {

		int newsId = newsInfo.getNewsId();
		// 新闻信息作用域循环显示
		newsInfo = iNewsInfoService.findNewsByone(newsId);
		model.addAttribute("findNewsByone", newsInfo);
		System.out.println(newsInfo.toString());
		// 作者作用域循环显示
		List<NewsAuthor> newsAuthorList = authorService.findauhtorList();
		model.addAttribute("newsAuthorList", newsAuthorList);
		// 种类作用域循环显示
		List<NewsType> newsTypeList = iNewsTypeService.findTypeList();
		model.addAttribute("newsTypeList", newsTypeList);
		return "newsInfoUpdate";
	}

	/**
	 * 更新新闻信息
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("updateNewsInfo")
	public String updateNewsInfo(Model model, NewsInfo newsInfo, HttpSession session,
			Integer pageNo) {
		System.out.println(newsInfo.toString());
		iNewsInfoService.updateNewsInfo(newsInfo);
		return this.newsInfoList(model, session, pageNo, newsInfo);
	}

	// 某个作者的新闻
	// 某个列别的新闻
	// 某个内容的新闻
	// 某个时间段新闻
	@RequestMapping("addNewsInfo")
	public String addNewsInfo(Model model, NewsInfo newsInfo) {
		// 作者作用域循环显示
		List<NewsAuthor> newsAuthorList = authorService.findauhtorList();
		model.addAttribute("newsAuthorList", newsAuthorList);
		// 种类作用域循环显示
		List<NewsType> newsTypeList = iNewsTypeService.findTypeList();
		model.addAttribute("newsTypeList", newsTypeList);
		return "newsInfoAdd";
	}

	@RequestMapping("test")
	public String addNews(Model model, NewsInfo newsInfo) {
		// 作者作用域循环显示
		System.out.println("前台获取的内容" + newsInfo.getNewsContext());
		newsInfo = new NewsInfo();
		newsInfo.setNewsId(11);
		// 种类作用域循环显示
		iNewsInfoService.insertNewsInfo(newsInfo);

		return "success";
	}

	@RequestMapping("addNewsInfoAfter")
	public String addNewsInfoAfter(Model model, NewsInfo newsInfo)
			throws IllegalStateException, IOException {

		String sqlPath = null;
		// 定义文件保存的本地路径
		String localPath = "E:\\File\\";
		// 定义 文件名
		String filename = null;
		if (!newsInfo.getFile().isEmpty()) {
			// 生成uuid作为文件名称
			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			// 获得文件类型（可以判断如果不是图片，禁止上传）
			String contentType = newsInfo.getFile().getContentType();
			// 获得文件后缀名
			String suffixName = contentType
					.substring(contentType.indexOf("/") + 1);
			// 得到 文件名
			filename = uuid + "." + suffixName;
			System.out.println(filename);
			// 文件保存路径
			newsInfo.getFile().transferTo(new File(localPath + filename));
		}
		// 把图片的相对路径保存至数据库
		sqlPath = "/images/" + filename;
		System.out.println(sqlPath);
		System.out.println("1" + newsInfo.getNewsTitle());
		newsInfo.setNewsImages(sqlPath);
		System.out.println("1" + newsInfo.getNewsTitle());
		newsInfo.setNewsRead(0);
		iNewsInfoService.insertNewsInfo(newsInfo);
		return this.addNewsInfo(model, newsInfo);
	}

}
