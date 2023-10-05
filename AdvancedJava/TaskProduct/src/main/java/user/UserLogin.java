package user;

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


@WebServlet("/UserLogin")
public class UserLogin extends HttpServlet {
	
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
				rs = Database.products();
				while(rs.next())
				{
					out.println(rs.getString(1)+"  "+rs.getDouble(2)+"<br/>");
				}
			}
			else
			{
				out.println("<h1>Enter valid Details</h1>");
				RequestDispatcher rd = request.getRequestDispatcher("userLogin.jsp");
				rd.include(request, response);
			}
				
		} 
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
