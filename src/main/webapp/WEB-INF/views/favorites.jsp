<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Favorite Beers</title>
</head>
<body>
<div>
	<c:forEach var="beer" items="${ favorites }">
		<ul>
			<li>Rating: 
				<c:choose>
					<c:when test="${ not empty beer.rating }">
						${ beer.rating }
					</c:when>
					<c:otherwise>
						<a href="/beer/${ beer.beerId }/1/ratingUpdate"> 1 </a>
						<a href="/beer/${ beer.beerId }/2/ratingUpdate"> 2 </a>
						<a href="/beer/${ beer.beerId }/3/ratingUpdate"> 3 </a>
						<a href="/beer/${ beer.beerId }/4/ratingUpdate"> 4 </a>
						<a href="/beer/${ beer.beerId }/5/ratingUpdate"> 5 </a>
					</c:otherwise>
				</c:choose>
				<a href="/beer/${ beer.beerId }/delete">delete</a>
			</li>
			<li>Name: ${ beer.name }</li>
		</ul>
	</c:forEach>
	<div>Return <a href="/">home</a>.</div>
	<div>Return to <a href="/test">test</a>.</div>
</div>
</body>
</html>