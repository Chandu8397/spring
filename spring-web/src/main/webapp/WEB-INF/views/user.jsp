<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="jakarta.tags.core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Info</title>
<style>
body{background-repeat: no-repeat;
background-size: 100%;}
</style>
</head>
<body background="<c:url value="/resources/images/back4.jpg"/>"/>
	<div align ="center">
	<h1>welcome to ${user} User Page</h1>
	
	<p> Page served on ${d} </p>
	
<a href="spring">click here for one more view</a>
	
</div>
</body>
</html>