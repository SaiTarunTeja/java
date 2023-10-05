package dao;

import java.sql.ResultSet;

import DTO.UserDetails;

public interface UserDao 
{
	public int userRegistration(UserDetails userdetails) throws Exception;
	public int addAddress(UserDetails userdetails) throws Exception;
	public ResultSet searchUser(String mobileNumber) throws Exception;
	public ResultSet UserLogin(String mobileNumber,String password) throws Exception;
	public int updatePassword(String password,String mobileNumber) throws Exception;
	public ResultSet checkAnswers(String teacher,String inspiration,String mobileNumber) throws Exception;
	public ResultSet displayVegetables() throws Exception;
	public int addVegetableToCart(int sno) throws Exception;
	public int updateQuantity(double quantity,String mobileNumber, int sno) throws Exception;
	public int addMobileToCart(int sno) throws Exception;
	public ResultSet displayMobiles() throws Exception;
	public int orderNumber() throws Exception ;
	public ResultSet myOrders(String mobileNumber) throws Exception;
	public ResultSet displayUserAddress(String mobileNumber) throws Exception;
	public int changeAddress(String houseNumber,String landmark,String village,String mandal,String district,String state,String pincode,String mobileNumber) throws Exception;
}
