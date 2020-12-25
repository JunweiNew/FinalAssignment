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
<title>Untitled document</title>
<script type="text/javascript" src="../js/tool.js"></script>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>
<body onload="init()">
	<table width="100%" height="64" border="0" align="center"
		cellpadding="0" cellspacing="0" background="../images/bg01.gif">
		<tr>
			<td width="316"><img src="../images/logo.jpg" width="316"
				height="64" /></td>
			<td width="502">&nbsp;</td>
		</tr>
	</table>
</body>
</html>
