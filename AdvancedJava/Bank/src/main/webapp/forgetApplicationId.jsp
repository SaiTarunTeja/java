<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<form action = 'forgetApplicationId' method = 'post' >
		<h1 align = 'center'>welcome to Forget Application Id</h1>
		<table align = 'center'>
			
			<tr>
				<td><label for = 'email'>Email</label></td>
				<td><input type = 'email' name = 'email'/></td>
			</tr>
			<tr>
				<td><label for = 'password'>Password</label></td>
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