<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Results</title>
</head>
<body>
<p>Based on your mood and location: </p>
    <form action="/details/{breweryIdString}">
   
   
    
     <c:forEach var="brewery" items="${ brewery }">
       <ol><li><input type="hidden" name="${ brewery.breweryIdString}"><a href="/details/${brewery.breweryIdString }">${ brewery.name }</a></li>
       </ol>
       <c:forEach var="entry" items="${mapOfBeerBrew }">
       <c:forEach var = "info" items="${entry.value}">
       <li>${info.name }</li>
		</c:forEach>       
       </c:forEach>
       
       <!--   <c:forEach var="beers" items="${ beersByBrewery }">
        ${ beers.name }
        </c:forEach>-->
     </c:forEach>
    </ul>
    
	</form>
</body>
</html>