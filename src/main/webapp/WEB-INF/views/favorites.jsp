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
	<c:choose>
		<c:when test="${ not empty action }">
			${ name } ${ action }
		</c:when>
		<c:otherwise>
			Places to be & Beers to drink...
		</c:otherwise>
	</c:choose>
</div>
<div>
	<c:forEach var="beer" items="${ beers }">
		<ul>
			<li>Rating: 
				<c:choose>
					<c:when test="${ not empty beer.rating }">
						${ beer.rating } <a href="/beer/${ beer.beerId }/0/ratingUpdate">edit</a>
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
			<dl>
				<dt>Ingredients</dt>
				<c:forEach var="ingredient" items="${ beer.ingredients }">
					<dd>${ ingredient }</dd>
				</c:forEach>
			</dl>
		</ul>
	</c:forEach>
</div>
<div>
	<c:forEach var="brewery" items="${ breweries }">
		<ul>
			<li>
				<dl><dt>${ brewery.name }</dt>
					<dt>
						Rating <a href="/brewery/${ brewery.breweryId }/delete">delete</a> 
						<c:choose>
							<c:when test="${ not empty brewery.rating }">
								<a href="/brewery/${ brewery.breweryId }/0/ratingUpdate">edit</a>
								</dt>
								<dd>
								${ brewery.rating } 
							</c:when>
							<c:otherwise>
								</dt>
								<dd>
								<a href="/brewery/${ brewery.breweryId }/1/ratingUpdate"> 1 </a>
								<a href="/brewery/${ brewery.breweryId }/2/ratingUpdate"> 2 </a>
								<a href="/brewery/${ brewery.breweryId }/3/ratingUpdate"> 3 </a>
								<a href="/brewery/${ brewery.breweryId }/4/ratingUpdate"> 4 </a>
								<a href="/brewery/${ brewery.breweryId }/5/ratingUpdate"> 5 </a>
							</c:otherwise>
						</c:choose>
					</dd>
					<dt>Location</dt>
					<c:forEach var="location" items="${ brewery.locations }">
						<dd>${ location }</dd>
					</c:forEach>
				</dl>	
			</li>		
		</ul>
	</c:forEach>
	<div>Return <a href="/">home</a>.</div>
	<div>Return to <a href="/test">test</a>.</div>
</div>
</body>
</html>