<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Login</title>
</head>
<body>
	<h1 align = 'center'>Welcome To Admin Login</h1>
	<form action = 'AdminLogin' method = 'post'>
		<table align = 'center'>
			<tr>
				<td><label for='userName'>Admin Name</label></td>
				<td><input type='text' name = 'userName'/></td>
			</tr>
			<tr>
				<td><label for='password'>Password</label></td>
				<td><input type='password' name = 'password'/></td>
			</tr>
			<tr>
				<td><input type='reset' value = 'cancel'/></td>
				<td><input type='submit' value = 'login'/></td>
			</tr>
		</table>
		<table align = 'center'>
		<tr>
				<td><h4>Not Yet Register <a href = 'adminRegistration.jsp'>Register</a></h4></td>
			</tr>
		</table>
		<table align = 'center'>
		<tr>
			<td><button ><a href = 'user.jsp'>User Login</a></button></td>
			<td><button ><a href = 'sellerLogin.jsp'>Seller LogIn</a></button></td>
		</tr>
	</form>
</body>
</html>