package admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import admin.AdminDatabase;
@WebServlet("/update")
public class updateSeller extends HttpServlet 
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int shopId = Integer.parseInt(request.getParameter("shopId"));
		String shopName = request.getParameter("shopName");
		String mobile = request.getParameter("mobile");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		try {
			int rows = AdminDatabase.updateSeller(shopId, shopName, mobile, email, password);
			if(rows>0)
			{
				out.println("Updated Successfully");
			}
			else
				out.println("Something Went Wrong Please Try Again");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
