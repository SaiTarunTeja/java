package Statement;

import java.util.*;
import java.sql.*;

public class Update {

	public static void main(String[] args)throws Exception 
	{
		String driver="com.mysql.cj.jdbc.Driver";
		String jdbc_url="jdbc:mysql://localhost:3306/College";
		String u="root";
		String p="root";
		Class.forName(driver);
		Connection con=DriverManager.getConnection(jdbc_url,u,p);
		Statement st=con.createStatement();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee number");
		int num=sc.nextInt();
		System.out.println("what you want to update choose one number below");
		System.out.println("1.Name"+"\n"+"2.Salary"+"\n"+"3.Address");
		int option=sc.nextInt();
		String query;
		if(option==1)
		{
			System.out.println("enter updated Name");
			String Name=sc.next();
			query="update employee set ename='"+Name+"'where eno="+num;
			st.executeUpdate(query);
			System.out.println("Name Updated Successfully");
		}
		else if(option==2)
		{
			System.out.println("enter updated salary");
			Double sal=sc.nextDouble();
			query="update employee set esal="+sal+"where eno="+num;
			st.executeUpdate(query);
			System.out.println("salary Updated Successfully");
		}
		else if(option==3)
		{
			System.out.println("enter updated Address");
			String addr=sc.next();
			query="update employee set eaddr='"+addr+"'where eno="+num;
			st.executeUpdate(query);
			System.out.println("Address Updated Successfully");
		}
		con.close();
		
	}

}
