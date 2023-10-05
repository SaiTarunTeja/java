package User;

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

@WebServlet("/ExistingCustomer")
public class ExistingCustomer extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long accountNumber = Long.parseLong(request.getParameter("accountNumber"));
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		request.setAttribute("accountNumber", accountNumber);
		request.setAttribute("firstName", firstName);
		request.setAttribute("lastName", lastName);
		request.setAttribute("email",email);
		request.setAttribute("password",password);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

//		out.println(accountNumber);
//		out.println(firstName);
//		out.println(lastName);
//		out.println(email);
//		out.println(password);
		try {
			ResultSet rs = Database.searchCustomer(accountNumber, firstName, lastName, email, password);
			if(rs.next())
			{
				RequestDispatcher rd = request.getRequestDispatcher("customerOperations.jsp");
				rd.forward(request, response);
			}
			else
			{
				out.println("Something went wrong Please Try Again");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
