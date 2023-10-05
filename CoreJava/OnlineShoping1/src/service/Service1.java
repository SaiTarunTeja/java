package service;

import java.sql.ResultSet;

import DTO.UserDetails;

public interface Service1 
{
	public int user_Registration(UserDetails userdetails) throws Exception;
	public int add_Address(UserDetails userdetails) throws Exception;
	public ResultSet search_User(String mobileNumber) throws Exception;
	public ResultSet User_Login(String mobileNumber,String password) throws Exception;
	public int update_Password(String password,String mobileNumber) throws Exception;
	public ResultSet check_Answers(String teacher,String inspiration,String mobileNumber) throws Exception;
	public ResultSet displayVegetables() throws Exception;
	public int add_Vegetable_To_Cart(int sno) throws Exception;
	public int update_Quantity(double quantity,String mobileNumber,int sno) throws Exception;
	public int add_Mobile_To_Cart(int sno) throws Exception;
	public ResultSet displayMobiles() throws Exception;
	public int order_Number() throws Exception ;
	public ResultSet myOrders(String mobileNumber) throws Exception;
	public ResultSet display_User_Address(String mobileNumber) throws Exception;
	public int change_Address(String houseNumber,String landmark,String village,String mandal,String district,String state,String pincode,String mobileNumber) throws Exception;

}
