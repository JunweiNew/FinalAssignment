<%@ page language="java"
	import="java.util.*,com.system.employee.entry.*"
	pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<% 
List<Employee> emps=(List<Employee>)request.getAttribute("emps"); 
int empId = emps.get(0).getEmpId(); 
String empName = emps.get(0).getName();
String sex = emps.get(0).getSex();
String idCard = emps.get(0).getIdCard();
String phone = emps.get(0).getPhone();
String email = emps.get(0).getEmail();
String address = emps.get(0).getAddress();
String post = emps.get(0).getPost();
String mobile = emps.get(0).getMobile();
String duty = emps.get(0).getEmpJob();
%>

<html>
<head>
<!-- 
<base href="<%=basePath%>">
 -->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Modify employee information</title>

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
				position:&nbsp;&nbsp;Human Resource Management System &gt;&gt;
				Modify the emploee page</td>
			<td width="6" height="22" background="../images/main_top03.gif">&nbsp;</td>
		</tr>
	</table>
	<form action="updataEmployee" method="post" name="consulterForm"
		style="margin:0">
		<table align="center" cellspacing="0" cellpadding="0"
			class="addModifyForm">
			<tr>
				<th colspan="2" align="left"><img src="../images/if_modify.gif"
					width="31" height="18"> modify employee information</th>
			</tr>
			<tr>
				<td colspan="2" align="center" background="../images/bg07.gif"><span
					class="STYLE31">employee
						information&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
			</tr>

			<tr>
				<td align="right">name:<font color="red">*</font></td>

				<td><input type="text" size="15" name="empName" id="empName"
					value="<%=empName %>" /></td>
			</tr>
			<tr>
				<td align="right">sex:<font color="red">*</font></td>
				<td><input type="radio" name="sex" id== "sex" value="男"
					<%=sex.equals("男")?"checked":"" %> />男 <input type="radio"
					name="sex" id== "sex" value="女" <%=sex.equals("女")?"checked":"" %> />女
				</td>
			</tr>
			<tr>
				<td align="right">ID:<font color="red">*</font></td>
				<td><input type="text" size="15" name="idCard" id="idCard"
					value="<%=idCard %>" /></td>
			</tr>
			<tr>
				<td align="right">Telephone<font color="red">*</font></td>
				<td><input type="text" size="15" name="phone" id="phone"
					value="<%=phone %>" /></td>
			</tr>
			<tr>
				<td align="right">mail:<font color="red">*</font></td>
				<td><input type="text" size="15" name="email" id="email"
					value="<%=email %>" /></td>
			</tr>
			<tr>
				<td align="right">address:&nbsp;&nbsp;</td>
				<td colspan="3"><input name="address" id="address" type="text"
					size="15" value="<%=address %>"></td>
			</tr>
			<tr>
				<td align="right">postcode:&nbsp;&nbsp;</td>
				<td colspan="3"><input name="post" id="post" type="text"
					size="15" value="<%=post %>"></td>
			</tr>
			<tr>
				<td align="right">mobile:&nbsp;&nbsp;</td>
				<td colspan="3"><input name="mobile" id="mobile" type="text"
					size="15" value="<%=mobile %>"></td>
			</tr>
			<tr>
				<td align="right">duty&nbsp;&nbsp;</td>
				<td colspan="3"><select name="duty" id="duty">
						<option>==option==</option>
						<option value="general manager "
							<%=duty.equals("general manager ")?"selected":"" %>>general
							manager</option>
						<option value="finance" <%=duty.equals("finance")?"selected":"" %>>finance</option>
						<option value="software engineer"
							<%=duty.equals("software engineer")?"selected":"" %>>software
							engineer</option>
						<option value="hardware engineer"
							<%=duty.equals("hardware engineer")?"selected":"" %>>hardware
							engineer</option>
						<option>.....</option>
				</select></td>
			</tr>
			<tr>
				<td><input type="hidden" size="15" name="id" id="id"
					value="<%=empId %>" /></td>
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
					<a href="browerEmpInfo"> <input class="submitbutton"
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
