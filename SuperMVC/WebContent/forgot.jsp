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
<body style="width:50%;">
<jsp:include page="banner.jsp"/>
<h1>Forgot Password?</h1>
<table class="table table-striped table-hover">
		<tbody>
<tr><td colspan="2" class="alert-info">${Info}</td></tr>
<form action="forgot.quiz" method="post" >
		
	
				<tr>
					<td><label>Enter Email ID: </label></td>
					<td><input type="email" name="email" class="form-control" required></td>

				</tr>
				<tr>
					<td><label>Your Favorite SuperHero? </label></td>
					<td><input type="text" name="answer"  class="form-control" required></td>
				</tr>
				<tr>
					<td><input type="submit" class="btn btn-info" value="Submit">
					</td>
					<td>
				</tr>
				</tbody>
				</table>
				<%@ include file="footer.html" %>
</body>
</html>