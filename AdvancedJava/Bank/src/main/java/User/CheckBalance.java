package User;

import java.io.IOException; 
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Database.Database;

@WebServlet("/CheckBalance")
public class CheckBalance extends HttpServlet {
	public static Double checkBalance(Long accountNumber) throws ClassNotFoundException, SQLException 
	{		
//			ResultSet rs;
//			try 
//			{
				double balance=0;
				ResultSet rs = Database.checkUser_Balance(accountNumber);
				if(rs.next())
					balance = rs.getDouble("balance");		
//			} catch (ClassNotFoundException | SQLException e) {
//				e.printStackTrace();
//			}
			return balance;
	}
	public static Long transactionIdGenerator() throws ClassNotFoundException, SQLException
	{
		Long transactionId;
		while(true)
		{
			Random r = new Random();
			transactionId = Math.abs(r.nextLong(10000000000L));
			boolean check;
		
			check = Database.isTransactionIdExist(transactionId);
			if(check==false)
				break;
			else
				continue;		
		}
		return transactionId;
	}
	public static String deposit(Long transactionId,Long accountNumber,String transactionType,double amount,String senderName) throws ClassNotFoundException, SQLException 
	{
		String receiverName=getAccountHolderName(accountNumber);
//		ResultSet rs = Database.checkUser_Balance(accountNumber);
//		if(rs.next())
//		{
//			receiverName = rs.getString("firstName")+" "+rs.getString("lastName");
//		}
		int rows =   Database.deposit(transactionId,accountNumber,transactionType,receiverName, amount,senderName);
		 if(rows>0)
			 return "deposit Successful";
		 else
			 return "something Went Wrong Please Try again Later";
//		try {
//			balance =  Database.deposit(accountNumber, amount)+" "+checkBalance(accountNumber);
//		} 
//		catch (ClassNotFoundException | SQLException e) 
//		{
//			e.printStackTrace();
//		}
//		return balance;	
	}
	public static String withdrawal(Long transactionId,Long accountNumber,String transactionType,double amount,String senderName) throws ClassNotFoundException, SQLException 
	{
//		int balance=0;
		String receiverName=getAccountHolderName(accountNumber);
//		int rows;
		double availableBalance=checkBalance(accountNumber);
//			ResultSet rs = Database.checkUser_Balance(accountNumber);
//			if(rs.next())
//			{
//				receiverName = rs.getString("firstName")+" "+rs.getString("lastName");
////				availableBalance = rs.getDouble("balance");
//			}
			if(availableBalance>=amount)
			{
				 int rows =   Database.withdrawal(transactionId,accountNumber,transactionType,receiverName, amount,senderName);
				 if(rows>0)
					 return "withdraw Successful";
				 else
					 return "something Went Wrong Please Try again Later";
			}
			else
				return "Insufficient Balance";

	}
	public static ResultSet findReceiverName (Long senderaccountNumber) throws ClassNotFoundException, SQLException
	{
		return Database.checkUser_Balance(senderaccountNumber);
	}
	public static int transferAmount(Long transactionId,Long accountNumber,String transactionType,String receiverName,Long receiverAccountNumber,double amount,String senderName) throws ClassNotFoundException, SQLException
	{
		return Database.transferAmount(transactionId,accountNumber,transactionType,receiverName,receiverAccountNumber,amount,senderName);
	}
	public static String getAccountHolderName(Long accountNumber) throws ClassNotFoundException, SQLException
	{
		String accountHolderName = "";
		ResultSet rs = Database.checkUser_Balance(accountNumber);
		if(rs.next())
		{
			accountHolderName = rs.getString("firstName")+" "+rs.getString("lastName");
		}
		return accountHolderName;
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Long accountNumber=Long.parseLong(request.getParameter("accountNumber"));
		String transactionType;
		String senderName;
		out.println(accountNumber);
		boolean checkbalancestatus = Boolean.parseBoolean(request.getParameter("checkbalancestatus")); 
		boolean depositstatus = Boolean.parseBoolean(request.getParameter("depositstatus"));
		boolean withdrawstatus = Boolean.parseBoolean(request.getParameter("withdrawstatus"));
		boolean transferstatus = Boolean.parseBoolean(request.getParameter("transferstatus"));
		boolean transferAmountStatus = Boolean.parseBoolean(request.getParameter("transferAmountStatus"));
		boolean transactionHistory = Boolean.parseBoolean(request.getParameter("transactionHistory"));
		if(checkbalancestatus)
		{			
			try {
				out.println(checkBalance(accountNumber));
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
		if(depositstatus) 
		{
			try 
			{
				Long transactionId = transactionIdGenerator();
				transactionType = "deposit";
				senderName = getAccountHolderName(accountNumber);
				double depositAmount = Double.parseDouble(request.getParameter("deposit"));
				out.println(deposit(transactionId,accountNumber,transactionType,depositAmount,senderName));
			} 
			catch (ClassNotFoundException | SQLException e) 
			{
				e.printStackTrace();
			}
		}
		if(withdrawstatus) 
		{
			try 
			{
				Long transactionId = transactionIdGenerator();
				transactionType = "withdrawal";
				senderName = getAccountHolderName(accountNumber);
				double withdrawAmount = Double.parseDouble(request.getParameter("withdrawal"));
				out.println(withdrawal(transactionId,accountNumber,transactionType,withdrawAmount,senderName));
			} 
			catch (ClassNotFoundException | SQLException e) 
			{
				e.printStackTrace();
			}
		}
		if(transferstatus)
		{
			Long receiverAccountNumber = Long.parseLong(request.getParameter("receiverAccountNumber"));
			double amount  = Double.parseDouble(request.getParameter("amount"));
			try 
			{
				ResultSet rs = findReceiverName(receiverAccountNumber);
				if(rs.next())
				{
					String receiverName = rs.getString("firstName")+" "+rs.getString("lastName");
					request.setAttribute("receiverName", receiverName);
					request.setAttribute("receiverAccountNumber", receiverAccountNumber);
					request.setAttribute("accountNumber", accountNumber);
					request.setAttribute("amount", amount);
					RequestDispatcher rd  = request.getRequestDispatcher("amountTransfer.jsp");
					rd.forward(request, response);
				}
				else
					out.println("Account Number Does Not Exist");

			} 
			catch (ClassNotFoundException | SQLException e) 
			{
				e.printStackTrace();
			}
		}
		if(transferAmountStatus)
		{
			double amount  = Double.parseDouble(request.getParameter("amount"));
			Long receiverAccountNumber = Long.parseLong(request.getParameter("receiverAccountNumber"));
			String receiverName = request.getParameter("receiverName");
			transactionType = "TransferMoney";			
			
			try 
			{
					double availableBalance = checkBalance(accountNumber) ;
					senderName = getAccountHolderName(accountNumber);
					if(availableBalance>=amount)
					{
						Long transactionId = transactionIdGenerator();
						int rows =transferAmount(transactionId,accountNumber,transactionType,receiverName,receiverAccountNumber,amount,senderName);
						if(rows>0)
							out.println(amount+" is Transfered To "+receiverName+" Successfully");
						else
							out.println("Something Went Wrong Please Try Again");
					}
					else
						out.println("You Account Having Insufficient Balance");
			} 
			catch (ClassNotFoundException | SQLException e) 
			{
				e.printStackTrace();
			}				
		}
		if(transactionHistory)
		{
			try {
				ResultSet rs = Database.getTransactions(accountNumber);
				if(rs.next())
				{
					out.println(
								"<table align='center' cellspacing='5' cellpadding='5'>"
								+ "<tr>"
								+ "<th>Amount</th>"
								+ "<th>Transaction Type</th>"
								+ "<th>Receiver AccountNumber</th>"
								+ "<th>transactionId</th>"
								+ "<th>Receiver Name</th>"
								+ "<th>date</th>"
								+ "<th>time</th>"
								+ "<th>Sender Name</th>"
								+ "</tr>");
					rs = Database.getTransactions(accountNumber);
					while(rs.next())
					{
						out.println("<tr>"
									+ "<td>"+rs.getDouble(1)+"</td>"									
									+ "<td>"+rs.getString(2)+"</td>"
									+ "<td>"+rs.getLong(3)+"</td>"
									+ "<td>"+rs.getLong(4)+"</td>"
									+ "<td>"+rs.getString(5)+"</td>"
									+ "<td>"+rs.getDate(6)+"</td>"
									+ "<td>"+rs.getTime(7)+"</td>"
									+ "<td>"+rs.getString(8)+"</td>"
									+ "</tr>");
					}
					out.println("</table>");
				}
				else
					out.println("No Transactions Done");
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
	}
}


