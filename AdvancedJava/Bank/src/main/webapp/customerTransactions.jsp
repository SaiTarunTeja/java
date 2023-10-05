<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>customerTransactions</title>
</head>
<body>
	<%
		boolean customerTransactions = true;
	
	%>
	<form action='EmployeeOperations' method='post'>
		<h1 align='center'>Welcome to Customer Transactions.jsp</h1>
		<table align='center'>
			<tr>
				<td>
					<label for='customerTransactions'>Customer Account Number</label>
				</td>
				<td>
					<input type='number' name='accountNumber'>
					<input type="hidden" name="customerTransactions" value="<%=customerTransactions%>">
				</td>
			</tr>
			<tr>
				<td>
					<button type = 'reset'>Reset</button>
				</td>
				<td>
					<button type = 'submit'>Submit</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>