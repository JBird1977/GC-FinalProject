<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>Based on your mood and location: </p>
    
    <ul>
     <c:forEach var="brewery" items="${ breweries }">
        <li>${ brewery.name }</li>
     </c:forEach>
    </ul>

</body>
</html>