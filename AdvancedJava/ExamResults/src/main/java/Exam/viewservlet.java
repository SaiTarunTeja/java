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
import java.sql.ResultSet;
@WebServlet("/vi")
public class viewservlet extends HttpServlet {

  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    int rollno=Integer.parseInt(request.getParameter("rollno2"));
    PrintWriter out=response.getWriter();
//    out.println("Hii");
    try
    {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/coding","root","root");
    java.sql.Statement st=con.createStatement();
    String sql="select * from ssc where rollno="+rollno;
    ResultSet rs=st.executeQuery(sql);
    
    if(rs.next())
    {
    	
    	out.println("roll no:"+rs.getString(1));
    	out.println("name:"+rs.getString(2));
    	out.println("telugu:"+rs.getInt(3));
    	out.println("hindi:"+rs.getInt(4));
    	out.println("english:"+rs.getInt(5));
    	out.println("maths"+rs.getInt(6));
    	out.println("science"+rs.getInt(7));
    	out.println("social"+rs.getInt(8));
    
    	int total=rs.getInt(3)+rs.getInt(4)+rs.getInt(5)+rs.getInt(6)+rs.getInt(7)+rs.getInt(8);
    	out.println("total:"+total);
    }
    else
    	out.println("Result Not Found");
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }

}