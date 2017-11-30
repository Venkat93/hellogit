<jsp:include page="Header.jsp"></jsp:include>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="springtag" uri="http://www.springframework.org/tags"%>
<style type="text/css">
.error{
color: red;
font-style: bold;
}
</style>


	<table align="center">
	<spring:form method="post" commandName="employee" action="InsertEmployee">
		<center>
			<table border="2">
				<tr>
					<td colspan="2" align="center"><springtag:message code="title"/></td>
				</tr>
				<tr>
					<td><springtag:message code="eno"/></td> <!-- Label Key -->
					<td><spring:input path="eno"/> <spring:errors path="eno" cssClass="error"/></td>
				</tr>
				<tr>
					<td><springtag:message code="eName"/></td>
					<td><spring:input path="eName"/> <spring:errors path="eName" cssClass="error"/></td>
				</tr>
				<tr>
					<td><springtag:message code="salary"/></td>
					<td><spring:input path="salary"/> <spring:errors path="salary" cssClass="error"/></td>
				</tr>	
				<tr>
					<td><springtag:message code="gender"/></td>
					<td><spring:input path="gender"/> <spring:errors path="gender" cssClass="error"/></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" name="addEmployee" value="Add"/></td>
				</tr>
				<%-- <input name="deviceID" type="hidden" value="${myDeviceData}" /> --%>
			</table>
			</center>		
	</spring:form>
	</table>

<jsp:include page="Footer.jsp"></jsp:include>





