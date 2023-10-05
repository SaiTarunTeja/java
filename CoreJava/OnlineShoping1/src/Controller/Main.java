package Controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.util.*;

import DTO.*;
import Factory.*;
import dao.UserDao;
import service.Service1;
public class Main {
	
	static Scanner sc = new Scanner(System.in);
	static UserDetails userdetails = new UserDetails();
	static Service1 service = ServiceFactory.getService();
	
	static String mobileNumber,option;
	public static void main(String[] args) throws Exception {
		System.out.println("Choose One Option below");
		System.out.println("1.Register");
		System.out.println("2.Login");
		
		option = sc.next();
		if(option.equals("1")||option.equalsIgnoreCase("Register"))
			register();
		else if(option.equals("2")||option.equalsIgnoreCase("Login"))
			login();
		else
			System.out.println("Enter Valid Output");
	}
	public static void register() throws Exception
	{
		System.out.println("---*Welcome to Registration Page*---\n");
		
		System.out.println("Enter Mobile Number");
		mobileNumber = sc.next();
		ResultSet rs = service.search_User(mobileNumber);
		if(rs.next())
		{
			System.out.println("you are already a registered user");
			System.out.println();
			while(true)
			{
				System.out.println("choose One option Below");
				System.out.println("1.Go to login");
				System.out.println("2.Exit");
				option= sc.next();
				System.out.println();
				if(option.equals("1")||option.equalsIgnoreCase("Go To Login")||option.equalsIgnoreCase("login")||option.equalsIgnoreCase("log in"))
				{
					login();
					break;
				}
				else if(option.equals("2")||option.equalsIgnoreCase("Exit"))
					System.exit(0);
				else
					System.out.println("Enter Valid input");
				System.out.println();
			}
		}
		else
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Name");
			String name = br.readLine();
			String password;
			while(true)
			{
				System.out.println("Enter password");
				password = br.readLine();
				System.out.println("confirm password");
				String confirm_password = br.readLine();
				if(password.equals(confirm_password))
					break;
			}
			System.out.println("Enter House Number");
			String houseNumber = br.readLine();
			System.out.println("Enter Landmark");
			String landmark = br.readLine();
			System.out.println("Enter village");
			String village = br.readLine();
			System.out.println("Enter Mandal");
			String mandal = br.readLine();
			System.out.println("Enter District");
			String district = br.readLine();
			System.out.println("Enter State");
			String state = br.readLine();
			System.out.println("Enter Pincode");
			String pincode = br.readLine();
			System.out.println("Answer the security questions below");
			System.out.println();
			System.out.println("Enter Last Name of Your favourite Teacher");
			String teacher = br.readLine();
			System.out.println("Enter you Inspiration");
			String inspiration = br.readLine();
			System.out.println("Enter Last Name of Your Best Friend");
			String bestFriend = br.readLine();
			System.out.println("Enter Your favourite dish");
			String dish = br.readLine();
		
			userdetails.setMobileNumber(mobileNumber);
			userdetails.setName(name);
			userdetails.setPassword(password);
			userdetails.setHouseNumber(houseNumber);
			userdetails.setLandmark(landmark);
			userdetails.setVillage(village);
			userdetails.setMandal(mandal);
			userdetails.setDistrict(district);
			userdetails.setState(state);
			userdetails.setPincode(pincode);
			userdetails.setTeacher(teacher);
			userdetails.setInspiration(inspiration);
			userdetails.setBestFriend(bestFriend);
			userdetails.setDish(dish);
			
			int Registration = service.user_Registration(userdetails);
			int AddAddress = service.add_Address(userdetails);
			if(Registration>0 && AddAddress>0)
			{
				System.out.println("Registration sucessful go to Login");
				System.out.println("Select Option Below");
				System.out.println("1.Go to login");
				System.out.println("2.Exit");
				option= sc.next();
				System.out.println();
				if(option.equals("1")||option.equalsIgnoreCase("Go To Login")||option.equalsIgnoreCase("login")||option.equalsIgnoreCase("log in"))
				{
					login();
				}
				else if(option.equals("2")||option.equalsIgnoreCase("Exit"))
					System.exit(0);
				else
					System.out.println("Enter Valid input");
				System.out.println();
			}
			else
				System.out.println("Something Went Wrong Try Again");
		}
	}
	public static void login() throws Exception
	{
		System.out.println("---*Welcome to Login Page*---\n");
		
			System.out.println("Enter Mobile Number");
			mobileNumber = sc.next();
			ResultSet rs = service.search_User(mobileNumber);
			if(rs.next())
			{
				while(true)
				{
					System.out.println("Enter password");
					String password = sc.next();
					rs = service.User_Login(mobileNumber,password);
					if(rs.next())
					{
						System.out.println("Login Successful");
						System.out.println("---*Welcome To OnlineShoping Application*---");
						System.out.println();
						home();
						break;
					}
					else
					{
						System.out.println("You Entered Incorrect Password");
						System.out.println();
						System.out.println("Choose One Option Below");
						System.out.println("1.Forget Password" + "\n" + "2.Try Again");
						option = sc.next();
						if(option.equals("1")||option.equalsIgnoreCase("Forget Password")||option.equalsIgnoreCase("ForgetPassword"))
						{
							System.out.println("Change the password by using");
							System.out.println("1.Verify The OTP");
							System.out.println("2.Answer The Security Questions");
							option = sc.next();
							if(option.equals("1")||option.equalsIgnoreCase("OTP"))
							{
								int chance=3;
								
									Random r = new Random();
									int otpGenerated = r.nextInt(10000);
									System.out.println(otpGenerated);
									while(chance>0)
									{
										System.out.println("Enter OTP");
										int otp = sc.nextInt();
										if(otpGenerated==otp)
										{
											System.out.println("Enter New Password");
											password = sc.next();
											int result=service.update_Password(password, mobileNumber);
											if(result>0)
											{
												System.out.println("password Changed Successfully\n");
												break;
											}
											else
												System.out.println("Some Thing went Wrong");
										}
										else
											System.out.println("You Entered Incorrect OTP\n");
										
										int chances=(chance-1);
										if(chances==0)
										{
											System.out.println("All your chances are lost please try again after some time");
											System.exit(chances);
										}
										else
											System.out.println("You still have only "+ chances+" chances\n");
										chance--;
									}
							}
							else if(option.equals("2")||option.equalsIgnoreCase("Answer The Security Questions")||option.equalsIgnoreCase("Security Questions"))
							{
								int chance=3;
								while(chance>0)
								{
									System.out.println("Enter Last Name of Your favourite Teacher");
									String teacher = sc.next();
									System.out.println("Enter you Inspiration");
									String inspiration = sc.next();
									rs = service.check_Answers(teacher, inspiration, mobileNumber);
									if(rs.next())
									{
										System.out.println("Enter New Password");
										password = sc.next();
										int result=service.update_Password(password, mobileNumber);
										if(result>0)
										{
											System.out.println("password Changed Successfully\n");
											break;
										}	
										else
											System.out.println("Some Thing went Wrong");
									}
									else
										System.out.println("Your Answers Are Incorrect \n");
							
									int chances=(chance-1);
									
									if(chances==0)
									{
										System.out.println("All your chances are lost please try again after some time");
										System.exit(chances);
									}
									else
										System.out.println("You still have only "+ chances+" chances\n");
									chance--;
								}
							}
						}
				}
			}
		}
		else
		{
			System.out.println("Please login after registering");
			register();
		}
	}
	
	public static void home() throws Exception
	{
		System.out.println("-------*Welcome To Home Page*-------");
		System.out.println();
		while(true)
		{
			System.out.println("Select Your Option below");
			System.out.println("1.Categories");
			System.out.println("2.My Orders");
			System.out.println("3.Exit");
			option = sc.next();
		
			int item;
		
			if(option.equals("1") || option.equalsIgnoreCase("categories"))
			{
				while(true)
				{
					System.out.println("Select Your Option below");
					System.out.println("1.Fruits & Vegetables");
					System.out.println("2.Mobile Phones");
					System.out.println("3.Home");
					option = sc.next();
					if(option.equals("1") || option.equalsIgnoreCase("Fruits & Vegetables") || option.equalsIgnoreCase("Fruits") || option.equalsIgnoreCase("Vegetables") )
					{
						while(true)
						{
							item=service.order_Number()+1;
							System.out.println("S.No"+"\t"+"Product Name"+"\t"+"Price/kg");
							service.displayVegetables();
							System.out.println("Enter Product Number What You want");
							int sno = sc.nextInt();
							System.out.println("Are you sure you want to buy it?"+"\n"+"1.Yes"+"\n"+"2.No");
							option = sc.next();
							if(option.equalsIgnoreCase("1") || option.equalsIgnoreCase("Yes"))
							{
								System.out.println("Enter Quantity");
								double quantity = sc.nextDouble();	
								System.out.println("To Confirm The Order Enter "+ item );
								int orderConformationCode = sc.nextInt();
								if(orderConformationCode==item)
								{
									updateAddress(mobileNumber);
									
									int addProduct =service.add_Vegetable_To_Cart(sno);
								
									int updatequantity=service.update_Quantity(quantity,mobileNumber, item);
									
									if(updatequantity>0 && addProduct>0)
									{																				
										System.out.println("Your Order is placed successfully\n");
										System.out.println("Do you want to buy one more fruits and vegetable item");
										System.out.println("1.YES\n2.No");
										option=sc.next();
										if(option.equals("2") || option.equalsIgnoreCase("no"))
											break;
									}									
									else
										System.out.println("Something Wend Wrong Try Again");
								}
								else
									System.out.println("You Entered Incorrect Conformation Code Please try again Later");
							}
						}
					}
					else if(option.equals("2") || option.equalsIgnoreCase("Mobile Phones") || option.equalsIgnoreCase("Mobile") || option.equalsIgnoreCase("Phones") )
					{
						while(true)
						{
							item=service.order_Number()+1;
							System.out.println("S.No"+"\t"+"Product Name"+"\t"+"Price");
							service.displayMobiles();
							System.out.println("Enter Product Number What You want");
							int sno = sc.nextInt();
							System.out.println("Are you sure you want to buy it?"+"\n"+"1.Yes"+"\n"+"2.No");
							option = sc.next();
							if(option.equalsIgnoreCase("1") || option.equalsIgnoreCase("Yes"))
							{
								System.out.println("Enter Quantity");
								double quantity = sc.nextDouble();	
								System.out.println("To Confirm The Order Enter "+ item );
								int orderConformationCode = sc.nextInt();
								if(orderConformationCode==item)
								{
									updateAddress(mobileNumber);
									int addProduct =service.add_Mobile_To_Cart(sno);
									
									int updatequantity=service.update_Quantity(quantity,mobileNumber, orderConformationCode);
							
									if(updatequantity>0 && addProduct>0)
									{
										System.out.println("Your Order is placed successfully\n");
										System.out.println("Do you want to buy one more item");
										System.out.println("1.YES\n2.No");
										option=sc.next();
										if(option.equals("2") || option.equalsIgnoreCase("no"))
											break;
									}	
									else
										System.out.println("Something Wend Wrong Try Again");
								}
								else
									System.out.println("You Entered Incorrect Conformation Code Please try again Later");
							}
						}
					}
					else if(option.equals("3") || option.equalsIgnoreCase("Home"))
						break;
					else
						System.out.println("Enter valid Option");
			
				}
			}
			else if(option.equals("2") || option.equalsIgnoreCase("My Orders") || option.equalsIgnoreCase("Orders"))
			{
				ResultSet rs = service.myOrders(mobileNumber);
				if(rs.next())
				{
					System.out.println("Product Name"+"\t"+"Price"+"\t"+"\t"+"Quantity"+"\t"+"Total"+"\t"+"\t"+"Order_Placed_Date"+"\t"+"Order_Delivery_Date");
					service.myOrders(mobileNumber);
				}
				else
					System.out.println("*--------*No Orders Found*--------*");
				
			}
			else if(option.equals("3") || option.equalsIgnoreCase("Exit"))
				System.exit(0);
			else
				System.out.println("Enter Valid Input");
		}
	}
	public static void updateAddress(String mobileNumber) throws Exception
	{
		while(true)
		{
			System.out.println("House No"+"\t"+"landmark"+"\t"+"village"+"\t"+"mandal"+"\t"+"district"+"\t"+"state"+"\t"+"Pincode");
			service.display_User_Address(mobileNumber);
			
			System.out.println("do You Want To Change Your Address");
			System.out.println("1.Yes");
			System.out.println("2.No");
			System.out.println("3.Exit");
			option=sc.next();
			if(option.equalsIgnoreCase("1") || option.equalsIgnoreCase("Yes"))
			{
				System.out.println("Enter House Number");
				String houseNumber = sc.next();
				System.out.println("Enter Landmark");
				String landmark = sc.next();
				System.out.println("Enter village");
				String village = sc.next();
				System.out.println("Enter Mandal");
				String mandal = sc.next();
				System.out.println("Enter District");
				String district = sc.next();
				System.out.println("Enter State");
				String state = sc.next();
				System.out.println("Enter Pincode");
				String pincode = sc.next();
				int changeAddr=service.change_Address(houseNumber, landmark, village, mandal, district, state, pincode, mobileNumber);
				if(changeAddr>0)
					System.out.println("Address Changed Successfully");
				else
					System.out.println("some went wrong try again later");
				
			}
			else if(option.equalsIgnoreCase("2") || option.equalsIgnoreCase("NO"))
				break;
			else if(option.equalsIgnoreCase("3") || option.equalsIgnoreCase("Exit"))
				System.exit(0);
			else
				System.out.println("Enter Valid Input");
		}
	}
}
