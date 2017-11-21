<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	String htmlData = request.getParameter("answer") != null
			? request.getParameter("answer")
			: "";
%>
<!doctype html>
<html>
<head>

<meta charset="utf-8" />
<title>KindEditor JSP</title>
<link rel="stylesheet" href="../themes/default/default.css"
	type="text/css"></link>
<link rel="stylesheet" href="../plugins/code/prettify.css"
	type="text/css"></link>
<script type="text/javascript" src="../kindeditor-all-min.js"></script>
<script type="text/javascript" src="../lang/zh-CN.js"></script>
<script type="text/javascript" src="../plugins/code/prettify.js"></script>
<script>
	KindEditor.ready(function(K) {
		var editor1 = K.create('textarea[name="answer"]', {
			cssPath : '../plugins/code/prettify.css',
			uploadJson : '../jsp/upload_json.jsp',
			fileManagerJson : '../jsp/file_manager_json.jsp',
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
		prettyPrint();
	});
</script>





</head>
<body>
	<%-- <%=htmlData%> --%>
	<form action="addfeedback.action" name="example" method="post">

		<input type="text" name="question" value="输入问题">
		<textarea name="answer" cols="100" rows="8"
			style="width:700px;height:200px;visibility:hidden;">
			<%=htmlspecialchars(htmlData)%></textarea>
		<br /> <input type="submit" name="button" value="提交内容" /> (提交快捷键:
		Ctrl + Enter)
	</form>
</body>
</html>
<%!private String htmlspecialchars(String str) {
		str = str.replaceAll("&", "&amp;");
		str = str.replaceAll("<", "&lt;");
		str = str.replaceAll(">", "&gt;");
		str = str.replaceAll("\"", "&quot;");
		return str;
	}%>