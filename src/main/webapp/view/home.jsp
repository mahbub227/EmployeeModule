<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"></c:set>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
${message}


<table>
<thead>
<tr>
<th>Name</th>
<th>Work Phone</th>
<th>Work Email</th>
<th>Department</th>
<th>Job Title</th>
<th>Manager</th>
</tr>
</thead>
<tbody>
<c:forEach items="${employeeList}" var="employees">
<tr>
<td>${employees.employeeName}</td>
<td>${employees.workPhone}</td>
<td>${employees.workEmail}</td>
<td>${employees.department}</td>
<td>${employees.jobTitle}</td>
<td>${employees.manager}</td>
</tr>
</c:forEach>
</tbody>

</table>
</body>
</html>