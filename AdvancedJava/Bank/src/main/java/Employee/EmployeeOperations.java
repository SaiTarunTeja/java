package Employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Database.Database;

@WebServlet("/EmployeeOperations")
public class EmployeeOperations extends HttpServlet 
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		boolean pendingApplications = Boolean.parseBoolean(request.getParameter("pendingApplications"));
		boolean customerDetails = Boolean.parseBoolean(request.getParameter("customerDetails")); 
		boolean customerTransactions = Boolean.parseBoolean(request.getParameter("customerTransactions")); 

		
		if(pendingApplications)
		{
//			acceptApplications = true;
			try {
				ResultSet rs = Database.applications();
				if(rs.next())
				{
					out.println(
							"<h1 align = 'center'>Pending Applications</h1>"
							+ "<table align='center' cellspacing='5' cellpadding='5'>"
							+ "<tr>"
							+ "<th>Application Id</th>"
							+ "<th>First Name</th>"
							+ "<th>Last Name</th>"
							+ "<th>Aadhar Number</th>"
							+ "<th>Date Of Birth</th>"
							+ "<th>City</th>"
							+ "<th>Mobile</th>"
							+ "<th>Balance</th>"
							+ "</tr>");
					rs = Database.applications();
					
					while(rs.next())
					{
//						String encodedShopId = URLEncoder.encode(rs.getString(1), "UTF-8");
						out.println(
									"<tr>"
									+ "<td>"+rs.getLong(1)+"</td>"
									+ "<td>"+rs.getString(2)+"</td>"
									+ "<td>"+rs.getString(3)+"</td>"
									+ "<td>"+rs.getString(4)+"</td>"
									+ "<td>"+rs.getDate(5)+"</td>"
									+ "<td>"+rs.getString(6)+"</td>"
									+ "<td>"+rs.getString(7)+"</td>"
									+ "<td>"+rs.getDouble(8)+"</td>"
									+ "<td>"
//									+ "<form action = 'EmployeeOperations' method = 'post'"+
//									  "<input type = 'hidden' name = 'acceptApplications' value = '<%acceptApplications%>'>"+
//									  "<input type = 'hidden' name = 'applicationId' value = "+rs.getLong(1)+
//									  "<button type='submit'>Accept</button>"+
//									  "</form></td>"


//									+ "<form action='EmployeeOperations' method='post'>"
//									+ "<input type='hidden' name='acceptApplications' value='<%=acceptApplications%>'>"
//									+ "<input type='hidden' name='applicationId' value='" + rs.getLong(1) + "'>"
//									+ "<button type='submit'>Accept</button>"
//									+ "</form></td>"
									
//									+"<td><a href='AcceptApplications?applicationid="+rs.getLong(1)+"'>Edit</a></td>"
//								 	+ "<td><button style='background-color:orange'><a style='text-decoration:none;color:white' ' href='AcceptApplications?applicationid='+rs.getLong(1)+"'>edit</a></button></td>"
//									+ "<td><button style='background-color:orange'><a style='text-decoration:none;color:white' href='EmployeeOperations?applicationid=" + rs.getLong(1) + "&shopStatus=true'>edit</a></button></td>"
//									+ "<td><button style='background-color:orange'><a style='text-decoration:none;color:white' href='EmployeeOperations?applicationid=" + rs.getLong(1) + "&acceptApplications=true'>edit</a></button></td>"
//									+ "<td><button style='background-color:orange'><a style='text-decoration:none;color:white' href='ed?shopid=" + encodedShopId + "&acceptApplications=true'>edit</a></button></td>"

									+"   "+"<td><button><a href = 'AcceptApplications?ApplicationId="+rs.getLong(1)+"&accept=true'>Accept</a></button></td>"



									//+ "<td><button style='background-color:orange'><a style='text-decoration:none;color:white' ' href='ed?shopid="+rs.getString(1)+"'>edit</a></button></td>"
//									+  "<a href = 'Delete?shopId="+rs.getString(1)+"'>Delete</a></td>"
//								 	out.println("<td> <a href = 'EditServlet?shopId="+rs.getInt(2)+" '>Edit</a></td>");
									+ "</tr>");
					}
					out.println("<tr>"
								+"<td><a href = 'AcceptApplications?acceptAll=true'>Accept All</a></td>"
								+ "</tr>");
					out.println("</table>");
				}
				else
					out.println("<h1 align='center'>No Pending Applications</h1>");
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			
			
		}
		
		if(customerDetails)
		{
//			out.println("Rakesh Accepted");
			try 
			{
				ResultSet rs  = Database.totalCustomers();
				if(rs.next())
				{
					out.println(
								 "<h2 align = 'center'>Customer Details</h2>"
								+"<table align = 'center'>"
							    +"<tr>"
							    + "<td>City</td>"
							    + "<td>Number Of Customers</td>"
							    + "</tr>");
					rs  = Database.totalCustomers();
					while(rs.next())
					{
						out.println("<tr>"
									+"<td >"+rs.getString(1)+"</td>"
									+"<td align='center'>"+rs.getInt(2)+"</td>"
									+"</tr>");
					}
					out.println("</table>");
				}
			} 
			catch (ClassNotFoundException | SQLException e) 
			{
				e.printStackTrace();
			}
		}
		if(customerTransactions)
		{
			Long accountNumber=Long.parseLong(request.getParameter("accountNumber"));
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
//								+ "TimeOfTransaction"
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
//									+ "<td>"+rs.getTimestamp(9)+"</td>"
									+ "</tr>");
					}
					out.println("</table>");
				}
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
	}
	

}
