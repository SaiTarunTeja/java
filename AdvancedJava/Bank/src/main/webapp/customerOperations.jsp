<%@ page import ="Database.Database , java.sql.*,User.CheckBalance" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<%
			Long accountNumber = (Long)(request.getAttribute("accountNumber"));
			String firstName = (String)request.getAttribute("firstName");
			String lastName = (String)request.getAttribute("lastName");
			String email = (String)request.getAttribute("email");
			String password = (String)request.getAttribute("password");	
			boolean checkbalancestatus=true;
			boolean depositform=true;
			boolean transactionHistory=true; 
		%>
		
		<h1 align = 'center'>Welcome To customer Operations</h1>
		<table align = 'center'>
			<tr>
				<td>
				<form action='CheckBalance' method='post'>
					<input type="hidden" name="accountNumber" value="<%=accountNumber%>" >
					<input type="hidden" name="checkbalancestatus" value="<%=checkbalancestatus%>">
					<button type = 'submit' >Check Balance</button>
				</form>
				</td>
			</tr>
			<tr>
				<td>
				<form action='deposit.jsp' method='post'>
					<input type="hidden" name="accountNumber" value="<%=accountNumber%>" >
					<button type = 'submit' >Deposit</button>
				</form>
				</td>
			</tr>
			<tr>
				<td>
				<form action='withdraw.jsp' method='post'>
					<input type="hidden" name="accountNumber" value="<%=accountNumber%>" >
					<button type = 'submit' >Withdraw</button>
				</form>
				</td>
			</tr>
			<tr>
				<td>
				<form action='transfer.jsp' method='post'>
					<input type="hidden" name="accountNumber" value="<%=accountNumber%>" >
					<button type = 'submit' >Transfer</button>
				</form>
				</td>
			</tr>
			<tr>
				<td>
					<form action='CheckBalance' method='post'>
						<input type="hidden" name="accountNumber" value="<%=accountNumber%>">
						<input type="hidden" name="transactionHistory" value="<%=transactionHistory%>">
						<button type = 'submit' >History</button>
					</form>
				</td>
			</tr>
			
		</table>
	
</body>
</html>