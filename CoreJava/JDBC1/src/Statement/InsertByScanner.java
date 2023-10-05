package Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertByScanner {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String Driver="com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/college";
		String u = "root";
		String p = "root";
		String Query = "Select * from Student";
		Class.forName(Driver);
		Connection con = DriverManager.getConnection(url,u,p);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(Query);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getLong(3));
		}
		con.close();
	}

}
