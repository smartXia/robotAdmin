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

<title>My JSP 'header.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<LINK href="css/admin.css" type="text/css" rel="stylesheet">
</head>
<body>
<BODY>
	<TABLE cellSpacing=0 cellPadding=0 width="100%"
		background="images/header_bg.jpg" border=0>
		<TR height=56>
			<TD width=260><IMG height=56 src="images/header_left.jpg"
				width=260>
			</TD>
			<TD style="FONT-WEIGHT: bold; COLOR: #fff; PADDING-TOP: 20px"
				align=middle>当前用户：${admin.adminName} &nbsp;&nbsp; <A
				style="COLOR: #fff"
				href="admin/adminUpdate.action?adminId=${admin.adminId}" target=main>修改口令</A>
				&nbsp;&nbsp; <A style="COLOR: #fff"

				href="login.jsp" target=_top>退出系统</A>
			</TD>
			<TD align=right width=268><IMG height=56
				src="images/header_right.jpg" width=268>
			</TD>
		</TR>
	</TABLE>
	<TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
		<TR bgColor=#1c5db6 height=4>
			<TD></TD>
		</TR>
	</TABLE>
</BODY>
</body>

</html>
