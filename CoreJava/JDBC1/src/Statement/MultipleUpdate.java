package Statement;

import java.util.*;
import java.sql.*;

public class MultipleUpdate {

	public static void main(String[] args)throws Exception
	{
		String driver="com.mysql.cj.jdbc.Driver";
		String jdbc_url="jdbc:mysql://localhost:3306/college";
		String u="root";
		String p="root";
		Class.forName(driver);
		Connection con=DriverManager.getConnection(jdbc_url,u,p);
		Statement st=con.createStatement();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Incremented Amount");
		double increment=sc.nextDouble();
		System.out.println("Enter salary Range");
		double salRange=sc.nextDouble();
		String query=String.format("update employee set esal=esal+%f where esal<%f",increment,salRange);
		int updateCount=st.executeUpdate(query);
		System.out.println(updateCount+" rows are updated");
		con.close();
	}

}
