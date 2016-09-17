<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Spring MVC Form Handling</title>
	</head>
	<body bgcolor="palegreen">
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
				<td align="center"><a href="delete.html?id=${employee.EmpId}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</c:if>
<br>
&nbsp;&nbsp;<a href="index.html"><b style="color:red;">HomePage</b></a>
	</body>
</html>