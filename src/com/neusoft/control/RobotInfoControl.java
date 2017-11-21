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

import com.neusoft.po.Feedback;
import com.neusoft.po.RobotCompany;
import com.neusoft.po.RobotInfo;
import com.neusoft.po.RobotType;
import com.neusoft.service.IRobotCompanyService;
import com.neusoft.service.IRobotInfoService;
import com.neusoft.service.IRobotTypeService;

@Controller
@RequestMapping("/robot")
public class RobotInfoControl {

	@Autowired
	IRobotInfoService iRobotInfoService;
	@Autowired
	IRobotCompanyService iRobotCompanyService;
	@Autowired
	IRobotTypeService iRobotTypeService;

	@RequestMapping("manageRobotDetail")
	public String RobotInfoList(Model model, Integer pageNo, HttpSession session) {
		int pageNums;// 页码最大值
		int newsNums = iRobotInfoService.allcount();// 数据库中有效条目数
		if (newsNums % 4 == 0) {
			pageNums = newsNums / 4;
		} else {
			pageNums = newsNums / 4 + 1;
		}
		session.setAttribute("pageNums", pageNums);
		if (pageNo != null) {
			List<RobotInfo> robotInfoList = iRobotInfoService
					.robotInfoList((pageNo - 1) * 4);
			session.setAttribute("robotInfoList", robotInfoList);
			session.setAttribute("pageNo", pageNo);
		} else {
			List<RobotInfo> robotInfoList = iRobotInfoService.robotInfoList(0);
			session.setAttribute("robotInfoList", robotInfoList);
			session.setAttribute("pageNo", 1);// 页码默认是从一开始的。
		}

		return "robot/manageRobotDetail";
	}

	/**
	 * 增加之前查询所有的生产商和产品种类
	 * 
	 * 
	 */
	@RequestMapping("/findByAll")
	public String findByAll(Model model, RobotInfo robotInfo,
			HttpSession session) {
		// 机器人生产商
		List<RobotCompany> showRobotComList = iRobotCompanyService
				.robotCompanyList();
		// model.addAttribute("showRobotComList", showRobotComList);
		session.setAttribute("showRobotComList", showRobotComList);
		// 机器人种类
		List<RobotType> robotTypeList = iRobotTypeService.RobotTypeList();
		// model.addAttribute("robotTypeList", robotTypeList);
		session.setAttribute("robotTypeList", robotTypeList);
		return "robot/addRobotInfo";
	}

	@RequestMapping("/addRobotInfo")
	public String addRobotInfo(Model model, RobotInfo robotInfo,
			HttpServletRequest request) throws IllegalStateException,
			IOException {
		String sqlPath = "";
		// 定义文件保存的本地路径
		String localPath = "E:\\File\\";
		// 定义 文件名
		String filename = "robot";
		if (!robotInfo.getFile().isEmpty()) {
			// 生成uuid作为文件名称
			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			// 获得文件类型（可以判断如果不是图片，禁止上传）
			String contentType = robotInfo.getFile().getContentType();
			// 获得文件后缀名
			String suffixName = contentType
					.substring(contentType.indexOf("/") + 1);
			// 得到 文件名
			filename = uuid + "." + suffixName;
			System.out.println(filename);
			// 文件保存路径
			robotInfo.getFile().transferTo(new File(localPath + filename));
		}
		// 把图片的相对路径保存至数据库
		sqlPath = "/images/" + filename;
		System.out.println(sqlPath);

		System.out.println("1" + robotInfo.getRobotName());
		robotInfo.setRobotImage(sqlPath);
		System.out.println("1" + robotInfo.getRobotName());
		iRobotInfoService.insertRobotInfo(robotInfo);
		return "robot/addRobotInfo";
	}

	/**
	 * 返回的是对象信息列表
	 * 
	 * @param model
	 * @param robotInfo
	 * @param request
	 * @return
	 */
	@RequestMapping("/findRobotByone")
	public String robotInfoUpdate(Model model, RobotInfo robotInfo,
			HttpServletRequest request, HttpSession session) {
		System.out.println(robotInfo.getRobotId());
		robotInfo = iRobotInfoService.findRobotByone(robotInfo);
		System.out.println(robotInfo.getRobotName());
		model.addAttribute("robotInfo", robotInfo);
		// session.setAttribute("robotInfo", robotInfo);
		return "robot/updateRobotInfo";
	}

	/**
	 * 返回的是初始信息列表
	 * 
	 * @param model
	 * @param robotInfo
	 * @param request
	 * @return
	 * @throws IOException
	 * @throws IllegalStateException
	 */

	@RequestMapping("/updateRobotInfo")
	public String updateRobotInfo(Model model, RobotInfo robotInfo,
			HttpServletRequest request, HttpSession session, Integer pageNo)
			throws IllegalStateException, IOException {
		System.out.println("更新的Id为：" + robotInfo.getRobotId());
		System.out.println(robotInfo.toString());
		// 保存数据库的路径
		String sqlPath = "";
		// 定义文件保存的本地路径
		String localPath = "E:\\File\\";
		// 定义 文件名
		String filename = "robot";
		if (!robotInfo.getFile().isEmpty()) {
			// 生成uuid作为文件名称
			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			// 获得文件类型（可以判断如果不是图片，禁止上传）
			String contentType = robotInfo.getFile().getContentType();
			// 获得文件后缀名
			String suffixName = contentType
					.substring(contentType.indexOf("/") + 1);
			// 得到 文件名
			filename = uuid + "." + suffixName;
			System.out.println(filename);
			// 文件保存路径
			robotInfo.getFile().transferTo(new File(localPath + filename));
		}
		// 把图片的相对路径保存至数据库
		sqlPath = "/images/" + filename;
		System.out.println(sqlPath);
		robotInfo.setRobotImage(sqlPath);
		iRobotInfoService.updateRobotInfo(robotInfo);
		System.out.println("更新完返回初始信息列表");
		return this.RobotInfoList(model, pageNo, session);
	}

	@RequestMapping("/robotInfoDel")
	public String robotInfoDel(RobotInfo robotInfo, Model model,
			Integer pageNo, HttpSession session) {
		System.out.println(robotInfo.getRobotId());
		iRobotInfoService.deleteByExample(robotInfo);
		return this.RobotInfoList(model, pageNo, session);

	}
}
