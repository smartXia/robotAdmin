<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'menu.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" href="css/bootstrap.min.css" />
<SCRIPT type="text/javascript">
	function expand(el) {
		childObj = document.getElementById("child" + el);
		if (childObj.style.display == 'none') {
			childObj.style.display = 'block';
		} else {
			childObj.style.display = 'none';
		}
		return;
	}
</SCRIPT>
</head>

<body>
	<TABLE height="100%" cellSpacing=0 cellPadding=0 width=170
		background=images/menu_bg.jpg border=0>
		<TR>
			<TD vAlign=top align=middle>
				<TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>

					<TR>
						<TD height=10></TD>
					</TR>
				</TABLE>
				<TABLE cellSpacing=0 cellPadding=0 width=150 border=0>

					<TR height=22>
						<TD style="PADDING-LEFT: 30px" background=images/menu_bt.jpg>
							<A class=menuParent onclick=expand(1) href="javascript:void(0);">关于我们</A>
						</TD>
					</TR>
					<TR height=4>
						<TD></TD>
					</TR>
				</TABLE>
				<TABLE id=child1 style="DISPLAY: none" cellSpacing=0 cellPadding=0
					width=150 border=0>
					<TR height=20>
						<TD align=middle width=30><IMG height=9
							src="images/menu_icon.gif" width=9>
						</TD>
						<TD><A class=menuChild href="gongsijianjie.jsp" target=main>公司简介</A>
						</TD>
					</TR>
					<TR height=20>
						<TD align=middle width=30><IMG height=9
							src="images/menu_icon.gif" width=9>
						</TD>
						<TD><A class=menuChild href="#" target=main>荣誉资质</A>
						</TD>
					</TR>
					<TR height=20>
						<TD align=middle width=30><IMG height=9
							src="images/menu_icon.gif" width=9>
						</TD>
						<TD><A class=menuChild href="#" target=main>分类管理</A>
						</TD>
					</TR>
					<TR height=20>
						<TD align=middle width=30><IMG height=9
							src="images/menu_icon.gif" width=9>
						</TD>
						<TD><A class=menuChild href="#" target=main>子类管理</A>
						</TD>
					</TR>
					<TR height=4>
						<TD colSpan=2></TD>
					</TR>
				</TABLE>
				<TABLE cellSpacing=0 cellPadding=0 width=150 border=0>
					<TR height=22>
						<TD style="PADDING-LEFT: 30px" background=images/menu_bt.jpg>
							<A class=menuParent onclick=expand(2) href="javascript:void(0);">新闻中心</A>
						</TD>
					</TR>
					<TR height=4>
						<TD></TD>
					</TR>
				</TABLE>
				<TABLE id=child2 style="DISPLAY: none" cellSpacing=0 cellPadding=0
					width=150 border=0>
					<TR height=20>
						<TD align=middle width=30><IMG height=9
							src="images/menu_icon.gif" width=9>
						</TD>
						<TD><A class=menuChild href="news/newsInfodetailList.action"
							target=main>新闻管理</A>
						</TD>
					</TR>
					<TR height=20>
						<TD align=middle width=30><IMG height=9
							src="images/menu_icon.gif" width=9>
						</TD>
						<TD><A class=menuChild href="newstype/findTypeList.action"
							target=main>新闻列别</A>
						</TD>
					</TR>
					<TR height=20>
						<TD align=middle width=30><IMG height=9
							src="images/menu_icon.gif" width=9>
						</TD>
						<TD><A class=menuChild href="author/findAuthorList.action"
							target=main>作者管理</A>
						</TD>
					</TR>
					<TR height=20>
						<TD align=middle width=30><IMG height=9
							src="images/menu_icon.gif" width=9>
						</TD>
						<TD><A class=menuChild href="news/addNewsInfo.action"
							target=main>添加新闻</A>
						</TD>
					</TR>

					<TR height=4>
						<TD colSpan=2></TD>
					</TR>
				</TABLE>
				<TABLE cellSpacing=0 cellPadding=0 width=150 border=0>
					<TR height=22>
						<TD style="PADDING-LEFT: 30px" background=images/menu_bt.jpg>
							<A class=menuParent onclick=expand(3) href="javascript:void(0);">产品中心</A>
						</TD>
					</TR>
					<TR height=4>
						<TD></TD>
					</TR>
				</TABLE>
				<TABLE id=child3 style="DISPLAY: none" cellSpacing=0 cellPadding=0
					width=150 border=0>
					<TR height=20>
						<TD align=middle width=30><IMG height=9
							src="images/menu_icon.gif" width=9>
						</TD>
						<TD><A class=menuChild href="robot/manageRobotDetail.action"
							target=main>产品列表</A>
						</TD>
					</TR>
					<TR height=20>
						<TD align=middle width=30><IMG height=9
							src="images/menu_icon.gif" width=9>
						</TD>
						<TD><A class=menuChild href="robot/findByAll.action"
							target=main>上新产品</A>
						</TD>
					</TR>
					<TR height=20>
						<TD align=middle width=30><IMG height=9
							src="images/menu_icon.gif" width=9>
						</TD>
						<TD><A class=menuChild
							href="robottype/showRobotTypeList.action" target=main>分类管理</A>
						</TD>
					</TR>
					<TR height=20>
						<TD align=middle width=30><IMG height=9
							src="images/menu_icon.gif" width=9>
						</TD>
						<TD><A class=menuChild
							href="robotcom/showRobotComList.action" target=main>产地管理</A>
						</TD>
					</TR>
					<TR height=4>
						<TD colSpan=2></TD>
					</TR>
				</TABLE>
				<TABLE cellSpacing=0 cellPadding=0 width=150 border=0>
					<TR height=22>
						<TD style="PADDING-LEFT: 30px" background=images/menu_bt.jpg>
							<A class=menuParent onclick=expand(4) href="javascript:void(0);">热门话题</A>
						</TD>
					</TR>
					<TR height=4>
						<TD></TD>
					</TR>
				</TABLE>
				<TABLE id=child4 style="DISPLAY: none" cellSpacing=0 cellPadding=0
					width=150 border=0>
					<TR height=20>
						<TD align=middle width=30><IMG height=9
							src="images/menu_icon.gif" width=9>
						</TD>
						<TD><A class=menuChild href="topic/topicList.action"
							target=main>话题列表</A>
						</TD>
					</TR>
					<TR height=20>
						<TD align=middle width=30><IMG height=9
							src="images/menu_icon.gif" width=9>
						</TD>
						<TD><A class=menuChild href="topic/addTopic.jsp" target=main>新增话题</A>
						</TD>
					</TR>
					<TR height=4>
						<TD colSpan=2></TD>
					</TR>
				</TABLE>
				<TABLE cellSpacing=0 cellPadding=0 width=150 border=0>
					<TR height=22>
						<TD style="PADDING-LEFT: 30px" background=images/menu_bt.jpg>
							<A class=menuParent onclick=expand(5) href="javascript:void(0);">会员管理</A>
						</TD>
					</TR>
					<TR height=4>
						<TD></TD>
					</TR>
				</TABLE>
				<TABLE id=child5 style="DISPLAY: none" cellSpacing=0 cellPadding=0
					width=150 border=0>

					<TR height=20>
						<TD align=middle width=30><IMG height=9
							src="images/menu_icon.gif" width=9>
						</TD>
						<TD><A class=menuChild href="userinfo/userInfoList.action"
							target=main>会员列表</A>
						</TD>
					</TR>
					<!-- <TR height=20>
						<TD align=middle width=30><IMG height=9
							src="images/menu_icon.gif" width=9>
						</TD>
						<TD><A class=menuChild href="#" target=main>子类管理</A>
						</TD>
					</TR> -->
					<TR height=4>
						<TD colSpan=2></TD>
					</TR>
				</TABLE>
				<TABLE cellSpacing=0 cellPadding=0 width=150 border=0>

					<TR height=22>
						<TD style="PADDING-LEFT: 30px" background=images/menu_bt.jpg>
							<A class=menuParent onclick=expand(6) href="javascript:void(0);">订单管理</A>
						</TD>
					</TR>
					<TR height=4>
						<TD></TD>
					</TR>
				</TABLE>
				<TABLE id=child6 style="DISPLAY: none" cellSpacing=0 cellPadding=0
					width=150 border=0>

					<TR height=20>
						<TD align=middle width=30><IMG height=9
							src="images/menu_icon.gif" width=9>
						</TD>
						<TD><A class=menuChild href="order/orderList.action"
							target=main>今日订单</A></TD>
					</TR>
					<TR height=20>
						<TD align=middle width=30><IMG height=9
							src="images/menu_icon.gif" width=9>
						</TD>
						<TD><A class=menuChild href="#" target=main>合作快递</A>
						</TD>
					</TR>
					
					
					
					
			
				</TABLE>
				<TABLE cellSpacing=0 cellPadding=0 width=150 border=0>

					<TR height=22>
						<TD style="PADDING-LEFT: 30px" background=images/menu_bt.jpg>
							<A class=menuParent onclick=expand(7) href="javascript:void(0);">官方公告栏</A>
						</TD>
					</TR>
					<TR height=4>
						<TD></TD>
					</TR>
				</TABLE>
				<TABLE id=child7 style="DISPLAY: none" cellSpacing=0 cellPadding=0
					width=150 border=0>

					<TR height=20>
						<TD align=middle width=30><IMG height=9
							src="images/menu_icon.gif" width=9>
						</TD>
						<TD><A class=menuChild href="feedbacklist.action" target=main>基本公告</A>
						</TD>
					</TR>
					<TR height=20>
						<TD align=middle width=30><IMG height=9
							src="images/menu_icon.gif" width=9>
						</TD>
						<TD><A class=menuChild href="addfeedback.jsp"
							target=main>编辑公告栏</A></TD>
					</TR>
					
				</TABLE>
				<TABLE cellSpacing=0 cellPadding=0 width=150 border=0>

					<TR height=22>
						<TD style="PADDING-LEFT: 30px" background=images/menu_bt.jpg>
							<A class=menuParent onclick=expand(0) href="javascript:void(0);">个人管理</A>
						</TD>
					</TR>
					<TR height=4>
						<TD></TD>
					</TR>
				</TABLE>
				<TABLE id=child0 style="DISPLAY: none" cellSpacing=0 cellPadding=0
					width=150 border=0>

					<TR height=20>
						<TD align=middle width=30><IMG height=9
							src="images/menu_icon.gif" width=9>
						</TD>
						<TD><A class=menuChild
							href="admin/adminUpdate.action?adminId=${admin.adminId}"
							target=main>修改口令</A></TD>
					</TR>
					<TR height=20>
						<TD align=middle width=30><IMG height=9
							src="images/menu_icon.gif" width=9>
						</TD>
						<TD><A class=menuChild
							onclick="if (confirm('确定要退出吗？')) return true; else return false;"
							href="login.jsp" target=_top>退出系统</A>
						</TD>
					</TR>
				</TABLE>
			</TD>
			<TD width=1 bgColor=#d1e6f7></TD>
		</TR>
	</TABLE>
</body>
</html>
