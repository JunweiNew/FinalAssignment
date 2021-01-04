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
<title>My JSP 'departregister.jsp' starting page</title>

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
	<table align="center" cellpadding="0" cellspacing="0"
		class="currentPosition">
		<tr>
			<td width="6" height="22" background="../images/main_top01.gif"></td>
			<td width="1033" background="../images/main_top02.gif">&nbsp;&nbsp;current
				position:&nbsp; Department management system &gt;&gt; Add Department
				page</td>
			<td width="6" height="22" background="../images/main_top03.gif">&nbsp;</td>
		</tr>
	</table>
	<!-- <%--=path --%>/browerEmpInfo -->
	<form action="addDep" method="post" name="consulterForm">
		<table align="center" cellspacing="0" cellpadding="0"
			class="addModifyForm">
			<tr>
				<th colspan="2" align="left"><img src="../images/if_modify.gif"
					width="31" height="18"> Add department information</th>
			</tr>
			<tr>
				<td colspan="3" align="center" background="../images/bg07.gif"><span
					class="STYLE31">department
						information&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
			</tr>


			<tr>
				<td align="right">department name:<font color="red">*</font></td>

				<td><input type="text" size="15" name="depName" id="depName" />
				</td>
			</tr>
			<tr>
				<td align="right">department number:<font color="red">*</font></td>
				<td><input type="text" size="15" name="depNumber"
					id="depNumber" /></td>
			</tr>
			<tr>
				<td align="right">department phone<font color="red">*</font></td>
				<td><input type="text" size="15" name="depPhone" id="depPhone" />
				</td>
			</tr>
			<tr>
				<td align="right">Supervisor mobile phone:<font color="red">*</font></td>
				<td><input type="text" size="15" name="depMobile"
					id="depMobile" /></td>
			</tr>
			<tr>
				<td align="right">Department Email:&nbsp;&nbsp;</td>
				<td colspan="3"><input name="depEmail" id="depEmail"
					type="text" size="15"></td>
			</tr>
			<tr>
				<td align="right">department head:&nbsp;&nbsp;</td>
				<td colspan="3"><input name="depLeader" id="depLeader"
					type="text" size="15"></td>
			</tr>

			<tr>
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
					<a href="../emp/BrowerDepServlet"> <input class="submitbutton"
						type="button" value="cancel" onclick="" />
				</a></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><span id="message"
					style="color: red">
						<%if((String)request.getAttribute("errormessage")!=null) %><%=(String)request.getAttribute("errormessage") %></span>
				</td>
			</tr>

		</table>
	</form>
</body>
</html>
