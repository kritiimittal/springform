<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Booking List</h1>
	<table border="2" width="70%" cellpadding="2">
	<tr><th>Id</th><th>Name</th><th>Address</th></tr>
    <c:forEach var="b" items="${list}"> 
    <tr>
    <td>${b.id}</td>
    <td>${b.name}</td>
    <td>${b.address}</td>
    <td><a href="editemp/${b.id}">Edit</a></td>
    <td><a href="deleteemp/${b.id}">Delete</a></td>
    </tr>
    </c:forEach>
    </table>
    <br/>
    <a href="bookingform">Add New Booking</a>
</body>
</html>