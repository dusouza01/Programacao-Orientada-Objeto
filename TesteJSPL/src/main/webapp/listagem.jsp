<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <%  List<Aluno> lista = (List<Aluno>)request.getAttribute("lista");%>
 
 <c:forEach var = "aluno" items = "${lista }">
 <c:out value="${aluno.rm()}"></c:out>
 <c:out value="${aluno.nome()}"></c:out>
 
 </c:forEach>

</body>
</html>