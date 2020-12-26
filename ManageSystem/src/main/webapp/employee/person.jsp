<%@ page language="java" import="java.util.*,com.system.employee.entry.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>	
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
<title>Employee information query</title>

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
 <script language="javascript" type="text/javascript">
            function deletep(empid) {
                var r = window.confirm("Do you want to delete?");
                if(r){
                  location.href="delEmp?id="+empid;
                }
            }
</script> 
</head>

<body>
	<table align="center" cellpadding="0" cellspacing="0" class="currentPosition">
  <tr>
    <td width="6" height="22" background="../images/main_top01.gif"></td>
    <td width="1033" background="../images/main_top02.gif">&nbsp;&nbsp;current position:&nbsp;&nbsp;Human Resource Management System &gt;&gt; Browse staff page</td>
    <td width="6" height="22" background="../images/main_top03.gif">&nbsp;</td>
  </tr>
</table>
<TABLE class=iframeResultTableTitle cellSpacing=1 cellPadding=0 align=center>
<TBODY>
<TR>
<TD width="2%" align="center"><IMG src="../images/icon02.gif" width=6 
height=8></TD>
<TD width="44%" align=left>
<DIV align=left><SPAN class=STYLE31>Query result list</SPAN></DIV></TD>
</TR></TBODY></TABLE>

<TABLE id=sortable class=iframeResultTable cellSpacing=0 cellPadding=0 
align=center>
<TBODY>
<TR align="center">
<tr>
	<td  align="left" colspan="9" >
	<div align="left"><input name="submit" type="submit" class="submitbutton" value="add new employee" onclick="location='personregister.jsp'"></div>
	<form name = "form1" action = "<%=request.getContextPath()%>/servlet/FindByEmpServer" method = "post">
		Select search mode
		<select class="submitbutton" name="select" id="select">
		<option>==option==</option>
		<option value="1">employee ID</option>
		<option value="2">employee name</option>
		<option value="3">position</option>
		<option value="4">sex</option>
		</select>
		Please fill in the keywords
		<input type="text" name="input" id="Input" size="10">
		<input name="button" type="submit"  value="immediate search"> 
		</form> </td>
		</tr>
		<TR align="center">
		<TH><A class=sortheader href="">Employee ID<SPAN class=sortarrow> </SPAN></A></TH>
		<TH><A class=sortheader href="">Employee name<SPAN class=sortarrow> </SPAN></A></TH>
		<TH><A class=sortheader href="">Position<SPAN class=sortarrow> </SPAN></A></TH>
		<TH><A class=sortheader href="">Sex<SPAN class=sortarrow> </SPAN></A></TH>
		<TH><A class=sortheader href="">Telephone<SPAN class=sortarrow> </SPAN></A></TH>
		<TH><A class=sortheader href="">Mobile<SPAN class=sortarrow> </SPAN></A></TH>
		<TH><A class=sortheader href="">Email<SPAN class=sortarrow> </SPAN></A></TH>
		<TH><A class=sortheader href="">update<SPAN class=sortarrow> </SPAN></A></TH>
		<TH><A class=sortheader href="">delete<SPAN class=sortarrow> </SPAN></A></TH>
		
		
 <c:forEach items="${emps}" var="c">   
	
<TR align="center" bgColor=#ffffff onMouseOver="this.bgColor='#C1CDD8'" 

onMouseOut="this.bgColor='#ffffff'">
<TD>${c.empId}</TD>
<TD>${c.name}</TD>
<TD>${c.empJob }</TD>
<TD>${c.sex}</TD>
<TD>${c.phone}</TD>
<TD>${c.mobile}</TD>
<TD>${c.email}</TD>
<!-- <td><input class=""submitbutton" type="button" value="ä¿®æ¹" onclick="location.href"</td> 

-->
<TD><A href="toupdateEmp?id=${c.empId}&op=updata">Modify</A></TD>
<TD><A onclick="javascript:deletep(${c.empId}); return false;" href="#"   &op=del">delete</A></TD>

</TR>

     </c:forEach>

	<tr>
		<td colspan="2" align="center">
			<span id="message" style="color: red"><%if((String)request.getAttribute("errormessage")!=null) %><%=(String)request.getAttribute("errormessage") %></span>
		</td>
	</tr>
</TBODY></TABLE>
</body>
</html>