package Database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;


public class Database
{
	public static Connection getConnection() throws SQLException, ClassNotFoundException
	{
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/bank";
		String u = "root";
		String p = "root";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,u,p);
		return con;
	}
	public static ResultSet employeelogin(String empid,String name,String email,String password) throws ClassNotFoundException, SQLException
	{
	Connection con=Database.getConnection();
	String query="select * from employee where empid=? and name=? and email=? and password=?";
	PreparedStatement st=con.prepareStatement(query);
	st.setString(1,empid);
	st.setString(2, name);
	st.setString(3, email);
	st.setString(4, password);
	return st.executeQuery();
	}
	public static ResultSet applications() throws ClassNotFoundException, SQLException 
	{
		Connection con=Database.getConnection();
		String query="select ApplicationId,firstName,lastName,aadharNumber,dateOfBirth,city,mobile,balance from customer where status = 'pending'";
		PreparedStatement ps = con.prepareStatement(query);
		return ps.executeQuery();
	}
	public static int customerRegister(Long accountNumber,String firstName,String lastName,String aadharNumber,Date dateOfBirth,String city,String mobile,String email,String password,Double balance) throws ClassNotFoundException, SQLException
	{
		Connection con = Database.getConnection();
		String query="insert into customer (accountNumber, firstName, lastName, aadharNumber, dateOfBirth, city, mobile, email, password, balance) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setLong(1, accountNumber);
		ps.setString(2, firstName);
		ps.setString(3, lastName);
		ps.setString(4, aadharNumber);
		ps.setDate(5, dateOfBirth);
		ps.setString(6, city);
		ps.setString(7, mobile);
		ps.setString(8, email);
		ps.setString(9, password);
		ps.setDouble(10, balance);
		
		int rows = ps.executeUpdate();
		con.close();
		return rows;
	}
	public static Long getapplicationId(String email,String password) throws ClassNotFoundException, SQLException
	{
		Connection con = Database.getConnection();
		Long applicationId =0L;
		String query = "select applicationId from customer where email=? and password=?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, email);
		ps.setString(2, password);
		ResultSet rs = ps.executeQuery();
		if(rs.next())
		{
			applicationId = rs.getLong("applicationId");
			return applicationId;
		}
		else
			return 0L;
		
	}
	public static boolean isAccountNumberExist(Long accountNumber) throws ClassNotFoundException, SQLException
	{
		Connection con = Database.getConnection();
		String query = "select * from customer where accountNumber=?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setLong(1,accountNumber);
		ResultSet rs = ps.executeQuery();
		if(rs.next())
			return true;
		else 
			return false;
	}
	public static boolean isCustomerExist(String aadharNumber) throws ClassNotFoundException, SQLException
	{
		Connection con = Database.getConnection();
		String query = "select * from customer where aadharNumber=?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, aadharNumber);
		ResultSet rs = ps.executeQuery();
		if(rs.next())
			return true;
		else
			return false;
	}
	public static ResultSet searchCustomer(Long accountNumber,String firstName,String lastName,String email,String password) throws ClassNotFoundException, SQLException
	{
		Connection con = Database.getConnection();
		String query = "select * from customer where accountNumber=? AND firstName=? AND lastName=? AND email=? AND password=?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setLong(1, accountNumber);
		ps.setString(2, firstName);
		ps.setString(3, lastName);
		ps.setString(4, email);
		ps.setString(5, password);
		return ps.executeQuery();
	}
	public static String showAccountNumber(String applicationId) throws ClassNotFoundException, SQLException
	{
		Connection con = Database.getConnection();
		String query = "select * from customer where applicationId=?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, applicationId);
		ResultSet rs = ps.executeQuery();
		if(rs.next())
		{
			String status = rs.getString("status");
			if(status.equalsIgnoreCase("pending"))
				return "Your Application is in pending";
			else
				return "Please Note Your Account Number <span style='color: red'><strong>"+rs.getLong("AccountNumber")+"</strong></span>";
		}
		else
			return "Application id Not Exist";
	}
	public static ResultSet checkUser_Balance(Long accountNumber) throws SQLException, ClassNotFoundException
	{
		Connection con = Database.getConnection();
		String query = "select * from customer where accountNumber=?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setLong(1, accountNumber);
		return ps.executeQuery();
				
	}
	public static int deposit(Long transactionId,Long accountNumber,String transactionType,String receiverName,double amount,String senderName) throws ClassNotFoundException, SQLException
	{
		Connection con = Database.getConnection();
		String query1 = "insert into transactions(transactionId,senderAccountNumber,transactionType,receiverName,receiverAccountNumber,amount,senderName) values (?,?,?,?,?,?,?)";
		PreparedStatement ps1  = con.prepareStatement(query1);
		ps1.setLong(1, transactionId);
		ps1.setLong(2, accountNumber);
		ps1.setString(3, transactionType);
		ps1.setString(4, receiverName);
		ps1.setLong(5, accountNumber);
		ps1.setDouble(6, amount);
		ps1.setString(7, senderName);
		int transactionsRows = ps1.executeUpdate();
		
		String query2 = "update customer set balance=balance+? where accountNumber=?";
		PreparedStatement ps2 = con.prepareStatement(query2);
		ps2.setDouble(1, amount);
		ps2.setLong(2, accountNumber);
		int depositRows = ps2.executeUpdate();
		
		if(transactionsRows>0 && depositRows>0)
		{
			return 1;
		}
		else
			return 0;	
	}
	public static int withdrawal(Long transactionId,Long accountNumber,String transactionType,String receiverName,double amount,String senderName) throws ClassNotFoundException, SQLException
	{
		Connection con = Database.getConnection();
		String query1 = "insert into transactions(transactionId,senderAccountNumber,transactionType,receiverName,receiverAccountNumber,amount,senderName) values (?,?,?,?,?,?,?)";
		PreparedStatement ps1  = con.prepareStatement(query1);
		ps1.setLong(1, transactionId);
		ps1.setLong(2, accountNumber);
		ps1.setString(3, transactionType);
		ps1.setString(4, receiverName);
		ps1.setLong(5, accountNumber);
		ps1.setDouble(6, -amount);
		ps1.setString(7, senderName);
		int transactionsRows = ps1.executeUpdate();
		
		String query2 = "update customer set balance=balance-? where accountNumber=?";
		PreparedStatement ps2 = con.prepareStatement(query2);
		ps2.setDouble(1, amount);
		ps2.setLong(2, accountNumber);
		int withdrawRows = ps2.executeUpdate();
		
		if(transactionsRows>0 && withdrawRows>0)
			return 1;
		else
			return 0;	
	}
	public static boolean isTransactionIdExist(Long transactionId) throws ClassNotFoundException, SQLException
	{
		Connection con = Database.getConnection();
		String query = "select * from transactions where transactionId=?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setLong(1,transactionId);
		ResultSet rs = ps.executeQuery();
		if(rs.next())
			return true;
		else 
			return false;
	}
	public static int transferAmount(Long transactionId,Long accountNumber,String transactionType,String receiverName,Long receiverAccountNumber,double amount,String senderName) throws ClassNotFoundException, SQLException
	{
		Connection con = Database.getConnection();
		
		Long senderAccountNumber = accountNumber;
		String query1 = "insert into transactions(transactionId,senderAccountNumber,transactionType,receiverName,receiverAccountNumber,amount,senderName) values (?,?,?,?,?,?,?)";
		PreparedStatement ps1  = con.prepareStatement(query1);
		ps1.setLong(1, transactionId);
		ps1.setLong(2, senderAccountNumber);
		ps1.setString(3, transactionType);
		ps1.setString(4, receiverName);
		ps1.setLong(5, receiverAccountNumber);
		ps1.setDouble(6, amount);
		ps1.setString(7, senderName);
		int transactionsRows = ps1.executeUpdate();
		
		String query2 = "update customer set balance = balance-? where accountNumber=?";
		PreparedStatement ps2  = con.prepareStatement(query2);
		ps2.setDouble(1, amount);
		ps2.setLong(2,accountNumber);
		int sendRows = ps2.executeUpdate();
		
		String query3 = "update customer set balance = balance+? where accountNumber=?";
		PreparedStatement ps3  = con.prepareStatement(query3);
		ps3.setDouble(1, amount);
		ps3.setLong(2, receiverAccountNumber);
		int receiveRows = ps3.executeUpdate();
		
		
		
		if(sendRows>0 && receiveRows>0 && transactionsRows>0)
		{
			con.close();
			return 1;
		}
		else
		{
			con.close();
			return 0;
		}	
	}
	public static ResultSet getTransactions(Long accountNumber) throws ClassNotFoundException, SQLException
	{
		Connection con = Database.getConnection();
		String query = "select amount,transactionType,receiverAccountNumber,transactionId,receiverName,date,time,senderName,TimeOfTransaction from transactions  where senderAccountNumber=? OR receiverAccountNumber = ? ORDER BY   TimeOfTransaction desc ";
		PreparedStatement ps  = con.prepareStatement(query);
		ps.setLong(1, accountNumber);
		ps.setLong(2, accountNumber);
		return ps.executeQuery();
	}
	public static int acceptApplication(Long ApplicationId) throws ClassNotFoundException, SQLException
	{
		Connection con = Database.getConnection();
		String query = "update customer set status='accepted' where ApplicationId = ?";
		PreparedStatement ps  = con.prepareStatement(query);
		ps.setLong(1, ApplicationId);
		int rows = ps.executeUpdate();
		con.close();
		return rows;
	}
	public static int acceptAll() throws SQLException, ClassNotFoundException
	{
		Connection con = Database.getConnection();
		String query = "update customer set status='accepted' where status='pending'";
		PreparedStatement ps = con.prepareStatement(query);
		int rows = ps.executeUpdate();
		con.close();
		return rows;			
	}
	public static ResultSet totalCustomers() throws ClassNotFoundException, SQLException
	{
		Connection con = Database.getConnection();
		String query = "SELECT city, COUNT(*) AS city_count FROM customer GROUP BY city "
                	  +"UNION " 
                	  +"SELECT 'Total number of customers' AS city, COUNT(*) AS city_count FROM customer";
		PreparedStatement ps = con.prepareStatement(query);
		return ps.executeQuery();
	}
}
