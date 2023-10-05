package Exam;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.beans.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

@WebServlet("/in")
public class insertservlet extends HttpServlet {
  //private static final long serialVersionUID = 1L;
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    int Rollno=Integer.parseInt(request.getParameter("rollno"));
    String name=request.getParameter("name");
    int telugu=Integer.parseInt(request.getParameter("tel"));
    int hindi=Integer.parseInt(request.getParameter("hin"));
    int english=Integer.parseInt(request.getParameter("eng"));
    int maths=Integer.parseInt(request.getParameter("math"));
    int science=Integer.parseInt(request.getParameter("sci"));
    int social=Integer.parseInt(request.getParameter("soc"));
    
    try
    {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/coding","root","root");
      java.sql.Statement st = con.createStatement();
      String sql="insert into ssc values("+Rollno+",'"+name+"',"+telugu+","+hindi+","+english+","+maths+","+science+","+social+")";
      st.executeUpdate(sql);
      //st.executeUpdate("commit");
      PrintWriter out1=response.getWriter();
      out1.print("inserted successfully");
      
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }

}