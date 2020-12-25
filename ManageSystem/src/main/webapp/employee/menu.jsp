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
<link href="<%=path%>/css/frame.css" rel="stylesheet" type="text/css" />
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script language="JavaScript" src="../js/tool.js"></script>
<script language="JavaScript">
	</script>

<style type="text/css">
</style>

</head>

<body bgcolor="#EFEEF7">
<style>
A.applink:hover {
	border: 2px dotted #DCE6F4;
	padding: 2px;
	background-color: #ffff00;
	color: green;
	text-decoration: none
}

A.applink {
	border: 2px dotted #DCE6F4;
	padding: 2px;
	color: #2F5BFF;
	background: transparent;
	text-decoration: none
}

A.info {
	color: #2F5BFF;
	background: transparent;
	text-decoration: none
}

A.info:hover {
	color: green;
	background: transparent;
	text-decoration: underline
}
</style>
	<TABLE border=0 cellSpacing=0 cellPadding=0 width="100%">
		<TBODY>
			<TR>
				<TD class=line3 width="100%">
					<TABLE border=0 cellSpacing=0 cellPadding=0 width=175 align=center>
						<TBODY>
							<TR>
								<TD><IMG src="../images/left_menu.gif" width=175 height=28>
								</TD>
							</TR>
						</TBODY>
					</TABLE>
					<TABLE border=0 cellSpacing=0 cellPadding=0 width=165
						background=../images/bg05.gif align=center>
						<TBODY>
							<TR>
								<TD><IMG src="../images/left_top.gif" width=165 height=3>
								</TD>
							</TR>
							<TR>
								<TD>


									<TABLE class=menu align=center>
										<TBODY>
											<TR>
												<TD width=30>&nbsp;</TD>
												<TD width=126><SPAN style="CURSOR: hand"
													onclick="changeDisplay('empMsg')">Employee manage</SPAN></TD>
											</TR>
										</TBODY>
									</TABLE>
									<TABLE style="DISPLAY: hand" id=empMsg class=menu2 align=center>
										<TBODY>
											<TR>
												<TD width=30>&nbsp;</TD>
												<TD width=126><A href="personregister.jsp"
													target=mainFrame>add employee</A></TD>
											</TR>

											<TR>
												<TD>&nbsp;</TD>
												<TD><A href="browerEmpInfo" target=mainFrame>Browse employee</A></TD>
											</TR>


										</TBODY>
									</TABLE>
								</TD>
							</TR>

							<TR>
								<TD><IMG src="../images/left_top.gif" width=165 height=3>
								</TD>
							</TR>
							<TR>
								<TD>


									<TABLE class=menu align=center>
										<TBODY>
											<TR>
												<TD width=30>&nbsp;</TD>
												<TD width=126><SPAN style="CURSOR: hand"
													onclick="changeDisplay('deptMsg')">Department manage</SPAN></TD>
											</TR>
										</TBODY>
									</TABLE>
									<TABLE style="DISPLAY: hand" id=deptMsg class=menu2
										align=center>
										<TBODY>
											<TR>
												<TD width=30>&nbsp;</TD>
												<TD width=126><A
													href="../department/departregister.jsp" target=mainFrame>add department</A></TD>
											</TR>
											<TR>
												<TD>&nbsp;</TD>
												<TD><A href="BrowerDepServlet" target=mainFrame>Browse department</A></TD>
											</TR>

											<TR>
												<TD>&nbsp;</TD>
												<TD><A href="../department/depart.jsp" target=mainFrame>Query department</A></TD>
											</TR>

										</TBODY>
									</TABLE>
								</TD>
							</TR>
						</TBODY>
					</TABLE>
					<TABLE class=menu align=center>
						<TBODY>
							<TR>
								<TD width=30>&nbsp;</TD>
								<TD width=126><SPAN style="CURSOR: hand"
									onclick="changeDisplay('adminMsg')">Manager info manage</SPAN></TD>
							</TR>
						</TBODY>
					</TABLE>
					<TABLE style="DISPLAY: hand" id=adminMsg class=menu2 align=center>
						<TBODY>
							<TR>
								<TD width=30>&nbsp;</TD>
								<TD width=126><A href="BrowerAdminServlet" target=mainFrame>browse information</A></TD>
							</TR>

							<TR>
								<TD>&nbsp;</TD>
								<TD><A href="../admin/updateadmin.jsp" target=mainFrame>change password</A></TD>
							</TR>

							<TR>
								<TD>&nbsp;</TD>
								<TD><A href="../admin/addadmin.jsp" target=mainFrame>add
										user</A></TD>
							</TR>
							<TR>
								<TD>&nbsp;</TD>
								<TD><A href="../logout" target="_parent">exit</A></TD>
							</TR>

						</TBODY>
					</TABLE>
				</TD>
			</TR>
		</TBODY>

	</TABLE>

</body>
</html>