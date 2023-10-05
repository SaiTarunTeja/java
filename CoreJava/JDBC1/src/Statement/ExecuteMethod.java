package Statement;

import java.util.*;
import java.sql.*;
public class ExecuteMethod {

	public static void main(String[] args) throws Exception {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/codinghub";
		String u = "root";
		String p = "root";
		System.out.println("Enter Query");
		Scanner sc = new Scanner(System.in);
		String query = sc.nextLine();
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,u,p);
		Statement st = con.createStatement();
		boolean result = st.execute(query);
		if(result==true)
		{
			ResultSet rs = st.getResultSet();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+rs.getString(3)+rs.getLong(4)+rs.getString(5));
				
			}
		}
		else
		{
			int rows = st.getUpdateCount();
			System.out.println("Number of rows effected: "+rows);
		}
	}
}
