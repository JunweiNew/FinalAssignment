<%@ page language="java" import="java.util.*,com.system.department.entry.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<%
	List<Department> deps = (List<Department>)request.getAttribute("deps");
	
	//String id     = deps.get(0).getDepId();
	int id=deps.get(0).getDepId();
	String name   = deps.get(0).getDepName();
	String number = deps.get(0).getDepNumber();
	String phone  = deps.get(0).getDepPhone();
	String mobile = deps.get(0).getDepMobile();
	String email  = deps.get(0).getDepEmail();
	String leader = deps.get(0).getDepLeader(); 
%>
	
<html>
<head>
<!--  
<base href="<%=basePath%>">
-->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Department Update</title>

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
			<td width="1033" background="../images/main_top02.gif">&nbsp;&nbsp;Current position:&nbsp;&nbsp;Department management system &gt;&gt; Modify department information</td>
			<td width="6" height="22" background="../images/main_top03.gif">&nbsp;</td>
		</tr>
	</table>
	<form action="UpdataDepServlet" method="post" name="consulterForm"style="margin:0">
		<table align="center" cellspacing="0" cellpadding="0" class="addModifyForm">
			<tr>
				<th colspan="2" align="left"><img src="../images/if_modify.gif" width="31" height="18"> Modify department information</th>
			</tr>
			<tr>
				<td colspan="2" align="center" background="../images/bg07.gif"><span
					class="STYLE31">Department
						Information&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
			</tr>
			<tr>
				<td align="right">Department name<font color="red">*</font></td>
				<td><input type="text" name="depName" id="depName"
					value="<%=name%>" /></td>
			</tr>
			<tr>
				<td align="right">Department Number:<font color="red">*</font></td>
				<td><input type="text" size="15" name="depNumber"
					id="depNumber" value="<%=number %>" /></td>
			</tr>
			<tr>
				<td align="right">Department Phone:<font color="red">*</font></td>
				<td><input type="text" size="15" name="depPhone" id="phone"
					value="<%=phone %>" /></td>
			</tr>
			<tr>
				<td align="right">Supervisor Telephone:<font color="red">*</font></td>
				<td><input type="text" size="15" name="depMobile"
					id="depMobile" value="<%=mobile %>" /></td>
			</tr>
			<tr>
				<td align="right">Post Box:&nbsp;&nbsp;</td>
				<td colspan="3"><input name="depEmail" id="depEmail"
					type="text" size="15" value="<%=email%>"></td>
			</tr>
			<tr>
				<td align="right">The Header:&nbsp;&nbsp;</td>
				<td colspan="3"><input name="depLeader" id="depLeader"
					type="text" size="15" value="<%=leader %>"></td>
			</tr>
			<tr>
				<td><input type="hidden" size="15" name="depId" id="depId"
					value="<%=id %>" /></td>
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
					<input class="submitButton" type="reset" value="cancel" /></td>
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