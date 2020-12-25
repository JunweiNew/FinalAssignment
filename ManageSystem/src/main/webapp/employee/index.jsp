<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<!--  
<base href="<%=basePath%>">
-->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Human Resource Management System</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<frameset rows="91,*,40" frameborder="NO" border="0" framespacing="0">
	<frame src="../common/top.jsp" name="topFrame" scrolling="NO" noresize>
	<frameset cols="186,*" frameborder="NO" border="0" framespacing="0">
		<frame src="../employee/menu.jsp" name="leftFrame" scrolling="auto"
			noresize>
		<frame src="../common/welcome.jsp" name="mainFrame" scrolling="auto">

	</frameset>
	<frame src="../common/bottom.jsp" name="bottomFrame" scrolling="NO"
		noresize>
</frameset>
<noframes>
	<body>
	</body>
</noframes>
</html>
