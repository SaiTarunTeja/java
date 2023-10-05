package PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CRUID {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		String choice;
		do 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number below What You Want You Do");
			System.out.println("1.Create table");
			System.out.println("2.Retrieve table");
			System.out.println("3.Update table");
			System.out.println("4.Inser table");
			System.out.println("5.Delete table");
				
			int option = sc.nextInt();
		
			int rows;
			String name;
			int id;
		
			switch (option)
			{
				case 1:  rows=createTable();
						 if(rows>0)
							 System.out.println("Table Created Successfully");
						 else
							 System.out.println("Table Not Created Try Again");
						 break;
				case 2: 
					 	 ResultSet rs=retrieve();
					 	 if(rs.next())
					 	 {
					 		 while(rs.next())
					 			 System.out.println(rs.getString(1)+" "+rs.getInt(2));
					 	 }
					 	 break;
				case 3: 
						 System.out.println("Enter Student Name");
						 name = sc.nextLine();
						 System.out.println("Enter Student Id");
						 id = sc.nextInt();
						 rows = update(name, id);
						 if(rows>0)
							 System.out.println("updated Successfully");
						 else
							 System.out.println(" Try Again");
						 break;
				case 4: 
						 System.out.println("Enter Student Name");
						 name = sc.next();
						 System.out.println("Enter Student Id");
						 id = sc.nextInt();
						 rows = addStudent(name, id);
						 if(rows>0)
							 System.out.println("inserted Successfully");
						 else
							 System.out.println(" Try Again");
						 break;
				case 5: 
						 System.out.println("Enter Student Id");
						 id = sc.nextInt();
						 rows = delete(id);
						 if(rows>0)
							 System.out.println("deleted Successfully");
						 else
							 System.out.println(" Try Again");
						 break;
			}
				System.out.println("DO you want another Operation Enter Yes");
				choice = sc.next();
			
		}while (choice.equalsIgnoreCase("Yes"));
		
	}
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		String Driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/veera";
		String u = "root";
		String p = "root";
		Class.forName(Driver);
		return DriverManager.getConnection(url,u,p);
	}
	public static int addStudent(String name , int id) throws ClassNotFoundException, SQLException
	{
		Connection con = CRUID.getConnection();
		String Query = "insert into Student values(?,?)";
		PreparedStatement ps = con.prepareStatement(Query);
		ps.setString(1, name);
		ps.setInt(2, id);
		return ps.executeUpdate();
	}
	public static int createTable() throws ClassNotFoundException, SQLException
	{
		Connection con = CRUID.getConnection();
		String Query = "Create Table Student (name varchar(30),id int)";
		PreparedStatement ps = con.prepareStatement(Query);
		return ps.executeUpdate();
		
	}
	public static ResultSet retrieve() throws ClassNotFoundException, SQLException
	{
		Connection con = CRUID.getConnection();
		String Query = "select * from Student";
		PreparedStatement ps = con.prepareStatement(Query);
		return ps.executeQuery();
	}
	public static int update(String name , int id) throws ClassNotFoundException, SQLException
	{
		Connection con = CRUID.getConnection();
		String Query = "update student name=? where id=?";
		PreparedStatement ps = con.prepareStatement(Query);
		ps.setString(1, name);
		ps.setInt(2, id);
		return ps.executeUpdate();
	}
	public static  int delete(int id) throws ClassNotFoundException, SQLException
	{
		Connection con = CRUID.getConnection();
		String Query = "delete from  student where id=?";
		PreparedStatement ps = con.prepareStatement(Query);
		ps.setInt(1, id);
		return ps.executeUpdate();
	}
}
