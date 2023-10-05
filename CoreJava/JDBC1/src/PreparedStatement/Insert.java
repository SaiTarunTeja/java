package PreparedStatement;
import java.sql.*;
import java.util.*;
public class Insert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String Driver="com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/college";
		String u = "root";
		String p = "root";
		String Query = "insert into student values(?,?,?)";
		
		Class.forName(Driver);
		Connection con = DriverManager.getConnection(url,u,p);
		
		Scanner sc = new Scanner(System.in);
		String option;
		do
		{
			System.out.println("Enter values");
			int rollno=sc.nextInt();
			String name = sc.next();
			Long num=sc.nextLong();
			
			PreparedStatement pst = con.prepareStatement(Query);
			pst.setInt(1, rollno);
			pst.setString(2, name);
			pst.setLong(3, num);
			pst.executeUpdate();
			System.out.println("Inserted Successfully");
			System.out.println("Do You Want To Insert Another");
			option=sc.next();
		
		}while(option.equalsIgnoreCase("yes"));
		
		con.close();
		
	}

}
