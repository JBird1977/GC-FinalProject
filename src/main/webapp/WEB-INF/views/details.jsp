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
        <li>${ beers.name }
        	<!-- not connected to the DAO...yet... -->
        	<!-- beer id will be used for database -->
      		<a href="/beer/${ beers.id }/1/ratingUpdate"> 1 </a>
			<a href="/beer/${ beers.id }/2/ratingUpdate"> 2 </a>
			<a href="/beer/${ beers.id }/3/ratingUpdate"> 3 </a>
			<a href="/beer/${ beers.id }/4/ratingUpdate"> 4 </a>
			<a href="/beer/${ beers.id }/5/ratingUpdate"> 5 </a> 
		</li>
        
       
     </c:forEach>
    </ul>

</body>
</html>