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

<title>My JSP 'test.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<link rel="stylesheet" href="kindeditor/themes/default/default.css"
	type="text/css"></link>
<link rel="stylesheet" href="kindeditor/plugins/code/prettify.css"
	type="text/css"></link>
<script type="text/javascript" src="kindeditor/kindeditor-all-min.js"></script>
<script type="text/javascript" src="kindeditor/lang/zh-CN.js"></script>
<script type="text/javascript" src="kindeditor/plugins/code/prettify.js"></script>
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css"></link>
<script>
	KindEditor.ready(function(K) {
		var editor1 = K.create('textarea[name="answer"]', {
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


</head>

<body>
	<jsp:include page="daohang.jsp"></jsp:include>
	<div class="container">
		<form action="addfeedback.action" name="example" method="post"
			id="formid">
			<p>输入问题</p>
			<input type="text" name="question" value="" id="question"> <br>
			<br> 输入回答
			<textarea name="answer" cols="100" rows="8"
				style="width:700px;height:200px;visibility:hidden;">
			</textarea>
			<br />
			<button type="button" class="btn btn-success btn-sm"
				onclick="check()">提交</button>
			(提交快捷键: Ctrl + Enter)
		</form>
	</div>
	<script type="text/javascript">
		function check() {
			var name = $("#question").val();

			if (name.length == 0) {
				alert("请输入完整信息");
				return false;
			} else {
				alert("添加信息成功");
				return document.getElementById("formid").submit();
			}
		}
	</script>
</body>
</html>
