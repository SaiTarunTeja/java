package admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.AdminDatabase;

@WebServlet("/EditSeller")
public class EditSeller extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int shopId = Integer.parseInt(request.getParameter("shopId"));
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		try {
			ResultSet rs = AdminDatabase.isShopIdExist(shopId);
			
			if(rs.next())
			{
				out.println("<form action ='update?shopId="+shopId+" ' method='post' >");
				out.println("<table align = 'center' cellspacing='5' cellpadding='5'>"
						+ "<tr> "
						+ "<td><label for = 'shopName'>SHOP NAME</label></td>"
						+ "<td> <input type='text' name= 'shopName' value= ' "+rs.getString(1)+" '></td> </tr>");
				out.println("<tr> "
						+ "<td><label for = 'mobile'>MOBILE</label></td>"
						+ "<td> <input type='text' name= 'mobile' value= ' "+rs.getString(2)+" '></td></tr>");
				out.println("<tr> "
						+ "<td><label for = 'email'>EMAIL ID </td>"
						+ "<td> <input type='text' name= 'email' value= ' "+rs.getString(3)+" '></td></tr>");
				out.println("<tr> "
						+ "<td><label for = 'password'>PASSWORD </td>"
						+ "<td> <input type='text' name= 'password' value= ' "+rs.getString(4)+" '></td></tr>");	
				
				out.println("<tr>"
						+ "<td><input type='reset' value='Cancel'></td>"
						+ "<td><input type='submit' value='Edit' ></td>");
				out.println("</table>");
				out.println("</form>");

			}
			else
				out.println("ShopId Not Exist");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
