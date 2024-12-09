<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="jakarta.tags.core"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Details</title>
</head>
<body>
	<h2>Employee Information Submitted Successfully</h2>
	<table>
		<tr>
			<td>Name :</td>
			<td>${emp.name}</td>
		</tr>
		<tr>
			<td>ID :</td>
			<td>${emp.id}</td>
		</tr>
		<tr>
			<td>Contact Number :</td>
			<td>${emp.contactNumber}</td>
		</tr>
	</table>

</body>
</html>