package Details;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		DAO dao = new DAO();
		try {
			ResultSet rs = dao.Login(name,password);
			if(rs.next())
			{
					out.println("welcome");
					out.print(""
						+ "<table>"
						+ "<tr>"
						+ "<td><th>Name</th></td><td><th>Department</th></td><td><th>Mobile</th></td><td><th>email</th></td><td><th>password</th></td>"
						+ "</tr>"
						+ "</table>");
				while(rs.next())
				{
					out.print("<table>"
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
