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
 <h2>Array JSP</h2>
 <h3>menampilkan semua array dengan custom tag c:out value = students</h3>
 <c:out value="${students}"></c:out>
 <h3>Menampilkan dengan list forEach</h3>
 <table>
	 <tr>
	 	<td>No</td>
	 	<td>Nama</td>
	 	
	 </tr>
 <c:forEach items="${students}" var="s">
 <tr>
	 	<td>${s.rollNum }</td>
	 	<td>${s.name}</td>
	 </tr>
 </c:forEach>
 </table>
</body>
</html>