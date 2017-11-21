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

<title>My JSP 'success.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<script type="text/javascript" src="js/wangEditor.min.js"></script><script
	type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
</head>
<script type="text/javascript">
	$(document).ready(function() {
		var E = window.wangEditor;
		var editor = new E('#div1');
		editor.create();
		document.getElementById('btn1').addEventListener('click', function() {
			// 读取 html	
			alert(editor.txt.html());
			location.href = "news/test.action?newsContext=" + editor.txt.html();
		}, false);

		document.getElementById('btn2').addEventListener('click', function() {
			// 读取 text
			alert(editor.txt.text());

		}, false);
	});
</script>
<body><jsp:include page="daohang.jsp"></jsp:include>
	<form action="file/upload.action" method="post"
		enctype="multipart/form-data">
		<label>用户名：</label><input type="text" name="userName"><br>
		<label>密码：</label><input type="password" name="userPwd"><br>
		<label>上传头像：</label><input type="file" name="file"><br> <input
			type="submit">
	</form>
	<div id="div1">
		<p>欢迎使用 wangEditor 编辑器</p>
	</div>
	<button id="btn1">获取html</button>
	<button id="btn2">获取text</button>


</body>
</html>
