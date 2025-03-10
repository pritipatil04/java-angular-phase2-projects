<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 

pageEncoding="ISO-8859-1"%> 

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 

<!DOCTYPE html> 

<html> 

<head> 

<meta charset="ISO-8859-1"> 

<title>Insert title here</title> 

</head> 

<body> 

<h2>${message}</h2> 

<table> 

<form:form action="/addProduct" modelAttribute="product"> 

<tr><td>Id</td><td><form:input path="pid" readonly="true"/><td></tr> 

<tr><td>Name</td><td><form:input path="productName"/><br><td></tr> 

<tr><td>Price</td><td><form:input path="price"/><td></tr> 

<tr><td>quantity</td><td><form:input path="quantity"/><td></tr> 

<tr><td><input type="submit"></td></tr> 

</form:form> 

</table> 

</body> 

</html> 