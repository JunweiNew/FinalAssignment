<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<base href="<%=basePath%>">

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Enterprise information management system, user login</title>
<!--  
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	-->
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<style type="text/css">
<!--
-->
</style>

<script language="javascript">
	function checkinfo()
	{
		var num=document.register.username.value;
		var passwd=document.register.password.value;
		if(num.length==0)
		{
			alert("Please input name!");
			document.register.username.focus();
			return false;
		}
		if(passwd.length==0)
		{
			alert("Please input password");
			document.register.password.select();
			return false;
		}
		return true;
	}
</script>

</head>

<body>
	<form name="register" method="post" action="login"
		onSubmit="return checkinfo()">
		<table width="100%" height="100%" border="0" cellpadding="0"
			cellspacing="0">

			<tr>
				<td><table width="962" border="0" align="center"
						cellpadding="0" cellspacing="0">
						<tr>
							<td height="235" width="962" background="images/login_03.gif">&nbsp;</td>
						</tr>
						<tr>
							<td height="51"><table width="100%" border="0"
									cellspacing="0" cellpadding="0">
									<tr>
										<td width="394" height="53" background="images/login_05.gif">&nbsp;</td>
										<td width="206" background="images/login_06.gif"><table
												width="100%" border="0" cellspacing="0" cellpadding="0">
												<tr>
													<td width="20%" height="26"><div align="center">
															<span class="STYLE1">user</span>
														</div></td>
													<td width="80%" height="26"><div align="left">
															<input type="text" name="username"
																style="width:105px; height:20px; background-color:#292929; border: solid 1px; font-size:14px; color:#6cd0ff">
														</div></td>
												</tr>
												<tr>
													<td height="27"><div align="center">
															<span class="STYLE1">password</span>
														</div></td>
													<td height="27"><div align="left">
															<input type="password" name="password"
																style="width:105px; height:20px; background-color:#292929; border:solid 1px; font-size:14px; color:#6cd0ff">
														</div></td>
												</tr>
											</table></td>
										<td width="362" background="images/login_07.gif">&nbsp;</td>
									</tr>
								</table></td>
						</tr>
						<tr>
							<td height="213" align="center" valign="top"
								background="images/login_08.gif"><table width="200"
									border="0">
									<tr>
										<td><div align="center">
												<input type="submit" name="submit" value="submit">
											</div></td>
										<td><div align="left">
												<input type="reset" name="reset" value="reset">
											</div></td>
									</tr>
								</table></td>
						</tr>
					</table></td>
			</tr>
		</table>
	</form>
</body>
</html>
