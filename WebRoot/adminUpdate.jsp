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

<title>My JSP 'adminUpdate.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<BODY>
	<TABLE cellSpacing=0 cellPadding=0 width="100%" align=center border=0>
		<TR height=28>
			<TD background=images/title_bg1.jpg>当前位置:</TD>
		</TR>
		<TR>
			<TD bgColor=#b1ceef height=1></TD>
		</TR>
		<TR height=20>
			<TD background=images/shadow_bg.jpg></TD>
		</TR>
	</TABLE>
	<TABLE cellSpacing=0 cellPadding=0 width="90%" align=center border=0>
		<TR height=100>
			<TD align="center" width=100><IMG height=100
				src="images/admin_p.gif" width=90></TD>
			<TD width=60>&nbsp;</TD>
			<TD>
				<TABLE height=100 cellSpacing=0 cellPadding=0 width="100%" border=0>

					<TR>
						<TD>当前时间：2008-12-27 17:03:55</TD>
					</TR>
					<TR>
						<TD style="FONT-WEIGHT: bold; FONT-SIZE: 16px">admin</TD>
					</TR>
					<TR>
						<TD>欢迎进入网站管理中心！</TD>
					</TR>
				</TABLE></TD>
		</TR>
		<TR>
			<TD colSpan=3 height=10></TD>
		</TR>
	</TABLE>
	<TABLE cellSpacing=0 cellPadding=0 width="95%" align=center border=0>
		<TR height=20>
			<TD></TD>
		</TR>
		<TR height=22>
			<TD style="PADDING-LEFT: 20px; FONT-WEIGHT: bold; COLOR: #ffffff"
				align=middle background=images/title_bg2.jpg>您的相关信息</TD>
		</TR>
		<TR bgColor=#ecf4fc height=12>
			<TD></TD>
		</TR>
		<TR height=20>
			<TD></TD>
		</TR>
	</TABLE>

	<form action="admin/adminUpdateAfter.action" method="post">
		<TABLE cellSpacing=0 cellPadding=2 width="95%" align=center border="1">
			<TR>
				<TD align=right width=100>编号：</TD>
				<TD style="COLOR: #880000"><input type="text"
					value="${admin.adminId}" name="adminId">
				</TD>
			</TR>
			<TR>
				<TD align=right width=100>账号等级：</TD>
				<TD style="COLOR: #880000">${admin.adminRole}</TD>
			</TR>
			<TR>
				<TD align=right>用户名：</TD>
				<TD style="COLOR: #880000"><input type="text"
					value="${admin.adminName}" name="adminName"></TD>
			</TR>
			<TR>
				<TD align=right>密码：</TD>
				<TD style="COLOR: #880000"><input type="text"
					value="${admin.adminPwd}" name="adminPwd"></TD>
			</TR>
			<TR>
				<TD colspan="1" align="left"></TD>
				<TD colspan="1" align="center"></TD>

			</TR>
		</TABLE>
		<input type="submit" value="提交信息"
			onclick="if (confirm('确定要提交吗？')) return true; else return false;">
	</form>
</BODY>

</HTML>