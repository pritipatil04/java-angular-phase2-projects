 

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 

pageEncoding="ISO-8859-1"%> 

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<!DOCTYPE html> 

<html> 

<head> 

<meta charset="ISO-8859-1"> 

<title>Insert title here</title> 

</head> 

<body> 

<h2> 

<a href="/showProductForm">Add Product</a></h2> 

<h2>List of Products</h2> 

<table border="1"> 

<tr> 

<th>Id</th> 

<th>Name</th> 

<th>Price</th> 

<th>Quantity</th> 

<th>Action</th> 

</tr> 

<c:forEach items="${products}" var="product"> 

<tr> 

<td>${product.pid}</td> 

<td>${product.productName}</td> 

<td>${product.price}</td> 

<td>${product.quantity}</td> 

<td> 

<a href="/deleteProduct/${product.pid}">Delete</a> 

<a href="/updateProduct/${product.pid}">Update</a> 

</td> 

</tr> 

</c:forEach> 

</table> 

</body> 

</html> 