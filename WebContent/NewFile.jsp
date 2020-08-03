<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/sql" %>
    <%@ taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:setDataSource var="db" driver="org.postgresql.Driver" url="jdbc:postgresql://localhost:5432/mario" user="postgres" password="postgres" />
	<c:query var="rs" dataSource="${db}">select * from gadgets</c:query>
	<a:forEach items="${rs.rows}" var="gadget">
		<a:out value="${gadget.id}"></a:out>
		<a:out value="${gadget.name}"></a:out>
		<a:out value="${gadget.price}"></a:out>
	</a:forEach>
	 

</body>
</html>