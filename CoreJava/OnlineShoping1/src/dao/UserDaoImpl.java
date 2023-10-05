package dao;

import java.sql.*;

import DTO.UserDetails;
import Factory.ConnectionFactory;

public class UserDaoImpl implements UserDao{

	int rows;
	String query;
	@Override
	public int userRegistration(UserDetails userdetails) throws Exception {
		Connection con = ConnectionFactory.getConnection();
		query = "insert into customer values(?,?,?,?,?,?,?)";
		PreparedStatement ps= con.prepareStatement(query);
		ps.setString(1, userdetails.getMobileNumber());
		ps.setString(2, userdetails.getName());
		ps.setString(3, userdetails.getPassword());
		ps.setString(4, userdetails.getTeacher());
		ps.setString(5, userdetails.getInspiration());
		ps.setString(6, userdetails.getBestFriend());
		ps.setString(7, userdetails.getDish());
		
		rows=ps.executeUpdate();
		con.close();
		return rows;
	}
	@Override
	public int addAddress(UserDetails userdetails) throws Exception {
		Connection con = ConnectionFactory.getConnection();
		query = "insert into customerAddress(houseNumber,landmark,village,mandal,district,state,pincode,mobileNumber) values(?,?,?,?,?,?,?,?)";
		PreparedStatement ps= con.prepareStatement(query);
		ps.setString(1, userdetails.getHouseNumber());
		ps.setString(2, userdetails.getLandmark());
		ps.setString(3, userdetails.getVillage());
		ps.setString(4, userdetails.getMandal());
		ps.setString(5, userdetails.getDistrict());
		ps.setString(6, userdetails.getState());
		ps.setString(7, userdetails.getPincode());
		ps.setString(8, userdetails.getMobileNumber());
		
		rows=ps.executeUpdate();
		con.close();
		return rows;
	}
	@Override
	public ResultSet searchUser(String mobileNumber) throws Exception {
		Connection con = ConnectionFactory.getConnection();
		query = "select * from customer where mobileNumber=?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, mobileNumber);
		ResultSet rs = ps.executeQuery();
//		con.close();
		return rs;
	}
	@Override
	public ResultSet UserLogin(String mobileNumber, String password) throws Exception {
		Connection con = ConnectionFactory.getConnection();
		query = "select * from customer where mobileNumber=? AND password=?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, mobileNumber);
		ps.setString(2, password);
		ResultSet rs = ps.executeQuery();
//		con.close();
		return rs;
	}
	@Override
	public int updatePassword(String password,String mobileNumber) throws Exception {
		Connection con = ConnectionFactory.getConnection();
		query = "update customer set password=? where mobileNumber=?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, password);
		ps.setString(2, mobileNumber);
		rows=ps.executeUpdate();
		con.close();
		return rows;
	}
	@Override
	public ResultSet checkAnswers(String teacher, String inspiration, String mobileNumber) throws Exception {
		Connection con = ConnectionFactory.getConnection();
		query = "select * from customer where teacher=? AND inspiration=? AND mobileNumber=?";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setString(1, teacher);
		ps.setString(2, inspiration);
		ps.setString(3, mobileNumber);
		ResultSet rs = ps.executeQuery();
//		con.close();
		return rs;
	}
	@Override
	public ResultSet displayVegetables() throws Exception {
		Connection con = ConnectionFactory.getConnection();
		query = "select * from vegetables";
		PreparedStatement ps = con.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+"\t"+rs.getDouble(3));
		}
//		con.close();
		return rs;
	}
	@Override
	public int addVegetableToCart(int sno) throws Exception {
		Connection con = ConnectionFactory.getConnection();
		query = "insert into orders (productName,price) select productName,price from vegetables where sno=?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, sno);
		rows = ps.executeUpdate();
		con.close();
		return rows;
	}
	@Override
//	public int updateQuantity(double quantity,int itemNumber, String mobileNumber) throws Exception {
	public int updateQuantity(double quantity,String mobileNumber,int sno) throws Exception {

		Connection con = ConnectionFactory.getConnection();
//		query = "update cart set quantity=? ,mobileNumber=? where itemNumber=?";
		query = "update orders set quantity=? , mobileNumber=? , order_Placed_Date=current_Date() where sno=?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setDouble(1,quantity);
		ps.setString(2, mobileNumber);
		ps.setInt(3, sno);
		rows = ps.executeUpdate();
		con.close();
		return rows;
	}
	@Override
	public ResultSet displayMobiles() throws Exception {
		Connection con = ConnectionFactory.getConnection();
		query = "select * from mobiles";
		PreparedStatement ps = con.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+"\t"+rs.getDouble(3));
		}
//		con.close();
		return rs;
	}
	@Override
	public int addMobileToCart(int sno) throws Exception {
		Connection con = ConnectionFactory.getConnection();
		query = "insert into orders (productName,price) select productName,price from mobiles where sno=?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, sno);
		rows = ps.executeUpdate();
		con.close();
		return rows;
	}
	@Override
	public int orderNumber() throws Exception {
		Connection con = ConnectionFactory.getConnection();
		query = "select max(sno) from orders";
		PreparedStatement ps = con.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		rs.next();
		int count = rs.getInt(1);
		con.close();
		return count;
	}
	@Override
	public ResultSet myOrders(String mobileNumber) throws Exception {
		Connection con = ConnectionFactory.getConnection();
		query = "select productName,price,quantity,total,order_Placed_Date,order_Delivery_Date from orders where mobileNumber=?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, mobileNumber);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t"+"\t"+rs.getDouble(2)+"\t"+"\t"+rs.getDouble(3)+"\t"+"\t"+rs.getDouble(4)+"\t"+"\t"+rs.getDate(5)+"\t"+"\t"+rs.getDate(6));
		}
		
		return rs;
	}
	@Override
	public ResultSet displayUserAddress(String mobileNumber) throws Exception {
		Connection con = ConnectionFactory.getConnection();
		query = "select houseNumber,landmark,village,mandal,district,state,pincode from customeraddress where mobileNumber=?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, mobileNumber);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t"+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6)+"\t"+rs.getString(7));
		
		}
		
		return rs;
	}
	@Override
	public int changeAddress(String houseNumber,String landmark,String village,String mandal,String district,String state,String pincode,String mobileNumber) throws Exception {
		Connection con = ConnectionFactory.getConnection();
		query = "update customerAddress set houseNumber=?,landmark=?,village=?,mandal=?,district=?,state=?,pincode=? where mobileNumber=? ";
		PreparedStatement ps= con.prepareStatement(query);
		ps.setString(1, houseNumber);
		ps.setString(2, landmark);
		ps.setString(3, village);
		ps.setString(4, mandal);
		ps.setString(5, district);
		ps.setString(6, state);
		ps.setString(7, pincode);
		ps.setString(8, mobileNumber);
		
		rows=ps.executeUpdate();
		con.close();
		return rows;
		
	}
	
	
}
