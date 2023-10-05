package seller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import user.Database;

public class SellerDB 
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
	public static int register(String shopId,String shopName,String mobile,String email,String password) throws ClassNotFoundException, SQLException
	{
		Connection con = Database.getConnection();
		String query = "insert into seller values (?,?,?,?,?)";
		
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, shopId);
		ps.setString(2, shopName);
		ps.setString(3, mobile);
		ps.setString(4, email);
		ps.setString(5, password);
		
		return ps.executeUpdate();
	}
	public static ResultSet sellerLogin(String shopId , String password) throws ClassNotFoundException, SQLException
	{
		Connection con = Database.getConnection();
		String query = "select * from seller where shopId = ? And password = ?";
		
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, shopId);
		ps.setString(2, password);
		
		return ps.executeQuery();
	}
}
