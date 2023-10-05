package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database 
{
	public static  Connection getConnection() throws ClassNotFoundException, SQLException
	{
		String Driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/codinghub";
		String u = "root";
		String p = "root";
		Class.forName(Driver);
		Connection con = DriverManager.getConnection(url,u,p);
		return con;
	}
	public static int register(String name,String email,String password,String mobile,String address) throws ClassNotFoundException, SQLException
	{
		Connection con = Database.getConnection();
		String query = "insert into loginregistration1 values (?,?,?,?,?)";
		
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, password);
		ps.setString(4, mobile);
		ps.setString(5, address);
		
		return ps.executeUpdate();
	}
	public static ResultSet Login(String name , String password) throws ClassNotFoundException, SQLException
	{
		Connection con = Database.getConnection();
		String query = "select * from loginregistration1 where name = ? And password = ?";
		
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, name);
		ps.setString(2, password);
		
		return ps.executeQuery();
	}
	public static ResultSet products() throws ClassNotFoundException, SQLException
	{
		Connection con = Database.getConnection();
		String query = "select * from product";
		
		PreparedStatement ps = con.prepareStatement(query);
		
		return ps.executeQuery();
	}
}
