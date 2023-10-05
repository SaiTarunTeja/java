<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Login</title>
	<style type = 'text/css'>
		.middle
		{
			position:'absolute';
			margin-top:150px; 
		}
	</style>
</head>
<body class="middle">
	<h1 align = 'center'>Welcome To User Login</h1>
	<form action = 'UserLogin' method = 'post'>
		<table align = 'center'>
			<tr>
				<td><label for='userName'>User Name</label></td>
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
				<td><h4>Not Yet Register <a href = 'userRegistration.jsp'>Register</a></h4></td>
			</tr>
		</table>
		<table align = 'center'>
		<tr>
			<td><button ><a href = 'adminLogin.jsp'>Admin Login</a></button></td>
			<td><button ><a href = 'sellerLogin.jsp'>Seller LogIn</a></button></td>
		</tr>
		</table>
	</form>
</body>
</html>