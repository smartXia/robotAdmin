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

<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css"></link>

<style type="text/css">
/* td .p1 {
	overflow: hidden;
	text-overflow: ellipsis;
	display: -webkit-box;
	-webkit-line-clamp: 2;
	-webkit-box-orient: vertical;
} */
#fenye {
	float: right;
}

/* body {
	background-color: #E3EFFB;
} */
</style>
</head>

<body><jsp:include page="daohang.jsp"></jsp:include>
	<div class="container">
		<table class="table table-hover table-bordered">
			<caption>产品列表</caption>
			<thead>
				<tr>
					<th>编号</th>
					<th>名称</th>
					<th>生产商</th>
					<th>产品价格</th>
					<th>图片</th>
					<th>评论</th>
					<th>余量</th>
					<th colspan="2" align="center">操作</th>

				</tr>
				<c:forEach items="${robotInfoList}" var="robotInfoList">
					<tr>
						<td>${robotInfoList.robotId}</td>
						<td>${robotInfoList.robotName}</td>
						<td>${robotInfoList.robotCompany}</td>
						<td>${robotInfoList.robotPrice}</td>
						<td><img src="${robotInfoList.robotImage}" width="30"
							height="25"></td>
						<td>${robotInfoList.robotCommit}</td>
						<td>${robotInfoList.robotCount}</td>
						<td><a
							href="robot/findRobotByone.action?robotId=${robotInfoList.robotId}">修改</a>
						</td>
						<td><a
							onclick="if (confirm('确定要删除吗？')) return true; else return false;"
							href="robot/robotInfoDel.action?robotId=${robotInfoList.robotId}">删除</a>
						</td>
					</tr>

				</c:forEach>
		</table>
		<div id="fenye">
			<ul class="pagination">
				<c:choose>
					<c:when test="${pageNo>1}">
						<li><a href="#">&laquo;</a>
						</li>
						<li><a href="robot/manageRobotDetail.action">首页</a>
						</li>
						<li><a
							href="robot/manageRobotDetail.action?pageNo=${pageNo-1}">上一页</a>
						</li>
					</c:when>
				</c:choose>

				<c:choose>
					<c:when test="${pageNo!=pageNums}">
						<li><a
							href="robot/manageRobotDetail.action?pageNo=${pageNo+1}">下一页</a>
						</li>
						<li><a
							href="robot/manageRobotDetail.action?pageNo=${pageNums}">末页</a></li>
					</c:when>
				</c:choose>
				
			</ul>
			<h5> 当前页数:[${pageNo}/${pageNums}]</h5>
		</div>
	</div>

</body>
</html>
