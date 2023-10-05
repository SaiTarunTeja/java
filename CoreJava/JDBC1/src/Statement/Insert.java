package Statement;
import java.sql.DriverManager;
import java.sql.*;
public class Insert {

	public static void main(String[] args) throws Exception{
		String url="jdbc:mysql://localhost:3306/college";
		String u="root";
		String p="root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,u,p);
		Statement stmt=con.createStatement();
		stmt.executeUpdate("Insert into student values(1,'Rakesh',1234)");
		System.out.println("data inserted Successfully");
		con.close();
	}

}
