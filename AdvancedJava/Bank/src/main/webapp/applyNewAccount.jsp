<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer</title>
</head>
<body>
	<form action = 'CustomerRegistration' method = 'post' >
		<h1 align = 'center'>welcome to Customer</h1>
		<table align = 'center'>
			<tr>
				<td><label for = 'firstName'>First Name</label></td>
				<td><input type = 'text' name = 'firstName'/></td>
			</tr>
			<tr>
				<td><label for = 'lastName'>Last Name</label></td>
				<td><input type = 'text' name = 'lastName'/></td>
			</tr>
			<tr>
				<td><label for = 'aadharNumber'>Aadhar Number</label></td>
				<td><input type = 'number' name = 'aadharNumber'/></td>
			</tr>
			<tr>
				<td><label for = 'dateOfBirth'>Date Of Birth</label></td>
				<td><input type ='date' name = 'dateOfBirth'/></td>
			</tr>
			<tr>
				<td><label for = 'city'>City</label></td>
				<td><input type = 'text' name = 'city'/></td>
			</tr>
			<tr>
				<td><label for = 'mobile'>Mobile</label></td>
				<td><input type = 'number' name = 'mobile'/></td>
			</tr>
			<tr>
				<td><label for = 'email'>Email</label></td>
				<td><input type = 'email' name = 'email'/></td>
			</tr>
			<tr>
				<td><label for = 'password'>password</label></td>
				<td><input type = 'password' name = 'password'/></td>
			</tr>
			<tr>
				<td><label for = 'balance'>Balance</label></td>
				<td><input type = 'text' name = 'balance'/></td>
			</tr>
			<tr>
				<td><input type = 'reset' value = 'reset'/></td>
				<td><input type = 'submit' value = 'submit'/></td>
			</tr>
		</table>
	</form>
</body>
</html>