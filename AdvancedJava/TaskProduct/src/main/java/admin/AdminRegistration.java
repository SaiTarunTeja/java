package admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import user.Database;

/**
 * Servlet implementation class AdminRegistration
 */
@WebServlet("/AdminRegistration")
public class AdminRegistration extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String mobile = request.getParameter("mobile");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		try 
		{
			int rows = AdminDatabase.registerAdmin(name, email, password, mobile);
			if(rows>0)
			{
				out.println("<h1>Register Successful</h1>");
				RequestDispatcher rd = request.getRequestDispatcher("adminLogin.jsp");
				rd.include(request, response);
			}
			else
			{
				out.println("<h1>Something Went Wrong Please Try Again</h1>");
				RequestDispatcher rd = request.getRequestDispatcher("adminRegistration.jsp");
				rd.include(request, response);
			}
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}

}
