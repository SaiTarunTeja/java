package User;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Database.Database;

@WebServlet("/AccountStatus")
public class AccountStatus extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String applicationId = request.getParameter("applicationId");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

//		out.println(applicationId);
		try {
			out.print(Database.showAccountNumber(applicationId));
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}//*/
	}

}
