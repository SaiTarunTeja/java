<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Seller Registration</title>
</head>
<body>
	<h1 align = 'center'>Welcome To Seller Registration</h1>
	<form action = 'SellerRegistration' method = 'post'>
		<table align = 'center'>
			<tr>
				<td><label for='shopId'>Shop Id</label></td>
				<td><input type='text' name = 'shopId'/></td>
			</tr>
			<tr>
				<td><label for='shopName'>Shop Name</label></td>
				<td><input type='text' name = 'shopName'/></td>
			</tr>
			<tr>
				<td><label for='mobile'>Mobile</label></td>
				<td><input type='text' name = 'mobile'/></td>
			</tr>
			<tr>
				<td><label for='email'>Email</label></td>
				<td><input type='email' name = 'email'/></td>
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
				<td><h4>Not Yet Register <a href = 'sellerLogin.jsp'>Register</a></h4></td>
			</tr>
		</table>
	</form>
</body>
</html>