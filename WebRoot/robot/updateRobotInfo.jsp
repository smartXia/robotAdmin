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

<title>My JSP 'updateRobotInfo.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
</head>

<body><jsp:include page="daohang.jsp"></jsp:include>
	<form action="robot/updateRobotInfo.action" method="post"
		enctype="multipart/form-data">
		<table border="1">
			<tr>
				<td>编号</td>
				<td><input type="text" value="${robotInfo.robotId}"
					name="robotId">
				</td>
			</tr>
			<tr>
				<td>名称</td>
				<td><input type="text" value="${robotInfo.robotName}"
					name="robotName">
				</td>
			</tr>
			<tr>
				<td>种类</td>
				<td>${robotInfo.robotType}</td>
			</tr>
			<tr>
				<td>生产商</td>
				<td>${robotInfo.robotCompany}</td>
			</tr>
			<tr>
				<td>图片</td>
				<td><img alt="" src="${robotInfo.robotImage}" width="150"
					height="80"> <label>替换图片：</label><input type="file"
					name="file" value="${robotInfo.robotImage}"><br>
				</td>
			</tr>
			<tr>
				<td>价格</td>
				<td><input type="text" value="${robotInfo.robotPrice}"
					name="robotPrice">
				</td>
			</tr>
			<tr>
				<td>评论</td>
				<td>${robotInfo.robotCount}</td>
			</tr>
			<tr>
				<td>余货</td>
				<td><input type="text" value="${robotInfo.robotCount}"
					name="robotCount">${robotInfo.robotCount}</td>
			</tr>
		</table>
		<input type="submit" value="提交修改">
	</form>
</body>
</html>
