<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
body {
	display: flex;
	justify-content: center;
	align-items: center;
	height: 97vh;
	background-color: #adffb6;
}

p {
	display: inline;
	margin: 15px;
	font-weight: 700;
	font-family: serif;
	font-size: 30px;
	color: black;
}

span {
	font-weight: 600;
	font-family: cursive;
	font-size: 30px;
	color: #2c0b7a;
}
</style>
<body>
	<div>
	<p>Name:-</p>
	<span>${NameValue}</span>
	<br><br>
	<p>Age:-</p>
	<span>${AgeValue}</span>
	<br><br>
	<p>Gender:-</p>
	<span>${GenderValue}</span>
	<br><br>
	<p>Smoke ? :-</p>
	<span>${Smoke}</span>
	<br><br>
	<p>Diabetes ? :-</p>
	<span>${dia}</span>
	<br><br>
	<p>Blood Pressure:-</p>
	<span>${Bp}</span>
	<br><br>
	<p>Probability Of Heart Disease :- </p>	
	<span>${Percentage}</span>
	</div>
</body>
</html>