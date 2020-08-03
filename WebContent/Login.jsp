<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Login Mockup dengan JDBC</h3>
	<ul>
		<li>1. login.jsp untuk halaman login</li>
		<li>2. welcome jsp adalah halaman secured</li>
		<li>3. LoginDao.java  adalah class data accsess object yang menerima 2 parameter dan cek ke db</li>
		<li>4. welcomex.jsp untuk salah password</li>	
	</ul>
	<div style="display:flex; justify-content:center">
		<form action ="Login" method ="post">
			username : <input type="text" name="name">
			<br>
			password :<input type="password" name="pass">
			<br>
			<input type ="submit" value="login">
		</form>
	</div>
</body>
</html>