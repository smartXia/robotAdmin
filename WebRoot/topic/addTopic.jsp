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

<title>My JSP 'addTopic.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css"></link>

<style type="text/css">
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
	width: 100%;
	background-size: 100% 100%;
	width: 100%;
	no-repeat: right top;
	width: 100%;
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
</style>
</head>
<body>
	<div class="container color">
		<form action="topic/addTopic.action" method="post"
			enctype="multipart/form-data" id="formid">
			<table width="500" cellpadding="0" cellspacing="1">

				<tr>
					<td>编号</td>
					<td><input type="text" name="topicId" disabled="disabled">
					</td>

				</tr>
				<tr>
					<td>话题</td>
					<td><input type="text" name="topicTitle" id="topicTitle">
					</td>

				</tr>
				<tr>

					<td>图片</td>
					<td><input type="file" name="file">
				</tr>
				<tr>

					<td>内容</td>
					<td><textarea class="textarea" contenteditable="true"
							name="topicContext">	
	
				</textarea></td>

				</tr>

			</table>
			<div class="but">
				<button type="button" class="btn btn-success btn-sm"
					onclick="check()">新增信息</button>
				<button class="button button2" type="reset">重置</button>
			</div>
		</form>
	</div>
	<script type="text/javascript">
		function check() {
			var name = $("#topicTitle").val();

			if (name.length == 0) {
				alert("请输入标题！！");
				return false;
			} else {
				alert("添加信息成功");
				return document.getElementById("formid").submit();
			}
		}
	</script>
</body>
</html>
