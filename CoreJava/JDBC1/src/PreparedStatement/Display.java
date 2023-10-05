package PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Display {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String Driver="com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/college";
		String u = "root";
		String p = "root";
		String Query = "select * from Student";
		
		Class.forName(Driver);
		Connection con = DriverManager.getConnection(url,u,p);
		PreparedStatement ps = con.prepareStatement(Query);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getLong(3));
		}
	}

}
