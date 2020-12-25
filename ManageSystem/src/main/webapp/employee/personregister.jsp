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
<title>add new employee page</title>

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
    <td width="1033" background="../images/main_top02.gif">&nbsp;&nbsp;Current Page:&nbsp;&nbsp;Human Resource Management System &gt;&gt; Add Employee</td>
    <td width="6" height="22" background="../images/main_top03.gif">&nbsp;</td>
  </tr>
</table>
<!-- <%=path %>/browerEmpInfo -->
<form action="addEmp" method="post" name="consulterForm" style="margin:0">
<table align="center" cellspacing="0" cellpadding="0" class="addModifyForm">
	<tr>
    <th colspan="2" align="left"><img src="../images/if_modify.gif" width="31" height="18"> Add new employee</th>
  </tr>
	<tr>
		<td colspan="3" align="center" background="../images/bg07.gif"><span class="STYLE31">Employee information&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
	</tr>
	
	<tr>
		<td align="right">Name:&nbsp;<font color="red">*</font></td>
		
		<td><input  type="text" size="15"  name="empName" id="empName"/>
		</td>
</tr>
<tr>
		<td align="right">Sex:&nbsp;<font color="red">*</font></td>
		<td>
			<input type="radio" name="sex" id="sex" value="male " checked>male
			<input type="radio" name="sex" id="sex" value="female">female
		</td>
</tr>
<tr>
		<td align="right">ID Card:&nbsp;<font color="red">*</font></td>
		<td>
			<input  type="text" size="15"  name="idCard" id="idCard" />
		</td>
	</tr>
	<tr>
		<td align="right">Telephone:&nbsp;<font color="red">*</font></td>
		<td>
			<input  type="text" size="15"  name="phone" id="phone" />
		</td>
	</tr>
	<tr>
		<td align="right">Mail:&nbsp;<font color="red">*</font></td>
		<td>
			<input  type="text" size="15"  name="email" id="email" />
		</td>
	</tr>
	<tr >
             <td align="right">Address:&nbsp;&nbsp;</td>
              <td colspan="3"><input name="address" id="address" type="text"  size="15"></td>
            </tr>
            <tr >
            <td align="right">PostCode:&nbsp;&nbsp;</td>
              <td colspan="3"><input name="post" id="post" type="text"  size="15" ></td>
            </tr>
            <tr >
             <td align="right">Mobile:&nbsp;&nbsp;</td>
              <td colspan="3"><input name="mobile" id="mobile" type="text"   size="15"></td>
            </tr>
            <tr>
            <td align="right">Position:&nbsp;&nbsp;</td>
              <td colspan="3"><select name="duty"  id="duty">
                <option>==Option==</option>
                <option value="general manager">general manager </option>
                <option value="finance">finance</option>
                <option value="software engineer"> software engineer </option>
                <option value="hardware engineer">hardware engineer </option>
                <option value="...">.....</option>
              </select></td>
            </tr>
              <tr>   </tr>
</table>
<p></p>
<table border="0" align="center">	
	<tr>
		<td align="center" height="30">
			<input type="hidden" name="consulter.registerPost.id" value="6701">
			<input type="hidden" name="consulter.modifyPost.id" value="6701">
			<input type="hidden" name="consulter.managerAuthorize" value="1">
			<input type="hidden" name="linkToCR" value="false" id="linkToCR">
			<input class="submitButton" type="submit" value="submit" />&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="browerEmpInfo">
						<input class="submitbutton" type="button" value="cancel" onclick=""/>
			</a>
		</td>
	</tr>
	<tr>
	<td colspan="2" align="center">
		<span id="message" style="color: red"><%if((String)request.getAttribute("errormessage")!=null) %><%=(String)request.getAttribute("errormessage") %></span>
		</td>
	</tr>
	
</table>
</form>
</body>
</html>
