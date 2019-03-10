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
	<c:forEach var="ingredient" items="${ingredients }">
	
	<ul>
	<li>Name: ${ingredient.name }</li>
	<li>Category: ${ingredient.category }</li>
	</ul>
	
	</c:forEach>
	
	<ul>
	<c:forEach var="brewery" items="${ breweries }">
		<li>${ brewery.name } <a href="/brewery/${ brewery.id }/add">favorite</a></li>
	</c:forEach>
	</ul>
		
	<c:forEach var="beer" items="${ beers }">
	<ul>
		<li>Name: ${ beer.name }</li>
		<li>Type: ${ beer.type }</li>
		<li>ABV: ${ beer.abv }</li>
		<li>Glass: ${ beer.glass.name }</li>
		<li>Style: ${ beer.style }</li>
		<li><a href="/beer/${ beer.id }/add">favorite</a></li>
	</ul>	
	</c:forEach>
	

	
</div>
</body>
</html>