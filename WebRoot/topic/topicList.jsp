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

<title>My JSP 'topicList.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css"></link>
</head>
<style type="text/css">
.p1 {
	width: 200px;
	overflow: hidden;
	text-overflow: ellipsis;
	display: -webkit-box;
	-webkit-line-clamp: 2;
	-webkit-box-orient: vertical;
	overflow: hidden;
}

#fenye {
	float: right;
}

body {
	background-color: #E3EFFB;
}
</style>
<body><jsp:include page="daohang.jsp"></jsp:include>
	<div class="container">
		<table class="table table-hover">
			<caption>话题列表</caption>
			<thead>
				<tr>
					<th>编号</th>
					<th>标题</th>
					<th>图品</th>
					<th>内容</th>
					<th colspan="2" align="center">操作</th>
				</tr>
			</thead>
			<c:forEach items="${topicList}" var="topicList">
				<tr>
					<td>${topicList.topicId}</td>
					<td class="p1">${topicList.topicTitle}</td>
					<td><img src="${topicList.topicImage}" width="30" height="25">
					</td>
					<td class="p1">${topicList.topicContext}</td>
					<td><a
						href="topic/delTopic.action?topicId=${topicList.topicId}" class="btn btn-danger btn-sm">删除</a></td>
					<td><a
						href="topic/updateTopic.action?topicId=${topicList.topicId}" class="btn btn-info btn-sm">更新</a>
					</td>
				</tr>
			</c:forEach>
		</table>
		<div id="fenye">
			<ul class="pagination">
				<c:choose>
					<c:when test="${pageNo>1}">
						<li><a href="#">&laquo;</a></li>
						<li><a href="topic/topicList.action">首页</a></li>
						<li><a href="topic/topicList.action?pageNo=${pageNo-1}">上一页</a>
						</li>
					</c:when>
				</c:choose>

				<c:choose>
					<c:when test="${pageNo!=pageNums}">
						<li><a href="topic/topicList.action?pageNo=${pageNo+1}">下一页</a>
						</li>
						<li><a href="topic/topicList.action?pageNo=${pageNums}">末页</a>
						</li>
					</c:when>
				</c:choose>

			</ul>
			<h5>当前页数:[${pageNo}/${pageNums}]</h5>
		</div>
	</div>

</body>
</html>
