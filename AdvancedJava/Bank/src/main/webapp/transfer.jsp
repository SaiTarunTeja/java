<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Transfer Money</title>
</head>
<body>
	<%	
		Long accountNumber = Long.parseLong(request.getParameter("accountNumber"));
		out.println(accountNumber); 
		boolean transferstatus=true; 
	%>
	<form action = 'CheckBalance' method = 'post'>
		<h1 align = 'center'>Welcome To Transfer Money</h1>
		<table align = 'center'>
			<tr>
				<td><label for = 'receiverAccountNumber'>Receiver Account Number</label></td>
				<td><input type = 'number' name = 'receiverAccountNumber'></td>
			</tr>
			<tr>
				<td><label for = 'amount'>Amount</label></td>
				<td><input type = 'number' name = 'amount'/></td>
			</tr>
			<tr>
				<td><button type = 'reset' >cancel</button></td>
				<td>
					<input type="hidden" name="accountNumber" value="<%=accountNumber%>">
					<input type="hidden" name="transferstatus" value="<%=transferstatus%>">
					<!--input type = 'submit' value = 'submit'-->
					<button type = 'submit' >Submit</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>