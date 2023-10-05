package PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws SQLException {
		String driver = "con.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/Bank";
		String u = "root";
		String p = "root";
		String query = "insert into test values('prathap',1234)";
		Connection con = DriverManager.getConnection(url,u,p);
		Statement st = con.createStatement();
		int rows = st.executeUpdate(query);
		System.out.println("Rows affected: " + rows);
		con.close();
	}

}
