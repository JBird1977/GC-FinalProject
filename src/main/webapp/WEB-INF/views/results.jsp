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
	<p>Based on your mood and location:</p>
	<h5>${beerStyles}</h5>
	<h5>${moods}</h5>



	<c:forEach var="brewery" items="${ brewery }">
		<ol>
			<li><a href="/details/${brewery.breweryIdString }">${ brewery.name }</a></li>
		</ol>
		<c:forEach var="entry" items="${mapOfBeerBrew }">
			<c:forEach var="info" items="${entry.value}">

				<c:if test="${beerStyles == info.style.category.name}">
					<c:if test="${moods == 'Happy'}">
						<c:if test="${info.abv > 8 }">
							<li>${info.name}${info.abv}</li>
						</c:if>
					</c:if>
				</c:if>
			</c:forEach>
		</c:forEach>

		<!--   <c:forEach var="beers" items="${ beersByBrewery }">
        ${ beers.name }
        </c:forEach>-->
	</c:forEach>
</body>
</html>