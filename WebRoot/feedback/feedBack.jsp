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

<title>My JSP 'feedBack.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">


<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css"></link>
<style type="text/css">
.fenye {
	float: right;
}

.p1 {
	width: 200px;
	overflow: hidden;
	text-overflow: ellipsis;
	display: -webkit-box;
	-webkit-line-clamp: 2;
	-webkit-box-orient: vertical;
	overflow: hidden;
}
</style>


</head>

<body><jsp:include page="daohang.jsp"></jsp:include>
	<div class="container">
		<table class="table table-bordered">
			<caption>官方答疑</caption>
			<thead>
				<tr>
					<th>编号</th>
					<th>问题</th>
					<th>解答</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${feedBackList}" var="feedBackList">
					<tr>
						<td>${feedBackList.id}</td>
						<td>${feedBackList.question}</td>
						<td class="p1">${feedBackList.answer}</td>
						<td><a
							onclick="if (confirm('确定要删除吗？')) return true; else return false;"
							href="delfeedback.action?&id=${feedBackList.id}"
							class="btn btn-danger btn-sm">删除</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<br>
		<div class="fenye">
			<ul class="pagination">
				<c:choose>
					<c:when test="${pageNo>1}">
						<li><a href="#">&laquo;</a></li>
						<li><a href="feedbacklist.action">首页</a></li>
						<li><a href="feedbacklist.action?pageNo=${pageNo-1}">上一页</a>
						</li>
					</c:when>
				</c:choose>

				<c:choose>
					<c:when test="${pageNo!=pageNums}">
						<li><a href="feedbacklist.action?pageNo=${pageNo+1}">下一页</a>
						</li>
						<li><a href="feedbacklist.action?pageNo=${pageNums}">末页</a>
						</li>
					</c:when>
				</c:choose>
			</ul>
			当前页数:[${pageNo}/${pageNums}]
		</div>
	</div>

</body>
</html>