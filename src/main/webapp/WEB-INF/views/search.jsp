<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search for Beers</title>
</head>
<body>
<p>Search:</p>
<div id="search1" style="display:block">
	<button onclick="beeridFunction();searchFunction()">Beer by Beer Id</button>
</div>
<div id="beerId" style="display:none">
	<form action = "/searchBy">
		<input type = "text" name = "beerId" value="Beer by Beer Id"/>
		<button type = "submit">Search</button>
	</form>
</div>
<br>
<div id="search2" style="display:block">
	<button onclick="adjunctidFunction();searchFunction()">Adjunct by Adjunct Id</button>
</div>
<div id="adjunctId" style="display:none">
	<form action = "/searchBy">
		<input type = "text" name = "adjunctId" value="Adjunct by Adjunct Id"/>
		<button type = "submit">Search</button>
	</form>
</div>
<br>
<div id="search3" style="display:block">
	<button onclick="brewbeeridFunction();searchFunction()">Breweries by Beer Id</button>
</div>
<div id="brewbeerId" style="display:none">
	<form action = "/searchBy">
		<input type = "text" name = "brewbeerId" value="Breweries by Beer Id"/>
		<button type = "submit">Search</button>
	</form>
</div>




<button onclick="beerId()">Click Me</button>
<div>
	<form action = "/searchBy">
		<input class="beerId" style="display:none" type = "text" name = "beerId" value = "null"/>
		<button class="beerId" type = "submit">Search</button>
	</form>
</div>
<br><br>
Search Adjunct by Adjunct Id
<button onclick="adjunctId()">Click Me</button>
<div>
	<form action = "/searchBy">
		<input class="adjunctId" style="display:none" type = "number" name = "adjunctId" value = "0"/>
		<button class="adjunctId" type = "submit">Search</button>
	</form>
</div>
<br><br>
Search Breweries by Beer Id
<button onclick="brewbeerId()">Click Me</button>
<div>
	<form action = "/searchBy">
		<input class="brewbeerId" style="display:none" type = "text" name = "brewbeerId" value ="null"/>
		<button class="brewbeerId" type = "submit">Search</button>
	</form>
</div>
<br><br>
<br>

<form action = "/searchBy">
<p>Search Beer by Beer Id<input type = "text" name = "beerId" value = "null"/></p>
<p>Search Adjunct by Adjunct Id<input type = "number" name = "adjunctId"value = "0"/></p>
<p>Search Breweries by Beer Id<input type = "text" name = "brewbeerId" value ="null"/></p>
<p>Search Hops by Hop Id<input type = "text" name = "hopId" value ="null"/><p>
<button type = "submit">Search</button>
</form>

<p>
<a href = "/searchBeers">
Search All Beers
</a>
</p>
<p>
<a href = "/searchAdjuncts">
Search All Adjuncts
</a>
</p>
<<<<<<< Updated upstream
<script>
	function searchFunction() {
		search1Function();
		search2Function();
		search3Function();
	}
</script>
<script>
	function search1Function() {
		var x = document.getElementById("search1");
			if (x.style.display === "none") {
				x.style.display = "block";
			} else {
				x.style.display = "none";
		}
	}
</script>
<script>
	function search2Function() {
		var x = document.getElementById("search2");
			if (x.style.display === "none") {
				x.style.display = "block";
			} else {
				x.style.display = "none";
		}
	}
</script>
<script>
	function search3Function() {
		var x = document.getElementById("search3");
			if (x.style.display === "none") {
				x.style.display = "block";
			} else {
				x.style.display = "none";
		}
	}
</script>
<script>
	function beeridFunction() {
		var x = document.getElementById("beerId");
			if (x.style.display === "none") {
				x.style.display = "block";
			} else {
				x.style.display = "none";
		}
	}
</script>
<script>
	function adjunctidFunction() {
		var x = document.getElementById("adjunctId");
			if (x.style.display === "none") {
				x.style.display = "block";
			} else {
				x.style.display = "none";
		}
	}
</script>
<script>
	function brewbeeridFunction() {
		var x = document.getElementById("brewbeerId");
			if (x.style.display === "none") {
				x.style.display = "block";
			} else {
				x.style.display = "none";
		}
	}
</script>

<p>
<a href = "/searchHops">
Search All Hops
</a>


</body>
</html>