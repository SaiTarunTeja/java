package Details;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class Login implements Servlet
{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		DAO dao = new DAO();
		try {
			ResultSet rs = dao.Login(name,password);
			if(rs.next())
			{
//				while(rs.next())
//				{
					out.println("welcome");
					out.print(
						"<table border='5' cellpadding='5' cellspacing='5'>"
						+ "<tr>"
						+ "<th>Name</th><th>Department</th><td><th>Mobile</th></td><th>email</th><th>password</th>"
						+ "</tr>"
						+ "</table>");
				while(rs.next())
				{
					out.print("<table border='5' cellpadding='5' cellspacing='5'>"
							+ "<tr>"
							+ "<td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td>"
							+ "</tr>"
							+ "</table>");
				}
				out.print("<h4>After Table</h4>");
			}
			else
				out.println("Enter valid User Name And Password");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
