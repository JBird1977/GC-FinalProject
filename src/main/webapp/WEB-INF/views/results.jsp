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
<body>
	<p>Based on your mood and location:</p>
	<h5>${beerStyles}</h5>
	<h5>${moods}</h5>

<c:forEach items="${countries}" var="country">
        <option value="${country.key}">${country.value}</option>
    </c:forEach>


	<c:forEach var="brewery" items="${ brewery }">
		<ol>
			<li><a href="/details/${brewery.breweryIdString }?moods=${moods}&beerStyles=${beerStyles}">${ brewery.name }</a></li>
		</ol>
		
		<ul>
		  <c:forEach var="info" items="${mapOfBeerBrew[brewery.breweryIdString]}">
		      <!-- ///HAPPY\\\ -->
                <c:if test="${beerStyles == info.style.category.name}">
                    <c:if test="${moods == 'Happy'}">
                        <c:if test="${info.abv > 8 }">
                            <li>${info.name}</li>
                        </c:if>
                    </c:if>
                </c:if>
                <!-- ///STOIC Formerly NOTEBOOK SAD\\\ -->
                <c:if test="${beerStyles == info.style.category.name}">
                    <c:if test="${moods == 'Stoic'}">
                        <c:if test="${info.ibu > 55 }">
                            <li>${info.name}</li>
                        </c:if>
                    </c:if>
                </c:if>
                                <!-- ///Awestruck Formerly PUNCHY\\\ -->
                <c:if test="${beerStyles == info.style.category.name}">
                    <c:if test="${moods == 'Awestruck'}">
                        <c:if test="${info.ibu < 55 && info.abv < 6}">
                            <li>${info.name}</li>
                        </c:if>
                    </c:if>
                </c:if>
                
                            <!-- SOCIAL BUTTERFLY -->
                  <c:if test="${beerStyles == info.style.category.name}">
                    <c:if test="${moods == 'Social Butterfly'}">
                        <c:if test="${info.ibu < 30 && info.abv > 8}">
                            <li>${info.name}</li>
                        </c:if>
                    </c:if>
                  </c:if> 
		  </c:forEach>
		</ul>
	</c:forEach>
</body>
</html>