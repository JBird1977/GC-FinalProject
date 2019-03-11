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
   
    <ul>
     <c:forEach var="brewery" items="${ brewery }">
        <li><input type="hidden" name="${ brewery.breweryIdString}"><a href="/details/${brewery.breweryIdString }">${ brewery.name }</a></li>
        
     </c:forEach>
    </ul>
    
	</form>
</body>
</html>