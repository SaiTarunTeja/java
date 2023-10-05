package admin;

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

import user.Database;

@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try 
		{
			ResultSet rs = Database.Login(userName, password);
			if(rs.next())
			{
				out.println(
						"<table align='center'>"
						+ "<tr>"
						+"<th>"+"ShopId"+"</th>"
					    + "   "+"<th>"+ "Shop Name"+"</th>"
					    + "   "+"<th>"+ "Mobile"+"</th>"
					    + "   "+"<th>"+ "Email"+"</th>"
					    + "   "+"<th>"+ "password"+"</th>"+"</tr>");
				rs = AdminDatabase.sellerDetails();
				while(rs.next())
				{
					out.println(
							"<tr>"
							+"<td>"+rs.getString(1)+"</td>"
							+"   "+"<td>"+rs.getString(2)+"</td>"
							+"   "+"<td>"+rs.getString(3)+"</td>"
							+"   "+"<td>"+rs.getString(4)+"</td>"
							+"   "+"<td>"+rs.getString(5)+"</td>"
							+"	 "+"<td><a href = 'EditSeller?shopId="+rs.getString(1)+"'>Edit</a></td>"
							+"   "+"<td><a href = 'Delete?shopId="+rs.getString(1)+"'>Delete</a></td>"
							+"   "+"</tr>");
				}
					out.println("</table>");
			}
			else
			{
				out.println("<h1>Enter valid Details</h1>");
				RequestDispatcher rd = request.getRequestDispatcher("adminLogin.jsp");
				rd.include(request, response);
			}				
		} 
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
