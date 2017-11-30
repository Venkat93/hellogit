<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="Header.jsp"></jsp:include>
	
	<table align="center">
		<tr>
			<th>Eno</th>
			<th>Ename</th>
			<th>Salary</th>
			<th>Gender</th>
			<th>Operation</th>
		</tr>
		
		<c:forEach var="emp" items="${EmployeeList}">
		<tr>
		<td>${emp.getEno()}</td>
		<td>${emp.geteName()}</td> 
		<td>${emp.getSalary()}</td>
		<td>${emp.getGender()}</td>
		<td><a href="delete/${emp.getEno()}"><input type="button" name="Delete" value="Delete"/></a>
		</tr>
		</c:forEach>
		
		
		<%-- 
		<%List<EmployeeDTO> eList=(List<EmployeeDTO>) request.getAttribute("empList"); 
		for(EmployeeDTO elist:eList){	
		%>
		
		<tr>
			<td><%=elist.getEno()%></td>
			<td><%=elist.geteName() %></td>
			<td><%=elist.getSalary() %></td>
			<td><%=elist.getGender() %></td>
			<td><a href="empServlet?eno=<%=elist.getEno()%>&operation=delete"><Input type="button" name="Delete" value="delete"></a></td>
		</tr>
		<% } %>  --%>
	</table>
<jsp:include page="Footer.jsp"></jsp:include>