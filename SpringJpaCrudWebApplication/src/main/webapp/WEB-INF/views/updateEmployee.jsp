<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring MVC Form Handling</title>
<style type="text/css">
.button {
    background-color:  #2E6066;;
    border: none;
    color: white;
    padding: 10px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
}
table {
	font-family: 'Arial';
	margin: 15px auto;
	border-collapse: collapse;
	border: 1px solid #CC6C86;
	border-bottom: 2px solid #CC6C86;
	box-shadow: 0px 0px 20px rgba(0, 0, 0, 0.50), 0px 10px 20px
		rgba(0, 0, 0, 0.10), 0px 20px 20px rgba(0, 0, 0, 0.10), 0px 30px 20px
		rgba(0, 0, 0, 0.10);
	tr
	{
	&:hover
	{
	background:#f4f4f4;
	td
	{
	color:2px solid #00ff00;
    }
}
}
th, td {
	border-color: 2px solid #00ff00;
	border: 2px solid #FF7373;
	padding: 20px 50px;
	border-collapse: collapse;
}
th {
	border-style: solid background: #ffb90f;
	border-color: 2px solid #ffb90f;
	text-transform: uppercase;
	font-size: 12px;
	&.
	last
	{
	border-right
	:
	none;}
	}
</style>
</head>
<body>
<center>
<h1><b style="color:blue;">Employees List</b></h1>
<c:if test="${!empty employees}">
	<table border="3" cellpadding="3"  width="70%">
		<tr>
			<th>Employee ID</th>
			<th>Employee firstName</th>
			<th>Employee lastName</th>
			<th>Employee Department</th>
			<th>Employee Email</th>
		<c:forEach items="${employees}" var="employee">
			<tr>
				<td><c:out value="${employee.id}"/></td>
				<td><c:out value="${employee.firstName}"/></td>
				<td><c:out value="${employee.lastName}"/></td>
				<td><c:out value="${employee.dept}"/></td>
				<td><c:out value="${employee.email}"/></td>
				<td align="center"><a href="edit?id=${employee.id}" class="button" >Update</a></td>
			</tr>
		</c:forEach>
	</table>
</c:if>
</center>
	</body>
</html>