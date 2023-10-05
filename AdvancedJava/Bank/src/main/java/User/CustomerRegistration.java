package User;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Random;

import Database.Database;


@WebServlet("/CustomerRegistration")
public class CustomerRegistration extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String aadharNumber = request.getParameter("aadharNumber");
		Date dateOfBirth = Date.valueOf(request.getParameter("dateOfBirth"));
		String city = request.getParameter("city");
		String mobile = request.getParameter("mobile");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		Double balance = Double.parseDouble(request.getParameter("balance"));
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
			Long accountNumber;
		
		try 
		{
			if(Database.isCustomerExist(aadharNumber))
			{
				out.println("You are already Existing User");
			}
			else
			{
				while(true)
				{
					Random r = new Random();
					accountNumber = Math.abs(r.nextLong(1000000000000L));
					boolean check = Database.isAccountNumberExist(accountNumber);
					if(check==false)
						break;
					else
						continue;
				}
				int rows = Database.customerRegister(accountNumber,firstName, lastName, aadharNumber, dateOfBirth, city, mobile, email, password, balance);
				if(rows>0)
				{
					out.println("Your application is Submitted Successfully Your application Number is "+Database.getapplicationId(email, password));
//					out.println("Your application Number is "+Database.getapplicationId(email, password));
				}
				else
					out.println("Something Went Wrong Please Try Again");
			}
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		
	}

}
