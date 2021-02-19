<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Casestudy</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<h1>Hello</h1>
<a class="btn btn-primary btn-lg" href="<%=request.getContextPath()%>/products/add">Add</a>
<br><br>
<table class="table">
	<tr>
		<td>Sr.No</td>
		<td>Name</td>
		<td>Price</td>
		<td>Manufacturer</td>
		<td>Update</td>
		<td>Delete</td>
	</tr>
	 <c:forEach var="p" items="${product}">
		<tr>
		<td><c:out value="${p.id}"></c:out></td>
		<td><c:out value="${p.name}"></c:out></td>
		<td><c:out value="${p.price}"> </c:out></td>
		<td><c:out value="${p.manufacturer}"> </c:out></td>
		<td><a class="btn btn-warning" href="<%=request.getContextPath()%>/products/update/${p.id}">Update</a></td>
		<td><a class="btn btn-danger" href="<%=request.getContextPath()%>/products/delete?id=${p.id}">Delete</a></td>
		</tr>
	</c:forEach> 
	</table>
</body>
</html>