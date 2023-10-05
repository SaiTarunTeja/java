package Statement;

import java.util.*;
import java.sql.*;

public class Scanner2 {

	public static void main(String[] args) throws Exception {
		String driver="com.mysql.cj.jdbc.Driver";
		String jdbc_url="jdbc:mysql://localhost:3306/college";
		String u="root";
		String p="root";
		Class.forName(driver);
		Connection con=DriverManager.getConnection(jdbc_url, u, p);
		Statement st=con.createStatement();
		int rows=0;
		while(true)
		{
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter employee number");
			int eno=sc.nextInt();
			System.out.println("Enter employee Name");
			String ename=sc.next();
			System.out.println("Enter Employee Salary");
			Double esal=sc.nextDouble();
			System.out.println("Enter employye Address");
			String eaddr=sc.next();
			String query=String.format("insert into employee values(%d,'%s',%f,'%s')",eno,ename,esal,eaddr);
			st.executeUpdate(query);
			rows++;
			System.out.println("Do you want to insert another record [YES/NO]");
			String option=sc.next();
			if(option.equalsIgnoreCase("No"))
			{
				System.out.println(rows+" Records Are Inserted");
				break;
			}
		}
		con.close();
			
	}

}
