package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/app1")
public class s1 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String gender=req.getParameter("gender");
		String DateOfJoining=req.getParameter("DateOfJoining");
		String NativePlace1[]=req.getParameterValues("NativePlace");
		String NativePlace="";
		for(String np:NativePlace1)
			NativePlace=NativePlace+np;
		String skills=req.getParameter("skills");
		String file=req.getParameter("file");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		int result;
	   if(!DateOfJoining.equalsIgnoreCase("")&&!DateOfJoining.equalsIgnoreCase("dd-mm-yyyy")) {
		try {
			result = DB1.postData(name, email, password, gender, DateOfJoining, NativePlace, skills);
			if(result>0)
				out.println("You Registed Successfully");
			else
				out.println("Please Try again Later");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		}
	   }
	   else {
		   out.println("<h1 style='color:red;'>enter date of joining</h1>");
		   RequestDispatcher rd=req.getRequestDispatcher("index.html");
		   rd.include(req, resp);
	   }
	}

}
