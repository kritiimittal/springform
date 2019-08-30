<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form</title>
</head>
<body>
	<form:form action="submitform" modelAttribute="booking">
		ID : <form:input path="id"/><br>
		NAME : <form:input path="name"/><br>
		Address : <form:input path="address"/><br>
		<input type="submit" name="Submit" value="Submit">
		
	</form:form>
</body>
</html>