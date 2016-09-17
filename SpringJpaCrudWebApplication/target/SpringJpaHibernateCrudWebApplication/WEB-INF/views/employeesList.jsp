<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>All Employees</title>
</head>
<body>
<h1><b style="color:blue;">Employees List</b></h1>
<c:if test="${!empty employees}">
	<table border="3" bordercolor="#c86260" bgcolor="#ffffcc" cellpadding="3"  width="70%">
		<tr>
			<th>Employee ID</th>
			<th>Employee firstName</th>
			<th>Employee lastName</th>
			<th>Employee Department</th>
			<th>Employee Email</th>
		</tr>
		<c:forEach items="${employees}" var="employee">
			<tr>
				<td><c:out value="${employee.EmpId}"/></td>
				<td><c:out value="${employee.firstName}"/></td>
				<td><c:out value="${employee.lastName}"/></td>
				<td><c:out value="${employee.EmpDept}"/></td>
				<td><c:out value="${employee.email}"/></td>
			</tr>
		</c:forEach>
	</table>
</c:if>
</body>
</html>