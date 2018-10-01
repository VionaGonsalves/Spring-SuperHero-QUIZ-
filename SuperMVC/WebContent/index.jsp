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
<body>
<jsp:include page="banner.jsp"/>
<h1>Login</h1>
<table class="table table-striped" style="margin:0px auto">
<tr><td colspan="2" class="alert-info">${Info}</td></tr>
	<form action="login.quiz" method="post">
	
			<tbody>
				<tr>
					<td><label>Enter Email ID: </label></td>
					<td><input type="email" name="email" required class="form-control"></td>

				</tr>
				<tr>
					<td><label>Enter Password: </label></td>
					<td><input type="password" name="password" required class="form-control"></td>
				</tr>
				<tr>
				<td><a href ="forgot.jsp">Forgot password?</a></td>
				<td></td>
				</tr>
				<tr>
					<td><input type="submit" class="btn btn-info" value="Submit">
					</td>
					<td><a href="register.jsp"><input type="button" class="btn btn-info" value="Register"></a></td>
				</tr>
			</tbody>
		</table>
		<%@ include file="footer.html" %>

	</form>
</body>
</html>