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

<title>My JSP 'test11.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style>
.textarea {
	width: 500px;
	height: 170px;
	background: url("images/logo.png");
	opacity:0.9;
	width: 100%;
	
	background-size: 100% 100%; 
	width : 100%;
	no-repeat: right top;
	width: 100%;
}
.textfield {
	width: 500px;
	height: 18px;
	background-image:
		url(http://www.lanrentuku.com/down/js/images/12450456761.gif);
	color: #ccc;
	border: solid 1px #999;
	padding: 3px 0px 0px 5px;
}
</style>
</head>

<body>

	<table width="510" border="0" align="center" cellpadding="0"
		cellspacing="0">
		<tr>
			<td height="29"><input name="search" type="text" id="search"
				class="textfield"
				onfocus="if(this.value=='关键字') {this.value='';}this.style.color='#333';"
				onblur="if(this.value=='') {this.value='关键字';this.style.color='#ccc';}"
				value="关键字" maxlength="20" /></td>
		</tr>
		<tr>
			<td height="82"><textarea name="textarea" class="textarea">
</textarea>
			</td>
		</tr>
	</table>

</body>
</html>
