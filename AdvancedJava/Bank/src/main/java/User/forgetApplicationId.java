package User;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Database.Database;

@WebServlet("/forgetApplicationId")
public class forgetApplicationId extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		try {
				Long applicationId = Database.getapplicationId(email, password);
				if(applicationId>0)
				{
					out.println("<h1 style='color: red;'> Your application Number is "+applicationId+"</h1>");
					RequestDispatcher rd = request.getRequestDispatcher("accountStatus.jsp");
					rd.include(request, response);
				}
				else
					out.println("You are Not having account");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
