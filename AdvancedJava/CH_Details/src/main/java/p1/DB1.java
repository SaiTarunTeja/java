package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DB1 
{
	public static int postData(String name,String email,String password,String gender,String DateOfJoining,String NativePlace,String skills) throws ClassNotFoundException, SQLException
	{
		String url="jdbc:mysql://localhost:3306/codinghub";
		String u="root";
		String p="root";
		String query="insert into Registration values(?,?,?,?,?,?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,u,p);
		PreparedStatement pst=con.prepareStatement(query);
		pst.setString(1, name);
		pst.setString(2, email);
		pst.setString(3, password);
		pst.setString(4, gender);
		pst.setString(5, DateOfJoining);
		pst.setString(6, NativePlace);
		pst.setString(7, skills);
		int rows=pst.executeUpdate();
		pst.close();
		con.close();
		return rows;
	}
}
