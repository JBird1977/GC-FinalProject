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
<div>
<c:choose>
<c:when test="${not empty beers }">
<c:forEach var = "beer" items = "${beers}">
${beer.id} ${beer.name}<br>
</c:forEach>
</c:when>
<c:otherwise>

</c:otherwise>
</c:choose>
</div>
<c:choose>
<c:when test = "${not empty beer}">
${beer.id} ${beer.name}<br>
</c:when>
<c:otherwise>
</c:otherwise>
</c:choose>
<c:choose>
<c:when test ="${not empty hop}">
${hop.id} ${hop.name}<br>
</c:when>
<c:otherwise>
</c:otherwise>
</c:choose>
<c:choose>
<c:when test="${not empty hops }">
<c:forEach var = "hops" items = "${hops}">
${hops.id} ${hops.name}<br>
</c:forEach>
</c:when>
<c:otherwise>

</c:otherwise>
</c:choose>
<c:choose>
<c:when test="${not empty adjuncts }">
<c:forEach var = "adjuncts" items = "${adjuncts}">
${adjuncts.id} ${adjuncts.name}<br>
</c:forEach>
</c:when>
<c:otherwise>

</c:otherwise>
</c:choose>

<c:choose>
<c:when test ="${not empty adjunct}">
${adjunct.id} ${adjunct.name}<br>
</c:when>
<c:otherwise>
</c:otherwise>
</c:choose>
<c:choose>
<c:when test="${not empty breweries }">
<c:forEach var = "brewery" items = "${breweries}">
${brewery.id} ${brewery.name}<br>
</c:forEach>
</c:when>
<c:otherwise>

</c:otherwise>
</c:choose>

</body>
</html>