<%@page import="lti.quiz.entity.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel ="stylesheet" type="text/css" href="bootstrap.min.css">
    <script type ="text/javascript" src="bootstrap.min.js">
    </script>
    <script type="text/javascript" src="jquery-3.3.1.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<% User user = (User) session.getAttribute("USER"); %>
<body style="background-color:skyblue">
<jsp:include page="banner.jsp"/>
<div class="container">
<h1>My DASHBOARD</h1>
<h2>Email ID: <%= user.getEmail() %></h2>
<img src= "<%= user.getProfile() %>" height="200" width="250">
<hr>
<h2>Ever wondered which Super Hero you are?</h2>
<a href="quiz.quiz?choice" class="btn btn-info" >Take quiz to discover</a>
</div>
<%@ include file="footer.html" %>
</body>
</html>