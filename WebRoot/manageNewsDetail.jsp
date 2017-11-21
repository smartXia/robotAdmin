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

<title>My JSP 'mannageNews.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">


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
/* 
body {
	background-color: #E3EFFB;
} */
</style>
</head>
<body>
<jsp:include page="daohang.jsp"></jsp:include>
	<div class="container">
		<table class="table  table-bordered table-hover">
			<caption>新闻资讯列表</caption>
			<thead>
				<tr>
					<th><span>编号</span></th>
					<th>标题</th>
					<th>新闻图片</th>

					<!-- <th>作者</th>
					<th>类型</th>
					<th>时间</th> -->
					<th colspan="2" align="center">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${newsInfodetailList}" var="showInfo">
					<tr>
						<td>${showInfo.newsId}</td>
						<td><font size="3" face="arial">${showInfo.newsTitle}</font>
						</td>

						<td><img src="${showInfo.newsImages}" alt="images" width="30"
							height="25">
						</td>
						<%-- <td>${showInfo.author.authorName}</td>
						<td>${showInfo.type.typeName}</td>
						<td>${showInfo.newsDate}</td> --%>
						<td><a
							href='news/findNewsByone.action?newsId=${showInfo.newsId}'>查看详情</a>
						</td>
						<td><a
							onclick="if (confirm('确定要删除吗？')) return true; else return false;"
							href='news/newsInfoListDel.action?newsId=${showInfo.newsId}'>删除</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>

		</table>
		<div id="fenye">
			<ul class="pagination">
				<c:choose>
					<c:when test="${pageNo>1}">
						<li><a href="#">&laquo;</a>
						</li>
						<li><a href="news/newsInfodetailList.action">首页</a>
						</li>
						<li><a
							href="news/newsInfodetailList.action?pageNo=${pageNo-1}">上一页</a>
						</li>
					</c:when>
				</c:choose>

				<c:choose>
					<c:when test="${pageNo!=pageNums}">
						<li><a
							href="news/newsInfodetailList.action?pageNo=${pageNo+1}">下一页</a>
						</li>
						<li><a
							href="news/newsInfodetailList.action?pageNo=${pageNums}">末页</a>
						</li>
					</c:when>
				</c:choose>

			</ul>
			<h5>当前页数:[${pageNo}/${pageNums}]</h5>
		</div>
	</div>
	<a href="news/insertNewsInfoDetail.action">添加信息</a>
</body>
</html>
