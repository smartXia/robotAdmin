<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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

<title>My JSP 'orderDeatil.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css"></link>
<style type="text/css">
table {
	table-layout: fixed;
	empty-cells: show;
	border-collapse: collapse;
	margin: 0 auto;
}
.sp-grid-import {
	border-collapse: collapse;
	width: 100%;
	border: 1px solid #E1E6EB;
	border-left: none;
}
</style>
</head>

<body>
	<jsp:include page="daohang.jsp"></jsp:include>
	<c:forEach items="${users}" var="user">	买家:${user.userName}&nbsp;&nbsp;&nbsp;电话：${user.userPhone}&nbsp;&nbsp;&nbsp;地址：${user.userAddress}</c:forEach>
	<table class="table">
		<caption>订单详情</caption>
		<thead>
			<tr>
				<th>流水号</th>
				<th>商品流水号</th>
				<th>下单时间</th>

				<th>备注</th>
				<th>状态</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${orders}" var="orders" varStatus="s" begin="0"
				end="0">
				<tr>
					<td>${orders.water}</td>
					<td>${orders.orderId}</td>
					<td><fmt:formatDate value="${orders.createTime}"
							pattern="yyyy-MM-dd HH:mm:ss" />
					</td>
					<td>${orders.note}</td>
					<td>${orders.orderState}</td>
					<td><a href="order/fahuo.action?&water=${orders.water}">点击发货</a>
					</td>
				</tr>
			</c:forEach>

		</tbody>
	</table>
	<table class="sp-grid-import">
		<thead>
			<tr>
				<td>商品名</td>
				<td>图片</td>
				<td>总件数</td>

			</tr>
		</thead>
		<c:forEach items="${orders}" var="order" varStatus="s">
			<tr>
				<td>${order.robotName}</td>
				<td><img src="${order.robotImage}" width="50" height="50">
				<td>${orders.size()}</td>
			</tr>

			<span></span>
			<br>
		</c:forEach>
	</table>


</body>
</html>
