<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action = 'CheckBalance' method = 'post'>
		<h1 align = 'center'>Welcome To Withdraw </h1>
		<table align = 'center'>
			<% 
				Long accountNumber = Long.parseLong(request.getParameter("accountNumber"));
				out.println(accountNumber); 
				boolean withdrawstatus=true;
			%>
				
			<tr>
				<td><label for = 'withdrawal'>Withdrawal Amount</label></td>
				<td><input type = 'number' name = 'withdrawal'/></td>
				
			</tr>
			
			<tr>
				<td><input type = 'reset' value = 'reset'/></td>
				<td>
				   <input type="hidden" name="accountNumber" value="<%=accountNumber%>">
					<input type="hidden" name="withdrawstatus" value="<%=withdrawstatus%>">
					<input type = 'submit' value = 'submit'/>
				</td>
			</tr>
			
		</table>
	</form>
</body>
</html>