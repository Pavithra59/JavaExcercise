<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr>
  <th>EmployeeID</th>
  <th>Name</th>
  <th>Age</th>
  <th>Gender</th>
  <th>Department Name</th>
  <th>Basic</th>
  <th>Grade</th>
</tr>
 <c:forEach var="emp" items="${Empdetail}">
<tr>
<td>${emp.empId}</td>
<td>${emp.name}</td>
<td>${emp.age}</td>
<td>${emp.gender}</td>
<td>${emp.deptName}</td>
<td>${emp.basic}</td>
<td>${emp.grade}</td>
</tr>
</c:forEach>
</table>
</body>
</html>