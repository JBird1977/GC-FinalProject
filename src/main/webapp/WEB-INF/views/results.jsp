<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/lux/bootstrap.min.css" rel="stylesheet" >
<title>Results</title>
</head>
<body id="bodyBackgroudBeer">
<%@include file="partials/header.jsp"%>
	<p>Based on your mood and location:</p>
<!-- 	<h5>${beerStyles}</h5>
	<h5>${moods}</h5>
<p> Happy = ABV > 8        </p>
<p>  Awestruck = IBU < 55 and ABV < 6</p>
<p>  Stoic =    IBU > 55</p>
<p>  Social Butterfly =  IBU < 30 and ABV >8      </p>
<p></p>
-->
	<c:forEach var="brewery" items="${ breweries }">
		<ol style="list-style: none;">
			<li><a href="/details/${brewery.breweryIdString }?moods=${moods}&beerStyles=${beerStyles}">${ brewery.name }</a></li>
		</ol>
		
		<ul>	
		  <c:forEach var="info" items="${mapOfBeerBrew[brewery.breweryIdString]}">     
                <li>${info.name } ${info.abv}</li>             
		  </c:forEach>
	    </ul>
	 </c:forEach>
</body>
</html>