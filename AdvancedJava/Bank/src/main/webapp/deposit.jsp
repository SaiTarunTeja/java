<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Deposit And Withdrawal</title>
</head>
<body>
	<form action = 'CheckBalance' method = 'post'>
		<h1 align = 'center'>Welcome To Deposit </h1>
		<table align = 'center'>
			<!--  tr>
				<td><label for = 'accountNumber'>Account Number</label></td>
				<td><input type = 'number' name = 'accountNumber'/></td>
			</tr--->
			<% 
				String accountNumber = request.getParameter("accountNumber");
				out.println(accountNumber); 
				boolean depositstatus=true;
			%>
				
			<tr>
				<td><label for = 'deposit'>Deposit Amount</label></td>
				<td><input type = 'number' name = 'deposit'/></td>
				
			</tr>
			
			<tr>
				<td><input type = 'reset' value = 'reset'/></td>
				<td>
				   <input type="hidden" name="accountNumber" value="<%=accountNumber%>">
					<input type="hidden" name="depositstatus" value="<%=depositstatus%>">
					<input type = 'submit' value = 'submit'/>
				</td>
			</tr>
			
		</table>
	</form>
</body>
</html>