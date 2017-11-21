<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page import="java.io.*,java.util.*"%>
<%@ page import="javax.servlet.*,java.text.*"%>
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

<title>My JSP 'add.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">



<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css"></link>

<style type="text/css">
.textarea {
	width: 400px;
	min-height: 20px;
	max-height: 300px;
	_height: 120px;
	margin-left: auto;
	margin-right: auto;
	padding: 3px;
	outline: 0;
	border: 1px solid #a0b3d6;
	font-size: 12px;
	line-height: 24px;
	padding: 2px;
	word-wrap: break-word;
	overflow-x: hidden;
	overflow-y: auto;
	border-color: rgba(82, 168, 236, 0.8);
	box-shadow: inset 0 1px 3px rgba(0, 0, 0, 0.1), 0 0 8px
		rgba(82, 168, 236, 0.6);
}

.container.color {
	background-color: #D9E8F7;
}

body {
	background-color: #E3EFFB;
}

.textarea {
	width: 500px;
	height: 170px;
	background: url("images/logo.png");
	opacity: 0.9;
	background-size: 100% 100%;
	no-repeat: right top;
}

table {
	margin-top: 50px;
	line-height: 25px;
}

th {
	border: 1px solid #aaa;
}

tr:HOVER {
	border-color: #FF9;
}

.button {
	background-color: #4CAF50; /* Green */
	border: none;
	color: white;
	padding: 5px 10px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
}

.button2 {
	background-color: #008CBA;
} /* Blue */
.but {
	position: relative;
	margin-top: 10px;
	margin-left: 60%;
}

#context img {
	width: 150px;
	height: 160px;
}

#context {
	padding: 10px 10px 10px 10px;
	border: 1px solid lightblue;
}
</style>
</head>

<body><jsp:include page="daohang.jsp"></jsp:include>
	<div class="container">
		<form action="news/updateNewsInfo.action" method="post">
			<input type="hidden" name="newsId" value="${findNewsByone.newsId}">


			<span>新闻ID:${findNewsByone.newsId}的详情 </span>
			<div>
				<span>标题:<input type="text" name="newsTitle"
					value="${findNewsByone.newsTitle}"> </span>
			</div>
			<div>
				<h5>图片</h5>
				<span><img src="${findNewsByone.newsImages}" alt="images"
					width="30" height="55"> <input type="file" name="file">
				</span>
			</div>
			<h5>内容:</h5>
			<div id="context">
				<span>${findNewsByone.newsContext}</span>
			</div>
			<div>
				<h5>作者:${findNewsByone.author.authorName}</h5>
				<span><a href="author/findAuthorList.action">(新增作者)</a> </span>
			</div>
			<div>
				<h5>种类${findNewsByone.type.typeName}</h5>
				<span> <a href=newstype/findTypeList.action>(新增种类)</a> </span>
			</div>
			<div>
				<h5>最后编辑时间:</h5>
				<span><fmt:formatDate value="${findNewsByone.newsDate}"
						pattern="yyyy-MM-dd HH:mm:ss" /> </span>
			</div>
		<!-- 	<button class="button">提交</button> -->
		</form>
	</div>
	<h5 align="center">当前时间与日期</h5>
	<%
		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		out.print("<h5 align=\"center\">" + ft.format(dNow) + "</h5>");
	%>

</body>
</html>