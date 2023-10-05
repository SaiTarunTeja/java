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
		String receiverName = (String)request.getAttribute("receiverName");
		Long receiverAccountNumber = (Long)request.getAttribute("receiverAccountNumber");
		Long accountNumber = (Long)request.getAttribute("accountNumber");
		Double amount = (Double)request.getAttribute("amount"); 
		boolean transferAmountStatus=true; 
		out.println("JSP"+amount+" "+receiverAccountNumber+" "+accountNumber);
	%>
	<table align = 'center'>
		<tr>
			<td>Do You Want To Send Money To <%=receiverName%> </td><td> </td>
		</tr>
		<tr>
			<td>
				<form action = 'existingCustomer.jsp' method = 'post'>
					<button type = 'submit'>No</button>
				</form>
			</td>
		
			<td>
				<form action = 'CheckBalance' method = 'post'>
					<input type="hidden" name="accountNumber" value="<%=accountNumber%>">
					<input type='hidden' name='receiverAccountNumber' value='<%=receiverAccountNumber%>'>
					<input type='hidden' name='receiverName' value='<%=receiverName%>'>
					<input type='hidden' name='amount' value='<%=amount%>'>
					<input type="hidden" name="transferAmountStatus" value="<%=transferAmountStatus%>">
					<button type = 'submit' >Yes</button>
				</form>
			</td>
		</tr>
	</table>
</body>
</html>