<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="bootstrap.min.css">
<script type="text/javascript" src="bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<title>Insert title here</title>
</head>
<body style="background-color:skyblue;color:azure">
<jsp:include page="banner.jsp" />
<div class="container">
<h1>You resemble to Super Hero</h1>
<img src='<c:url value="${Hero}"/>'>
<%@ include file="footer.html" %>
</div>
<a href="dashboard.jsp"><input type="submit" value="Go back"></a>
</body>
</html>