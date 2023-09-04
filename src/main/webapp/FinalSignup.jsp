<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
* {
	color: #000000;
}

h1 {
	width: 30vw;
	font-size: 50px;
	font-family: serif;
	font-weight: 700;
}

body {
	display: flex;	
	justify-content: center;
	align-items: center;
	height: 97vh;
	background-color: #95ccfc;
}

form {
	display: flex;
	flex-direction: column;
	justify-content: space-evenly;
	align-items: flex-start;
	height: 90vh;
}

input {
	accent-color: red;
}

.input {
	outline: none;
	border: none;
	height: 3vh;
	width: 13vw;
	padding: 5px 10px;
	border-radius: 10px;
	font-weight: 600;
	font-size: 15px;
	font-family: cursive;
}

div {
	font-weight: 600;
	font-size: 25px;
	font-family: monospace;
}

.submit {
	display: flex;
	justify-content: center;
	align-items: center;
	width: 25vw;
	margin-top: 10px;
}

.s {
	padding: 13px;
	font-weight: 600;
	font-size: 18px;
	font-family: cursive;
	border-radius: 10px;
	border: none;
	outline: none;
}

.s:hover {
	background-color: black;
	color: white;
	outline: 6px black solid;
	outline-offset: 4px;
}

span {
	color: red; font-weight : 600;
	font-family: cursive;
	font-weight: 600;
}
</style>
<body>
	<form action="FinalServlet" method="post">
		<h1>--Patient History--</h1>
		<div>
			Name: <input class="input" type="text" placeholder="Patient Name"
				name="name" value="${NameValue}">
		</div>
		<span>${NameError}</span>
		<div>
			Age: <input class="input" type="text" placeholder="Your Age"
				name="age" value="${AgeValue}">
		</div>
		<span>${AgeError}</span>
		<div>
			Gender: <input type="radio" name="gender" value="male">Male <input
				type="radio" name="gender" value="female">Female
		</div>
		<span>${GenderError}</span>
		<div>
			Do You Smoke ? <input type="checkbox" value="True" name="smoke">Yes
		</div>
		<div>
			Existing disease: <br> Do You Have Diabetes ? <input
				type="checkbox" value="True" name="dia">Yes <br> Do You
			Have BloodPressure ? <input type="checkbox" value="True" name="bp">Yes
		</div>
		<div class="submit">
			<input class="s" type="submit" value="Calculate Heart disease % ">
		</div>




	</form>
</body>
</html>