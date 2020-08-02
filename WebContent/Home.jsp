<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Hello World
	<br>
	mengeluarkan dengan menggunakan scriplet
	String name = request.getAttribute("name").toString();
		out.println(name);
	<br>
	<%
		String name = request.getAttribute("name").toString();
		out.println(name);
	%>
	<br>
	<br>
	<br>
	mengeluarkan data dengan Expression Language "${name}"
	${name}
	<br><br>
	menggunakan custon taglib : 
	
	<c:out value="${name}"></c:out>
	
	<a href="/ArrayServlet">kesini</a>
</body>
</html>