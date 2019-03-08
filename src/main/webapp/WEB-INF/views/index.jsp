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
Mood <select>

<c:forEach var="moods" items="${moods}">
<option value ="${moods}" >"${moods}"</option>
</c:forEach>
</select>
</p>
<p>
Location <input type="text" name="location"/>
<button type ="submit" class="btn btn-link">Beer Me!</button>
</p>
</form>
</body>
</html>