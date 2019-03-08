<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Beer Me</title>
</head>
<body>
<div>
	<ul>
	<c:forEach var="brewery" items="${ breweries }">
		<li>${ brewery.name }</li>
	</c:forEach>
	</ul>
		
	<c:forEach var="beer" items="${ beers }">
	<ul>
		<li>Name: ${ beer.name }</li>
		<li>Type: ${ beer.type }</li>
		<li>ABV: ${ beer.abv }</li>
		<li>Glass: ${ beer.glass.name }</li>
	</ul>	
	</c:forEach>
	
</div>
</body>
</html>