<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action='AccountStatus' method='post'>
		<h1 align='center'>Welcome To Account Status</h1>
		<table align = 'center'>
			<tr>
				<td><label for='applicationId'>Application Id</label></td>
				<td><input type='number' name = 'applicationId' /></td>
			</tr>
			<tr>
				<td><input type='submit' value = 'submit' /></td>
			</tr>
			<tr>
				<td><a href = 'forgetApplicationId.jsp'>Forget Application Id</a></td>
			</tr>
	</form>
</body>
</html>