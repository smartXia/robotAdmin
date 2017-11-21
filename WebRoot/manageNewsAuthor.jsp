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

<title>My JSP 'test.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<link rel="shortcut icon" href="images/bitbug_favicon.ico" />

<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css"></link>
<style type="text/css">
body {
	background-color: #E3EFFB;
}
</style>
</head>
<script type="text/javascript">
	//追加行程
	function Add(obj) {
		$("#orical").append($("#addLine").html());
	}
	//移除详细行
	function Remove(obj) {
		$(obj).parent().parent().remove();
	}

	function tijiao() {
		var auhthorId = $("#addAuthorId").val;
		var auhthorName = $("#addAuthorName").val;
		alert(authorName);
		if (authotName.length == 0) {
			alert("作者为空,请输入作者");
		} else {
			location.href = "newsAuthorAdd.action?&authorId=" + authorId
					+ "&authorName=" + authorName;
		}

	}
</script>


<body><jsp:include page="daohang.jsp"></jsp:include>
	<div class="container">
		<!-- 只能新增或者删除没有外键关联的作者名 -->
		<table border="1" id="orical" class="table table-striped">
			<caption>新闻作者管理</caption>
			<tr>
				<td>编号</td>
				<td>作者名</td>
				<td colspan="2" align="center">操作</td>
			</tr>
			<c:forEach items="${newsAuthorList}" var="newsAuthorList">
				<tr>
					<form action="author/newsAuthorUpdate.action" method="post">
						<td><input type="text" value="${newsAuthorList.authorId}"
							name="authorId">
						</td>
						<td><input type="text" value="${newsAuthorList.authorName}"
							name="authorName">
						</td>
						<td><input type="submit" value="更新"
							class="btn btn-success btn-sm"></td>
					</form>
					<td><a
						onclick="if (confirm('确定要删除吗？')) return true; else return false;"
						href="author/newsAuthorDel.action?authorId=${newsAuthorList.authorId}"
						class="btn btn-danger btn-sm">删除</a>
					</td>
				</tr>
			</c:forEach>
		</table>
		<!-- <input type="button" value="回帖  " onclick="Add(this);" key="1" /> -->
		<form action="author/newsAuthorAdd.action" method="post" id="formid">
			<table id="addLine" border="1">
				<!-- style="display: none 产生的结果是提交不了表单-->
				<tr>
					<td><input type="text" id="addAuthorId" name="authorId"
						disabled="disabled" /></td>添加作者
					<td><input type="text" id="addAuthorName" name="authorName" />
					</td>

					<td colspan="2" align="center">
				</tr>
			</table>
			<button type="button" class="btn btn-info btn-sm" onclick="check()">提交信息</button>
		</form>
	</div>
	<script type="text/javascript">
		function check() {
			var uemail = $("#addAuthorName").val();
			if (uemail.length == 0) {
				alert("请输入值！！");
				return false;
			} else {
				alert("添加信息成功");
				return document.getElementById("formid").submit();
			}
		}
	</script>
</body>
</html>
