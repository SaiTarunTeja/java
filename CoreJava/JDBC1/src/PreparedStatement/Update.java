package PreparedStatement;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Update {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/college";
		String u = "root";
		String p = "root";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,u,p);
		System.out.println("Hi");
//		PreparedStatement ps = con.prepareStatement("update employee set ename=? where eno=?");
//		PreparedStatement ps = con.prepareStatement("update employee set ename=? , esal=?+300 , eaddr=? where eno=?");
//		ps.setString(1, "Upendar");
//		ps.setDouble(2, 3700);
//		ps.setString(3, "KPHB");
//		ps.setInt(4, 1);
//		int rows = ps.executeUpdate();
//		if(rows>0)
//			System.out.println("Nunber of rows Updated = "+rows);
//		else
//			System.out.println("No  rows Updated");
		PreparedStatement ps2 = con.prepareStatement("select * from employee where eaddr='hyd'") ;
		ResultSet rs = ps2.executeQuery();
		while(rs.next())
		{
			System.out.print(rs.getInt(1)+" ");
			System.out.print(rs.getString(2)+" ");
			System.out.print(rs.getDouble(3)+" ");
			System.out.print(rs.getString(4)+" ");
			System.out.println();
		}
		PreparedStatement ps1 = con.prepareStatement("select count(*) from employee") ;
//		CallableStatement ps1 = con.prepareCall("{call hyd()}'") ;
		 rs= ps1.executeQuery();
//		int result = ps1.executeUpdate();
//		System.out.println(result);
		
		rs.next();
		int count = rs.getInt(1);
		System.out.println("no. of records= "+count);
		
		
		
	}

}
