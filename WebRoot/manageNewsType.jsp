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
		<table border="1" id="orical" class="table table-striped">
			<tr>
				<td>编号</td>
				<td>种类</td>
				<td colspan="2" align="center">操作</td>
			</tr>
			<c:forEach items="${findTypeList}" var="findTypeList">
				<tr>
					<form action="newstype/newsTypeUpdate.action" method="post">
						<td><input type="text" value="${findTypeList.typeId}"
							name="typeId"></td>
						<td><input type="text" value="${findTypeList.typeName}"
							name="typeName"></td>
						<td><input type="submit" value="更新"
							class="btn btn-success btn-sm">
						</td>
					</form>
					<td><a
						onclick="if (confirm('确定要删除吗？')) return true; else return false;"
						href="newstype/newsTypeDel.action?typeId=${findTypeList.typeId}"
						class="btn btn-danger btn-sm">删除</a>
					</td>
				</tr>
			</c:forEach>
		</table>
		<!-- <input type="button" value="回帖  " onclick="Add(this);" key="1" /> -->
		<form action="newstype/newsTypeAdd.action" method="post" id="formid">
			<table id="addLine" border="1">
				<!-- style="display: none 产生的结果是提交不了表单-->
				<tr>
					<td><input type="text" id="addTypeId" name="typeId"
						disabled="disabled" /></td>
					<td><input type="text" id="addTypeName" name="typeName" /></td>
					<td>123</td>
					<td colspan="2" align="center">
				</tr>
			</table>
			<button type="button" class="btn btn-info btn-sm" onclick="check()">提交信息</button>
		</form>
	</div>
	<script type="text/javascript">
		function check() {
			var uemail = $("#addTypeName").val();
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
