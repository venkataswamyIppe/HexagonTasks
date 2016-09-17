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
	<center>
		<h1><b style="color:blue;">Update Employee Data</b></h1>
		<form:form method="POST" action="update.html">
	   		<table>
			    <tr>
			        <td><form:label path="EmpId">Employee ID:</form:label></td>
			        <td><form:input path="EmpId" value="${employee.EmpId}" readonly="true"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="firstName">Employee firstName:</form:label></td>
			        <td><form:input path="firstName" value="${employee.firstName}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="lastName">Employee lastName:</form:label></td>
			        <td><form:input path="lastName" value="${employee.lastName"/></td>
			    </tr>    
			    <tr>
			        <td><form:label path="EmpDept">Employee Department:</form:label></td>
                    <td><form:input path="EmpDept" value="${employee.EmpDept}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="email">Employee Email:</form:label></td>
			        <td><form:input path="email" value="${employee.email}"/></td>
			    </tr>
			    <tr>
			      <td colspan="2"><input type="submit" value="Submit"/></td>
		      </tr>
			</table> 
		</form:form>
		<a href="index.html"><b style="color:red;">HomePage</b></a>
	</center>
	</body>
</html>