package admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDatabase 
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
	public static int registerAdmin(String name,String email,String password,String mobile) throws ClassNotFoundException, SQLException
	{
		Connection con = AdminDatabase.getConnection();
		String query = "insert into admin values (?,?,?,?)";
		
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, password);
		ps.setString(4, mobile);
		
		
		return ps.executeUpdate();
	}
	public static ResultSet Login(String name , String password) throws ClassNotFoundException, SQLException
	{
		Connection con = AdminDatabase.getConnection();
		String query = "select * from admin where name = ? And password = ?";
		
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, name);
		ps.setString(2, password);
		
		return ps.executeQuery();
	}
	public static ResultSet sellerDetails() throws ClassNotFoundException, SQLException
	{
		Connection con = AdminDatabase.getConnection();
		String query = "select * from seller";
		PreparedStatement ps = con.prepareStatement(query);
		return ps.executeQuery();
	}
	public static ResultSet isShopIdExist(int shopId) throws ClassNotFoundException, SQLException
	{
		Connection con = AdminDatabase.getConnection();
		String query = "select shopName,mobile,email,password from seller where shopId = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, shopId);
		return ps.executeQuery();
	}
	public static int updateSeller(int shopId,String shopName,String mobile,String email,String password) throws ClassNotFoundException, SQLException
	{
		Connection con = AdminDatabase.getConnection();
		String query = "update seller set shopName=?,mobile=?,email=?,password=? where shopId =?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, shopName);
		ps.setString(2, mobile);
		ps.setString(3, email);
		ps.setString(4, password);
		ps.setInt(5, shopId);
		int rows = ps.executeUpdate();
		con.close();
		return rows;
	}
	public static int deleteSeller(int shopId) throws ClassNotFoundException, SQLException
	{
		Connection con = AdminDatabase.getConnection();
		String query = "delete from seller where shopId =?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, shopId);
		int rows = ps.executeUpdate();
		con.close();
		return rows;
	}
}