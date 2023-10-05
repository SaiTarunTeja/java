package User;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DepositAndWithdrawal")
public class DepositAndWithdrawal extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String accountNumber = request.getParameter("accountNumber");
		String transactionType = request.getParameter("transactionType");
		Double amount = Double.parseDouble(request.getParameter("amount"));
		String password = request.getParameter("password");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println(accountNumber);
		out.println(transactionType);
		out.println(amount);
		out.println(password);
	}

}
