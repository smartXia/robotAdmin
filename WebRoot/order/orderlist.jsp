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
<title>My JSP 'nowOrderList.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css"></link>
</head>

<body><jsp:include page="daohang.jsp"></jsp:include>
	<div class="col-md-8">
		<table class="table table-bordered">
			<caption>所有订单</caption>
			<thead>
				<tr>
					<th>编号</th>
					<th>买家</th>
					<th>流水号</th>
					<th>下单时间</th>
					<th>支付方式</th>
					<th>配送方式</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${orderList}" var="orderList">
					<tr>
						<td>${orderList.id}</td>
						<td>${orderList.userName}</td>
						<td>${orderList.detailId}</td>
						<td><fmt:formatDate value="${orderList.createTime}"
								pattern="yyyy-MM-dd HH:mm:ss" /></td>
						<td>${orderList.payway}</td>
						<td>${orderList.sendway}</td>
						<td><a
							href="order/finddetail.action?&detailId=${orderList.detailId}&userName=${orderList.userName}">查看详情</a>
						</td>

					</tr>
				</c:forEach>
			</tbody>
		</table>
		<br>
		<ul class="pagination">
			<c:choose>
				<c:when test="${pageNo>1}">
					<li><a href="#">&laquo;</a>
					</li>
					<li><a href="order/orderList.action">首页</a>
					</li>
					<li><a href="order/orderList.action?pageNo=${pageNo-1}">上一页</a>
					</li>
				</c:when>
			</c:choose>
			<c:choose>
				<c:when test="${pageNo!=pageNums}">
					<li><a href="order/orderList.action?pageNo=${pageNo+1}">下一页</a>
					</li>
					<li><a href="order/orderList.action?pageNo=${pageNums}">末页</a>
					</li>
				</c:when>
			</c:choose>
		</ul>
		当前页数:[${pageNo}/${pageNums}]
	</div>
</body>

</html>
