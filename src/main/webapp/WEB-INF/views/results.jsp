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
    <form action="/details/{name}" method="post">
   
    <ul>
     <c:forEach var="brewery" items="${ brewery }">
        <li><input name="breweryId" value="${breweryId }"><a href="/details/${brewery.name }">${ brewery.name }</a></li>
        
     </c:forEach>
    </ul>
    
	</form>
</body>
</html>