<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/lux/bootstrap.min.css" rel="stylesheet" >
<title>Details</title>
</head>
<body id="bodyBackgroudBeer">
<%@include file="partials/header.jsp"%>

<p>Based on your mood and location:</p>
	<h5>${beerStyles}</h5>
	<h5>${moods}</h5>
	
<!--   <h5>${beerStyles}</h5>
    <h5>${moods}</h5>
<p> Happy = ABV > 8        </p>
<p>  Awestruck = IBU < 55 and ABV < 6</p>
<p>  Stoic =    IBU > 55</p>
<p>  Social Butterfly =  IBU < 30 and ABV >8      </p>
<p></p>
-->


<h5>Details</h5>

<h3>Recommended Beers</h3>
 <ul style="list-style: none;">
     <c:forEach var="beer" items="${ recommendedBeers }">

        <li><a href="/beer/${ beer.id }/add">Add to Favorites</a> ${ beer.name }<br>
            <c:choose>
                <c:when test="${ not empty beer.rating }">
                    ${ beer.rating }
                </c:when>
            </c:choose>
        </li><br>
            
     </c:forEach>
    </ul>

<h3>All Beers</h3>
 <ul style="list-style: none;">
     <c:forEach var="beer" items="${ beersByBrewery }">

     	<li><a href="/beer/${ beer.id }/add">Add to Favorites</a> ${ beer.name } <br>
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