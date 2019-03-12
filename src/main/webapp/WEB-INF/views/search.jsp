<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search for Beers</title>
</head>
<body>

<form action = "/searchBy">
<p>Search Beer by Beer Id<input type = "text" name = "beerId" value = "null"/></p>
<p>Search Adjunct by Adjunct Id<input type = "number" name = "adjunctId"value = "0"/></p>
<p>Search Breweries by Beer Id<input type = "text" name = "brewbeerId" value ="null"/></p>
<button type = "submit">Search</button>
</form>
<p>
<a href = "/searchBeers">
Search All Beers
</a>
</p>
<p>
<a href = "/searchAdjuncts">
Search All Adjuncts
</a>
</p>


</body>
</html>