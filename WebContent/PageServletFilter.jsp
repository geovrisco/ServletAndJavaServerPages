<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Servlet Filter</h3>
	<ul>
		<li>"/addUser" -> class addUser.java sebagai servlet tujuan method </li>
		<li>class FirstFilteraddUser.java sebagai servlet filter 1</li>
		<li>class SecondFilteraddUser.java sebagai servlet filter 2</li>
	</ul>
	<h3>Test disini</h3>
	<p>
		console akan menampilkan error ketika userid negatif (filter 1) <br>
		console akan menampilkan error ketika username kosong (filter 2)
	</p>
	<br>
	<form method="post" action ="AddUser">
		name : <input type="text" name="userName">
		id : <input type ="text"  name ="userId">
		<input type="submit">
	</form>
	
	
</body>
</html>