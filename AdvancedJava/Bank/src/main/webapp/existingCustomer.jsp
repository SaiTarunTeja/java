<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action='ExistingCustomer' method='post'>
		<h1 align='center'>Welcome to Existing user</h1>
		<table align='center'>
			<tr>
				<td><lable for='accountNumber'>Account Number</lable></td>
				<td><input type = 'number' name = 'accountNumber'/></td>
			</tr>
			<tr>
				<td><lable for='firstName'>First Name</lable></td>
				<td><input type = 'text' name = 'firstName'/></td>
			</tr>
			<tr>
				<td><lable for='lastName'>Last Name</lable></td>
				<td><input type = 'text' name = 'lastName'/></td>
			</tr>
			<tr>
				<td><lable for='email'>Email</lable></td>
				<td><input type = 'email' name = 'email'/></td>
			</tr>
			<tr>
				<td><lable for='password'>Password</lable></td>
				<td><input type = 'password' name = 'password'/></td>
			</tr>
			<tr>
				<td><input type = 'reset' value = 'reset'/></td>
				<td><input type = 'submit' value = 'submit'/></td>
			</tr>
		</table>
			
	</form>
</body>
</html>