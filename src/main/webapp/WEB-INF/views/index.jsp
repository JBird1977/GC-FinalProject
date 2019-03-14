<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Beer Me</title>
</head>
<body>
<form action = "/results" method=post>

<p> 
Mood <select name="moods">
    <c:forEach var="moods" items="${moods}">
    <option id="mood" value ="${moods}" >"${moods}"</option>
    </c:forEach>
    </select>
</p>

<p> 
Style <select name="beerStyles">
    <c:forEach var="beerStyles" items="${beerStyles}">
    <option value ="${beerStyles}" >"${beerStyles}"</option>
    </c:forEach>
    </select>
</p>

<p>Zip Code <input type="text" name="zip"/></p>
<p>City <input type="text" name="locality"/></p>
<p>State <input type="text" name="region"/></p>

<button type ="submit" class="btn btn-link">Beer Me!</button>
</form>
</body>
</html>