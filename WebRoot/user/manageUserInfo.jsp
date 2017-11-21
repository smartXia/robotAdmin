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

<title>My JSP 'manageUserInfo.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css"></link>

<style type="text/css">
#model {
	padding: 50 50 20 50;
}

#fenye {
	float: right;
}

/* body {
	background-color: #E3EFFB;
} */
</style>

<script type="text/javascript">
	
	var money = $("#money").val();
	

	
</script>
</head>

<body><jsp:include page="daohang.jsp"></jsp:include>
	<div id="model">
		<table border="1" class="table table-hover">

			<tr>
				<td>编号</td>
				<td>姓名</td>
				<td>密码</td>
				<td>头像</td>
				<td>电子邮件</td>
				<td>地址</td>
				<td>手机号</td>
				<td>账户金额</td>
				<td colspan="2" align="center">操作</td>

			</tr>
			<c:forEach items="${userInfoList }" var="userInfoList">
				<tr>
					<td>${userInfoList.userId}</td>
					<td>${userInfoList.userName}</td>
					<td>${userInfoList.userPwd}</td>
					<td><img src="${basePath}${userInfoList.userImage} "
						width="30" height="25">
					</td>
					<td>${userInfoList.userEmail}</td>
					<td>${userInfoList.userAddress}</td>
					<td>${userInfoList.userPhone}</td>
					<td id="money">${userInfoList.userMoney}</td>
					<td><a
						href="userinfo/userInfoUpdate.action?&userId=${userInfoList.userId}&userName=${userInfoList.userName}">充值金额</a>
					</td>
					<td><a
						onclick="if (confirm('确定要删除吗？')) return true; else return false;"
						href="userinfo/userInfoDel.action?userId=${userInfoList.userId}">删除</a>
					</td>
				</tr>
			</c:forEach>
		</table>
		<div id="fenye">
			<ul class="pagination">
				<c:choose>
					<c:when test="${pageNo>1}">
						<li><a href="#">&laquo;</a></li>
						<li><a href="userinfo/userInfoList.action">首页</a></li>
						<li><a href="userinfo/userInfoList.action?pageNo=${pageNo-1}">上一页</a>
						</li>
					</c:when>
				</c:choose>

				<c:choose>
					<c:when test="${pageNo!=pageNums}">
						<li><a href="userinfo/userInfoList.action?pageNo=${pageNo+1}">下一页</a>
						</li>
						<li><a href="userinfo/userInfoList.action?pageNo=${pageNums}">末页</a>
						</li>
					</c:when>
				</c:choose>

			</ul>
			<h5>当前页数:[${pageNo}/${pageNums}]</h5>
		</div>
	</div>
</body>
</html>
