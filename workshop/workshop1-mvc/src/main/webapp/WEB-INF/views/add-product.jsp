<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<form:form 
		modelAttribute="prod" method="post" action="/products/submit-form">
		name : <form:input path="name"/>
		<br>
		price : <form:input path="price" type="number"/>
		<br>
		manufacturer : <form:input path="manufacturer" />
		<br>
		<input type="submit" value="Submit"/>
	</form:form>
	
</body>
</html>