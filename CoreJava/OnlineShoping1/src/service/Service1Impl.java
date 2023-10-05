package service;

import java.sql.ResultSet;

import DTO.UserDetails;
import Factory.DaoFactory;
import dao.*;

public class Service1Impl implements Service1{

	UserDao d = DaoFactory.getDao();
	int rows;
	@Override
	public int user_Registration(UserDetails userdetails) throws Exception {
		rows = d.userRegistration(userdetails);
		return rows;
	}
	@Override
	public int add_Address(UserDetails userdetails) throws Exception {
		rows = d.addAddress(userdetails);
		return rows;
	}
	@Override
	public ResultSet search_User(String mobileNumber) throws Exception {
		ResultSet rs = d.searchUser(mobileNumber);
		return rs;
	}
	@Override
	public ResultSet User_Login(String mobileNumber, String password) throws Exception {
		ResultSet rs = d.UserLogin(mobileNumber, password);
		return rs;
	}
	@Override
	public int update_Password(String password, String mobileNumber) throws Exception {
		rows = d.updatePassword(password, mobileNumber);
		return rows;
	}
	@Override
	public ResultSet check_Answers(String teacher, String inspiration, String mobileNumber) throws Exception {
		ResultSet rs = d.checkAnswers(teacher, inspiration, mobileNumber);
		return rs;
	}
	@Override
	public ResultSet displayVegetables() throws Exception {
		ResultSet rs = d.displayVegetables();
		return rs;
	}
	@Override
	public int add_Vegetable_To_Cart(int sno) throws Exception {
		rows = d.addVegetableToCart(sno);
		return rows;
	}
	@Override
	public int update_Quantity(double quantity,String mobileNumber, int sno) throws Exception {
		rows = d.updateQuantity(quantity, mobileNumber,sno);
		return rows;
	}
	@Override
	public ResultSet displayMobiles() throws Exception {
		ResultSet rs = d.displayMobiles();
		return rs;
	}
	@Override
	public int add_Mobile_To_Cart(int sno) throws Exception {
		rows = d.addMobileToCart(sno);
		return rows;
	}
	@Override
	public int order_Number() throws Exception {
		rows = d.orderNumber();
		return rows;
	}
	@Override
	public ResultSet myOrders(String mobileNumber) throws Exception {
		ResultSet rs = d.myOrders(mobileNumber);
		return rs;
	}
	@Override
	public ResultSet display_User_Address(String mobileNumber) throws Exception {
		ResultSet rs = d.displayUserAddress(mobileNumber);
		return rs;
	}
	@Override
	public int change_Address(String houseNumber, String landmark, String village, String mandal, String district,
			String state, String pincode, String mobileNumber) throws Exception {
		rows = d.changeAddress(houseNumber, landmark, village, mandal, district, state, pincode, mobileNumber);
		return rows;
	}	
}
