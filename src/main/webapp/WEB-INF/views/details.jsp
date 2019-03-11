<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details</title>
</head>
<body>
<p>This is the details page! :) </p>

<h5>Give me the names</h5>

    <ul>
     <c:forEach var="beers" items="${ beersByBrewery }">
        <li>${ beers.name }</li>
        
       
     </c:forEach>
    </ul>


</body>
</html>