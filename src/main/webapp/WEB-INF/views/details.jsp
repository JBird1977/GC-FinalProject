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
     <c:forEach var="beer" items="${ beersByBrewery }">

     	<li><a href="/beer/${ beer.id }/add">Fav Flave</a> ${ beer.name } <br>
			<c:choose>
				<c:when test="${ not empty beer.rating }">
					${ beer.rating }
				</c:when>
			</c:choose>
		</li><br>
            
     </c:forEach>
    </ul>

</body>
</html>