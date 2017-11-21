<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.io.*,java.util.*"%>
<%@ page import="javax.servlet.*,java.text.*"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//Dspan HTML 4.01 spanansitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>My JSP 'add.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-conspanol" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" href="kindeditor/themes/default/default.css"
	type="text/css"></link>

<link rel="stylesheet" href="kindeditor/plugins/code/prettify.css"
	type="text/css"></link>
<script type="text/javascript" src="kindeditor/kindeditor-all-min.js"></script>
<script type="text/javascript" src="kindeditor/lang/zh-CN.js"></script>
<script type="text/javascript" src="kindeditor/plugins/code/prettify.js"></script>

<script>
	KindEditor.ready(function(K) {
		var editor1 = K.create('textarea[name="newsContext"]', {
			cssPath : 'kindeditor/plugins/code/prettify.css',
			uploadJson : 'kindeditor/jsp/upload_json.jsp',
			fileManagerJson : 'kindeditor/jsp/file_manager_json.jsp',
			allowFileManager : true,
		/* afterCreate : function() {
			var self = this;
			K.ctrl(document, 13, function() {
				self.sync();
				document.forms['example'].submit();
			});
			K.ctrl(self.edit.doc, 13, function() {
				self.sync();
				document.forms['example'].submit();
			});
		} */
		});

	});
</script>

<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css"></link>


<style type="text/css">
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

body {
	background-color: #E3EFFB;
}
</style>

</head>
<body><jsp:include page="daohang.jsp"></jsp:include>
	<div class="container">
		<h4>欢迎来到新闻网添加页面</h4>
		<form action="news/addNewsInfoAfter.action" method="post"
			enctype="multipart/form-data" role="form">

			<div class="form-group">
				<label for="name">标题</label> <span><input type="text"
					name="newsTitle" value=""> </span>
			</div>
			<div>
				<label for="name">作者</label> <span><select name="newsAuthor">
						<c:forEach items="${newsAuthorList}" var="newsAuthorList">
							<option value="${newsAuthorList.authorId}">${newsAuthorList.authorName}</option>
						</c:forEach>
				</select><a href="findAuthorList.action">编辑作者</a> </span>
			</div>
			<div>
				<label for="name">种类</label> <span><select name="newsType">
						<c:forEach items="${newsTypeList}" var="newsTypeList">

							<option value="${newsTypeList.typeId}">
								<lable for="name"></lable>
								${newsTypeList.typeName}
							</option>

						</c:forEach>
				</select><a href="findTypeList.action">编辑种类</a> </span>
			</div>
			<div class="form-group">
				<label for="inputfile">新闻图片</label> <input type="file"
					id="inputfile" name="file">
				<p class="help-block">这里是放在简介中展示图。</p>
			</div>
			<div>
				<label for="name">内容</label>
				<textarea name="newsContext" cols="100" rows="8"
					style="width:700px;height:200px;visibility:hidden;">
			</textarea>
			</div>
			<div>
				<span>编辑时间&nbsp;&nbsp;&nbsp;&nbsp;${findNewsByone.newsDate} <input
					type="text" name="newsDate" value="CURRENT_TIMESTAMP"> </span>

				<div>
					<span> <input type="submit" name="button" class="button"
						value="提交内容" onclick="if (confirm('您添加新闻信息成功!')) return true; else return false;"/> (提交快捷键: Cspanl + Enter)</span>
				</div>
			</div>
		</form>
		<h5 align="center">当前时间与日期</h5>
		<%
			Date dNow = new Date();
			SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			out.print("<h5 align=\"center\">" + ft.format(dNow) + "</h5>");
		%>
	</div>
</body>
</html>