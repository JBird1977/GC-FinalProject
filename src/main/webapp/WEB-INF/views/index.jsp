<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href= "/stylish-portfolio.css" type= "text/css" rel="stylesheet" >
<title>Beer Me</title>
</head>
<body id="body">
Test of body class css.
<p id ="p-preform"> Test of paragraph css </p>
<h1>test h1</h1>
<h3>test h3</h3>
I AM IN GREAT PAIN
<a href = "/favorites"> Go to Favorites</a>

<div class = "center-div">
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
<p>
Simpler Style<select name="styleNames">
<c:forEach var="styleName" items="${styleName}">
<option value = "${styleName}" > "${styleName}"</option>
</c:forEach>
</select>
</p>
<p>Zip Code <input type="text" name="zip"/></p>
<p>City <input type="text" name="locality"/></p>
<p>State <input type="text" name="region"/></p>

<button id = "btn-primary" type ="submit" class="btn btn-primary">Beer Me!</button>

</form>
</div>
</body>
</html>