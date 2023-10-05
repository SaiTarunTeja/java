package Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Create {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
		Statement stmt=con.createStatement();
		String query="Create table Student(sid int,sname varchar(40),sno bigint)";
		stmt.executeUpdate(query);
		System.out.println("Table Created Successfully");
		con.close();
	}

}
