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

<title>My JSP 'addRobotInfo.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css"></link>
<style type="text/css">
body {
	background-color: #E3EFFB;
}
</style>
</head>

<body><jsp:include page="daohang.jsp"></jsp:include>
	<div class="container">

		<form action="robot/addRobotInfo.action" method="post"
			enctype="multipart/form-data" id="formid">
			<table border="1" class="table-bordered">
				<caption>产品新增界面</caption>
				<tr>
					<td>名称</td>
					<td><input type="text" value="" name="robotName"
						id="robotName">
					</td>
				</tr>
				<tr>
					<td>种类</td>

					<td><select name="robotType">
							<c:forEach items="${robotTypeList}" var="robotTypeList">
								<option value="${robotTypeList.typeName}">${robotTypeList.typeName}</option>
							</c:forEach>
					</select>
					</td>
				</tr>
				<tr>
					<td>生产商</td>

					<td><select name="robotCompany">
							<c:forEach items="${showRobotComList}" var="showRobotComList">
								<option value="${showRobotComList.companyName}">${showRobotComList.companyName}</option>
							</c:forEach>
					</select>
					</td>
				</tr>
				<tr>
					<td>图片</td>
					<td><label></label><input type="file" name="file"><br>
					</td>
				</tr>
				<tr>
					<td>价格</td>
					<td><input type="text" value="" name="robotPrice"
						id="robotPrice">
					</td>
				</tr>
				<tr>
					<td>评论</td>
					<td><input type="text" value="不可编辑" disabled="disabled">
					</td>
				</tr>
				<tr>
					<td>余货</td>
					<td><input type="text" value="" name="robotCount"
						id="robotCount">
					</td>
				</tr>
			</table>

			<br>

			<button type="button" class="btn btn-success btn-sm"
				onclick="check()">新增商品信息</button>
		</form>
	</div>
	<script type="text/javascript">
		function check() {
			var name = $("#robotName").val();
		
			var price = $("#robotPrice").val();
			var count = $("#robotCount").val();
			if (name.length == 0 || price.length == 0  || count.length == 0 ) {
				alert("就三个值还不输入完！！");
				return false;
			} else {
				alert("添加信息成功");
				return document.getElementById("formid").submit();
			}
		}
	</script>
</body>
</html>
