package Factory;
import java.sql.*;
public class ConnectionFactory {

	public static Connection getConnection()throws Exception{
		String driver = "com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/codinghub1";
		String u="root";
		String p="root";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, u, p);
		return con;
	}
}
