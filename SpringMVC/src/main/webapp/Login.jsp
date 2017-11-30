<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body style="background-color:lightblue;">
	<% if(request.getAttribute("ErrorMsg") != null){%>
	<h1 align="center" style="color:red;"><%= request.getAttribute("ErrorMsg") %></h1>
     <%}%>
	<form action="mvc/validate" method="post">
	<Table align="center" border="2">
		<tr>
			<td align="center">UserName=<input type="text" name="username"></td>
		</tr>
		<tr>
			<td align="center">Password=<input type="password" name="password"></td>
		<tr>
		<tr>
			<td align="center"><input type="submit" name="Login" Value="Login"></td>
		</tr>
	</Table>
	</form>
</body>
</html>