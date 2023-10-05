<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration</title>
<style>
	a{
	text-decoration:none;
	}
</style>
</head>
<body>
	<h1 align='center'>Welcome To User Registration</h1>
	<form action = 'UserRegistration' method = 'post'>
		<table align='center'>
			<tr>
				<td><label for='name'>Name</label></td>
				<td><input type='text' name='name' placeholder = 'Enter Your Name'></td>
			</tr>
			<tr>
				<td><label for='email'>Email</label></td>
				<td><input type='email' name='email'></td>
			</tr>
			<tr>
				<td><label for='password'>Password</label></td>
				<td><input type='password' name='password' ></td>
			</tr>
			<tr>
				<td><label for='mobile'>Mobile Number</label></td>
				<td><input type='text' name='mobile' ></td>
			</tr>
			<tr>
				<td><label for='address'>Complete Address</label></td>
				<td><input type='text' name='address' ></td>
			</tr>
			<tr>
				<td><input type='reset' value='cancel' ></td>
				<td><input type='submit' value='Register' ></td>
			</tr>
		</table>
		
		<table align='center'>
			<tr>
				<td>Already Register  <a href = 'userLogin.jsp'>Login</a></td>
			</tr>
		</table>
	</form>
</body>
</html>