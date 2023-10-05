package Statement;

import java.util.*;
import java.sql.*;

public class Scanner1 {

	public static void main(String[] args) throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
		Statement stmt=con.createStatement();
						
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Employee Number");
		int eno=sc.nextInt();
		System.out.println("Enter Employee Name");
		String ename=sc.next();
		System.out.println("Enter employee Salary");
		double esal=sc.nextDouble();
		System.out.println("Enter employee Address");
		String eaddr=sc.next();
		
	    String sqlQuery="insert into employee values("+eno+",'"+ename+"',"+esal+",'"+eaddr+"')";
	    
	    
	    int rows=stmt.executeUpdate(sqlQuery);
		System.out.println(rows+" Rows are effected");
		con.close();
		
		
	   
	}

}
