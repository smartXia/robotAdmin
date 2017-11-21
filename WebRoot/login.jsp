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
<LINK href="css/admin.css" type="text/css" rel="stylesheet">
<title>My JSP 'login.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<style type="text/css">
#name {
	BORDER-RIGHT: #000000 1px solid;
	BORDER-TOP: #000000 1px solid;
	BORDER-LEFT: #000000 1px solid;
	BORDER-BOTTOM: #000000 1px solid;
	maxLength: 30;
	size: 24;
}

#pwd {
	BORDER-RIGHT: #000000 1px solid;
	BORDER-TOP: #000000 1px solid;
	BORDER-LEFT: #000000 1px solid;
	BORDER-BOTTOM: #000000 1px solid;
	maxLength: 30;
	size: 24;
}
</style>
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
</head>

<script type="text/javascript">
	$(function() {
		$("#Login")
				.click(
						function() {
							var name = $("#name").val();
							var pwd = $("#pwd").val();
							if (name.length == 0 && pwd.length == 0) {
								alert("用户名密码需要输入");

							} else if (name.length == 0) {
								alert("用户名需要输入");

							} else if (pwd.length == 0) {
								alert("密码需要输入");
							} else {
								$
										.ajax({
											url : "admin/loginbyadmin.action",
											type : "POST",
											datatype : "json",//传个单值到后台
											data : {//穿多个值到前台是contentType : 'application/json;charset=utf-8',
												adminName : name,//传到前台选哦用json的格式
												adminPwd : pwd
											},
											success : function(sss) {//接收回调函数的返回结果

												/* 	alert(sss); */
												if (sss == '') {//为空的时候用‘’号传过来
													alert("账户名或密码不正常，请重新输入");
													location.href = "login.jsp";
												} else {
													alert("欢迎" + sss.adminName
															+ "登录"
															+ sss.adminId);
													location.href = "admin/adminInfo.action?adminId="
															+ sss.adminId;//定位到需要的servlet，也可以是页面s

												}

											}
										});
							}
						});
	});
</script>
<BODY onload=document.form1.name.focus();>
	<TABLE height="100%" cellSpacing=0 cellPadding=0 width="100%"
		bgColor=#002779 border=0>
		<TR>
			<TD align=middle>
				<TABLE cellSpacing=0 cellPadding=0 width=468 border=0>
					<TR>
						<TD><IMG height=23 src="images/login_1.jpg" width=468>
						</TD>
					</TR>
					<TR>
						<TD><IMG height=147 src="images/login_2.jpg" width=468>
						</TD>
					</TR>
				</TABLE>
				<TABLE cellSpacing=0 cellPadding=0 width=468 bgColor=#ffffff
					border=0>
					<TR>
						<TD width=16><IMG height=122 src="images/login_3.jpg"
							width=16></TD>
						<TD align=middle>
							<TABLE cellSpacing=0 cellPadding=0 width=250 border=0>
								<FORM action="" method=post>
									<TR height=5>
										<TD width=5></TD>
										<TD width=56></TD>
										<TD></TD>
									</TR>
									<TR height=36>
										<TD></TD>
										<TD>用户：</TD>
										<TD><INPUT type="text" value="" name="adminName"
											id="name">
										</TD>
									</TR>
									<TR height=36>
										<TD>&nbsp;</TD>
										<TD>密码：</TD>
										<TD><INPUT type="text" value="" name="adminPwd" id="pwd">
										</TD>
									</TR>
									<TR height=5>
										<TD colSpan=3></TD>
									</TR>
									<TR>
										<TD>&nbsp;</TD>
										<TD>&nbsp;</TD>
										<TD><INPUT type="button" value="登录系统" onclick=""
											id="Login"></TD>
									</TR>
								</FORM>
							</TABLE></TD>
						<TD width=16><IMG height=122 src="images/login_4.jpg"
							width=16></TD>
					</TR>
				</TABLE>
				<TABLE cellSpacing=0 cellPadding=0 width=468 border=0>
					<TR>
						<TD><IMG height=16 src="images/login_5.jpg" width=468>
						</TD>
					</TR>
				</TABLE>
				<TABLE cellSpacing=0 cellPadding=0 width=468 border=0>
					<TR>
						<TD align=right><A href="http://www.865171.cn/" target=_blank>
								<IMG height=26 src="images/login_6.gif" width=165 border=0>
						</A></TD>
					</TR>
				</TABLE></TD>
		</TR>
	</TABLE>
</BODY>

</HTML>