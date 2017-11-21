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

<title>My JSP 'index01.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<LINK href="css/admin.css" type="text/css" rel="stylesheet">

</head>
<FRAMESET border=0 frameSpacing=0 rows="60, *" frameBorder=0>
	<FRAME name=header
		src="admin/adminInfoHeader.action?adminId=${admin.adminId}"
		frameBorder=0 noResize scrolling=no>
	<FRAMESET cols="170, *">
		<FRAME name=menu
			src="admin/adminInfoMenu.action?adminId=${admin.adminId}"
			frameBorder=0 noResize>
		<FRAME name=main src="main.htm" frameBorder=0 noResize scrolling=yes>
	</FRAMESET>
</FRAMESET>
<noframes>
</noframes>

<body>11111111111111111111111111 ${adminName}
</body>
</html>
