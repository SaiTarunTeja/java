package Employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Database.Database;


@WebServlet("/Applications")
public class Applications extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		try {
			ResultSet rs = Database.applications();
			while(rs.next())
			{
				String aadharNumber = rs.getString("aadharNumber");
				out.println(
						"<form action='AcceptApplications' method='post'><h1>"+rs.getString("firstName")+" "+rs.getString("lastName")+ "<button type='submit' name = '"+aadharNumber+"'>Accept</button>"+"</h1></form>");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
