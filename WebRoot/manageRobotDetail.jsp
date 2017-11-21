<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

<title>My JSP 'robotInfoList.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body><jsp:include page="daohang.jsp"></jsp:include>
	<table border="1">

		<tr>
			<td>编号</td>
			<td>名称</td>
			<td>生产商</td>
			<td>产品价格</td>
			<td>图片</td>
			<td>评论</td>
			<td>余量</td>
		</tr>
		<c:forEach items="${robotInfoList }" var="robotInfoList">
			<tr>
				<td>${robotInfoList.robotId}</td>
				<td>${robotInfoList.robotName}</td>
				<td>${robotInfoList.robotCompany}</td>
				<td>${robotInfoList.robotPrice}</td>
				<td>${robotInfoList.robotImage}</td>
				<td>${robotInfoList.robotCommit}</td>
				<td>${robotInfoList.robotCount}</td>
			</tr>
		</c:forEach>
	</table>





</body>
</html>
