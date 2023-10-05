package Statement;

import java.util.*;
import java.sql.*;
public class aggSK {

	public static void main(String[] args) throws Exception
	{
		String driver="com.mysql.cj.jdbc.Driver";
		String jdbc_url="jdbc:mysql://localhost:3306/college";
		String u="root";
		String p="root";
		Class.forName(driver);
		Connection con=DriverManager.getConnection(jdbc_url,u,p);
		Statement st=con.createStatement();
		String query="select max(esal) from employee";
		ResultSet rs=st.executeQuery(query);
		if(rs.next())
		{
			System.out.println(rs.getInt(1));
		}
		con.close();
		
	}

}
