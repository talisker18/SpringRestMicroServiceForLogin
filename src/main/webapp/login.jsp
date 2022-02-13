<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

	<form action="login">
		Username<input type="text" name="user"><br>
		Password<input type="password" name="password"><br>
		<input type="submit" value="Login">
	</form>
	
	<br>
	<br>
	
	<form action="register">
		Username<input type="text" name="user"><br>
		Password<input type="password" name="password"><br>
		Email<input type="email" name="email"><br>
		<input type="submit" value="Register">
	</form>

</body>
</html>