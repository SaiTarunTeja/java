<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		boolean pendingApplications = true;
		boolean customerDetails = true;
		boolean customerTransactions = true;
	%>
		<h1 align = 'center'>Employee operations</h1>
		<table align = 'center'>
			<tr>
				<td>
					<form action='EmployeeOperations' method='post'>
						<input type="hidden" name="pendingApplications" value="<%=pendingApplications%>">
						<button type="submit">Applications</button>
					</form>
				</td>	
			</tr>
			<tr>
				<td>
					<form action='EmployeeOperations' method='post'>
						<input type="hidden" name="customerDetails" value="<%=customerDetails%>">
					<button>Customer details</button>
					</form>
				</td> 
			</tr>
			<tr>
				<td>
					<form action='customerTransactions.jsp' method='post'>
						<input type="hidden" name="customerTransactions" value="<%=customerTransactions%>">
					<button>Customer Transactions</button>
					</form>
				</td>
			</tr>
			<tr><td><button><a href='customer.jsp'>Exit</a></button></td></tr>
		</table>

</body>
</html>