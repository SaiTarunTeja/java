package Details;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO 
{
	
	public static Connection dbConnection() throws Exception
	{
		String Driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/codinghub";
		String u = "root";
		String p = "root";
		Class.forName(Driver);
		Connection con = DriverManager.getConnection(url,u,p);
		return con;
	}
	public int Register(String name,String department,String mobile,String email,String password) throws Exception
	{
		Connection con = dbConnection();
		String Query = "Insert into LoginRegistration values (?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(Query);
		ps.setString(1, name);
		ps.setString(2, department);
		ps.setString(3, mobile);
		ps.setString(4, email);
		ps.setString(5, password);
		int rows = ps.executeUpdate();
		con.close();
		return rows;
	}
	public ResultSet Login(String name,String password) throws Exception
	{
		Connection con = dbConnection();
		String Query = "Select * from LoginRegistration where name=? AND password=?";
		PreparedStatement ps = con.prepareStatement(Query);
		ps.setString(1, name);
		ps.setString(2, password);
		ResultSet rs = ps.executeQuery();
		
		return rs;
	}
}
