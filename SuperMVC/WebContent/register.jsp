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
<body style="width:50%">
<jsp:include page="banner.jsp"/>
	<h1>Registration Form</h1>
	<table class="table table-striped">
	<tr><td colspan="2" class="alert-info">${Info}</td></tr>
	
	<form action="register.quiz" method="post">
		
			<tbody>
		
				<tr>
					<td><label>Enter Email ID: </label></td>
					<td><input type="email" name="email" required class="form-control"></td>

				</tr>
				<tr>
					<td><label>Enter password: </label></td>
					<td><input type="password" name="password" required class="form-control"></td>

				</tr>
				<tr>
					<td><label>Your Favorite Superhero?</label></td>
					<td><input type="text" name="answer" required class="form-control"></td>

				</tr>
				
				<tr>
					<td><input type="submit" value="Register" class="btn btn-info"></td>
					<td></td>
				</tr>
			</tbody>
		</table>
		<%@ include file="footer.html" %>

	</form>
</body>
</html>