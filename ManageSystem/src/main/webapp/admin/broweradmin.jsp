<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ page import="com.system.admin.entry.Admin"%>
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
  
<title>My JSP 'broweradmin.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Employee information query</title>
<link href="../css/main.css" rel="stylesheet" type="text/css">
<script language="JavaScript" src="../js/tool.js"></script>
</head>
<body>
	<table align="center" cellpadding="0" cellspacing="0" class="currentPosition">
		<tr>
			<td width="6" height="22" background="../images/main_top01.gif"></td>
			<td width="1033" background="../images/main_top02.gif">&nbsp;&nbsp;current position :&nbsp;&nbsp;Human Resource Management System &gt;&gt; Browse administrator</td>
			<td width="6" height="22" background="../images/main_top03.gif">&nbsp;</td>
		</tr>
	</table>
	<TABLE class=iframeResultTableTitle cellSpacing=1 cellPadding=0 align=center>
		<TBODY>
			<TR>
				<TD width="2%" align="center"><IMG src="../images/icon02.gif"
					width=6 height=8></TD>
				<TD width="44%" align=left>
					<DIV align=left>
						<SPAN class=STYLE31>Query result list</SPAN>
					</DIV>
				</TD>
			</TR>
		</TBODY>
	</TABLE>

	<TABLE id=sortable class=iframeResultTable cellSpacing=0 cellPadding=0
		align=center>
		<TBODY>
			<TR align="center">
			<TR align="center">
				<TH><A class=sortheader>AdminName<SPAN class=sortarrow> </SPAN></A></TH>
				<TH><A class=sortheader>AdminPassword<SPAN class=sortarrow> </SPAN></A></TH>
				<TH><A class=sortheader><SPAN class=sortarrow> </SPAN></A></TH>
			</TR>

<%
	List<Admin> admins=(List<Admin>) request.getAttribute("admins"); 
	if(admins!=null&&admins.size()>0){
		for(int i=0;i<admins.size();i++){
%>

			<TR align="center" bgColor=#ffffff onMouseOver="this.bgColor='#C1CDD8'" onMouseOut="this.bgColor='#ffffff'">
				<TD><%=admins.get(i).getUsername() %></TD>
				<TD><%=admins.get(i).getPassword() %></TD>
				<TD><A href="DelAdminServlet?username=<%=admins.get(i).getUsername()%>&op=del">delete</A></TD>
			</TR>
<%
		}
	} 
%>
<!--
			<tr>
				<td colspan="2" align="center"><span id="message" style="color: red">
					<%if((String)request.getAttribute("errormessage")!=null) %><%=(String)request.getAttribute("errormessage") %></span>
				</td>
			</tr>
-->
		</TBODY>
	</TABLE>
</body>
</body>
</html>
