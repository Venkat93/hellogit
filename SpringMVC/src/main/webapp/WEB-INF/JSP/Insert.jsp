<jsp:include page="Header.jsp"></jsp:include>
<form action="InsertEmployee" method="post">
	<table align="center" border="2">
		<tr>
			<td>Employee Number</td>
			<td><input type="text" name="eno"></td>
		</tr>
		<tr>
			<td>Employee Name</td>
			<td><input type="text" name="ename"></td>
		</tr>
		<tr>
			<td>Salary</td>
			<td><input type="text" name="salary"></td>
		</tr>
		<tr>
			<td>Gender</td>
			<td><input type="text" name="gender"></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit" name="submit" value="Submit"></td>
		</tr>
	</table>
</form>

<jsp:include page="Footer.jsp"></jsp:include>





