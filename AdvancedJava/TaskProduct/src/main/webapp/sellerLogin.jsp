<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Seller Login</title>
</head>
<body>
	<h1 align = 'center'>Welcome To Seller Login</h1>
	<form action = 'SellerLogin' method = 'post'>
		<table align = 'center'>
			<tr>
				<td><label for='shopId'>Shop Id</label></td>
				<td><input type='text' name = 'shopId'/></td>
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
			<td><h4>Not Yet Register <a href = 'sellerRegistration.jsp'>Register</a></h4></td>
		</tr>
		</table>
		<table align = 'center'>
		<tr>
			<td><button ><a href = 'userLogin.jsp'>User LogIn</a></button></td>
			<td><button ><a href = 'adminLogin.jsp'>Admin Login</a></button></td>
		</tr>
		</table>
	</form>
</body>
</html>