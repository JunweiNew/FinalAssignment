<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
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
<title>update password</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link href="../css/main.css" rel="stylesheet" type="text/css">
<script language="JavaScript" src="../js/tool.js"></script>
</head>

<body>
	<table align="center" cellpadding="0" cellspacing="0" class="currentPosition">
		<tr>
			<td width="6" height="22" background="../images/main_top01.gif"></td>
			<td width="1033" background="../images/main_top02.gif">&nbsp;&nbsp;current position :&nbsp;&nbsp;Human Resource Management System &gt;&gt; Modify the password</td>
			<td width="6" height="22" background="../images/main_top03.gif">&nbsp;</td>
		</tr>
	</table>
	<form action="UpdataAdminServlet" method="post" name="consulterForm"
		style="margin:0">
		<table align="center" cellspacing="0" cellpadding="0"
			class="addModifyForm">
			<tr>
				<th colspan="2" align="left"><img src="../images/if_modify.gif"
					width="31" height="18">Modify Admin password</th>
			</tr>
			<tr>
				<td colspan="2" align="center" background="../images/bg07.gif"><span
					class="STYLE31">Admin information&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
			</tr>
			<tr>
				<td align="right">Please input password:<font color="red">*</font></td>
				<td><input type="text" name="password" id="password" /></td>
			</tr>
			<tr>
				<td align="right">Please reconfirm password:<font color="red">*</font></td>
				<td><input type="text" size="20" name="password" id="password" value="" /></td>
			</tr>

		</table>
		<p></p>
		<table border="0" align="center">
			<tr>
				<td align="center" height="30"><input type="hidden"
					name="consulter.registerPost.id" value="6701"> <input
					type="hidden" name="consulter.modifyPost.id" value="6701">
					<input type="hidden" name="consulter.managerAuthorize" value="1">
					<input type="hidden" name="linkToCR" value="false" id="linkToCR">
					<input class="submitButton" type="submit" value="submit" />&nbsp;&nbsp;&nbsp;&nbsp;
					<input class="submitButton" type="reset" value="clean" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
				<span id="message" style="color: red">
						<%if((String)request.getAttribute("errormessage")!=null) %><%=(String)request.getAttribute("errormessage") %></span>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
