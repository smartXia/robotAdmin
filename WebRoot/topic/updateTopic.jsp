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

<title>My JSP 'updateTopic.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
.textarea {
	width: 400px;
	min-height: 20px;
	max-height: 300px;
	margin-left: auto;
	margin-right: auto;
	padding: 3px;
	outline: 0;
	/* border: 1px solid #a0b3d6; */
	font-size: 12px;
	line-height: 24px;
	padding: 2px;
	word-wrap: break-word;
	overflow-x: hidden;
	overflow-y: auto;
	border-color: rgba(82, 168, 236, 0.8);
/* 	box-shadow: inset 0 1px 3px rgba(0, 0, 0, 0.1), 0 0 8px
		rgba(82, 168, 236, 0.6); */
}

.smallInput {
	background: #ffffff;
	border-bottom-color: #ff6633;
	border-bottom-width: 0px;
	border-top-width: 0px;
	border-left-width: 0px;
	border-right-width: 0px; solid #ff6633;
	color: #000000;
	FONT-SIZE: 9pt;
	FONT-STYLE: normal;
	FONT-VARIANT: normal;
	FONT-WEIGHT: normal;
	HEIGHT: 18px;
	LINE-HEIGHT: normal
}
</style>
</head>

<body><jsp:include page="daohang.jsp"></jsp:include>
	<form action="topic/updateTopicAfter.action" method="post"
		enctype="multipart/form-data">
		<table border="1">

			<tr>
				<td>编号</td>
				<td><input type="text" name="topicId" value="${topic.topicId}">
				</td>

			</tr>
			<tr>
				<td>话题</td>
				<td><input type="text" name="topicTitle"
					value="${topic.topicTitle}">
				</td>

			</tr>
			<tr>

				<td>图片</td>
				<td><img alt="" src="${topic.topicImage}" width="150"
					height="100"> <label>替换图片：</label><input type="file"
					name="file" value="${topic.topicImage}"><br></td>
			</tr>
			<tr>

				<td>内容</td>
				<td><textarea class="textarea" contenteditable="true" ROWS="20"
						COLS="20" class="smallInput" name="topicContext">	
				 ${topic.topicContext}
				</textarea></td>

			</tr>

		</table>
		<input type="submit" value="提交">

	</form>
</body>
</html>
