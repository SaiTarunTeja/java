package admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.AdminDatabase;
@WebServlet("/Delete")
public class DeleteSeller extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int shopId = Integer.parseInt(request.getParameter("shopId"));
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println(shopId);
		try {
			if(AdminDatabase.deleteSeller(shopId)>0)
				out.println("Seller Deleted Successfully");
			else
				out.println("Something Went Wrong Please Try Again");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
