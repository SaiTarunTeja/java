package Employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Database.Database;


@WebServlet("/AcceptApplications")
public class AcceptApplications extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String aadharNumber = request.getParameter("aadharNumber");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
//		out.println("Rakesh");
		boolean accept = Boolean.parseBoolean(request.getParameter("accept"));
		boolean reject = Boolean.parseBoolean(request.getParameter("reject")); 
		boolean pendingApplications =true;
		boolean acceptAll = Boolean.parseBoolean(request.getParameter("acceptAll")); 

//		out.println(ApplicationId+" "+accept);
		if(accept)
		{
			Long ApplicationId  = Long.parseLong(request.getParameter("ApplicationId"));

			try 
			{
				int rows = acceptStatus(ApplicationId);
				if(rows>0)
				{
					out.println("Application Accepted Successfully");
//					request.setAttribute("pendingApplications",pendingApplications);
//					RequestDispatcher rd = request.getRequestDispatcher("EmployeeOperations");
//					rd.include(request,response);
				}
				else
					out.println("Somthing Went Wrong Please Try Again Later");

			} 
			catch (ClassNotFoundException | SQLException e) 
			{
				e.printStackTrace();
			}
		}
		if(acceptAll)
		{			
			try 
			{
				int rows = acceptAll();
				if(rows>0)
					out.println("All Applications Accepted Successfully");
				else 
					out.println("Somthing Went Wrong Please Try Again Later");
			} 
			catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			
			
			
		}
	}
	public static int acceptStatus(Long ApplicationId) throws ClassNotFoundException, SQLException
	{
		return Database.acceptApplication(ApplicationId);
	}
	public static int acceptAll() throws ClassNotFoundException, SQLException
	{
		return Database.acceptAll();
	}
}
