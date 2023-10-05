Account.java
=================================================================
package bankAccount;
import java.util.Scanner;

public class Account {

	public static void main(String[] args) {
		Bank bank = new Bank();
		CommercialCustomer cc = new CommercialCustomer();
		PersonaLCustomer pc = new PersonaLCustomer();
		Scanner sc = new Scanner(System.in);
		
		int choice;
		int id1;
		int id2;
		String result="";
		String res;
		double amount1;
		
		do{
			System.out.println("1.Add a customer");
			System.out.println("2.Display all customers");
			System.out.println("3.Deposit");
			System.out.println("4.Withdraw");
			System.out.println("5.Transfer to another customer");
			System.out.println("enter your choice");
			 choice = sc.nextInt();
			
			switch(choice){
		
			case 1:
				System.out.println("enter your firstname :");
				String fname= sc.next();
				System.out.println("enter your lastname :");
				String lname= sc.next();
				System.out.println("enter your address :");
				String address= sc.next();
				System.out.println("enter your balance :");
				double balance= sc.nextDouble();
				System.out.println("Do you want personal Account or commercial Account type P or C");
				String type = sc.next();
				if(type.charAt(0)=='p') {
					System.out.println("Enter your Home phone number");
					String home_phone = sc.next();
					System.out.println("Enter your Work phone number");
					String work_phone = sc.next();
					result = bank.addCustomer(type,fname,lname,address,work_phone,home_phone,balance);
				}
				else if(type.charAt(0)=='c') {
					System.out.println("Enter your Home phone number");
					String person_phone = sc.nextLine();
					System.out.println("Enter your Work phone number");
					String business_phone = sc.nextLine();
					
					result = bank.addCustomer(type,fname, lname, address,person_phone,business_phone,balance);
				}
				
				
	
		
				
				System.out.println(result);
				break;
			case 2:
				
				bank.displayALL();
			break;
			case 3:
				System.out.println("enter your id :");
				id1=sc.nextInt();
				System.out.println("enter the amount:");
				double amount = sc.nextDouble();
				
				String result1 = bank.deposit(id1,amount);
				System.out.println(result1);
			break;
			case 4:
				System.out.println("Enter your id : ");
				id1=sc.nextInt();
				System.out.println("Enter the amount you want to withdraw : ");
				amount1 =sc.nextDouble();
				
				res = bank.withdraw(id1, amount1);
				System.out.println(res);
			break;
			case 5:
				System.out.println("Enter your id: ");
				id1=sc.nextInt();
				System.out.println("Enter Those id who you want to transfer : ");
				id2=sc.nextInt();
				System.out.println("Enter amount you want to transfer : ");
				amount1 =sc.nextDouble();
				
				res = bank.transfer(id1,id2,amount1);
				System.out.println(res);
			
			}
			
			
			
		}while(choice<6);


	}

}

=================================================================================================
Bank.java
=================================================================
package bankAccount;

import java.util.Arrays;

public class Bank {

	Customer[] customerList = new Customer[50];

	static int index =0;



	public String addCustomer(String type,String fname,String lname,String address,String H_number,String P_number,double balance){

		Customer cust = new Customer();
		
		

		if(type.charAt(0)=='p') {
			PersonaLCustomer pc = new PersonaLCustomer(fname,lname,address,balance,P_number,H_number);
			customerList[index++]=pc;
			
		}
		else if(type.charAt(0)=='c') {
			CommercialCustomer cc = new CommercialCustomer(fname,lname,address,balance,P_number,H_number);
			customerList[index++]=cc;
		}
		//customerList[index++]=cust;

		return "Account created Successfully !! id is :"+cust.getId();

	}
	public String  deposit(int id,double amount){
		for(int i=0;i<index;i++){
			if(customerList[i].getId()==id){	
				customerList[i].setBalance(customerList[i].getBalance()+amount);
				return "Amount deposited Successfully and Your final amount is " +customerList[i].getBalance();
			}			
		}
		return "customer not found";
	}
	public String withdraw(int id,double amount) {
		for(int i=0;i<index;i++) {
			if(customerList[i].getId()==id) {
				if(amount<=customerList[i].getBalance()) {
					customerList[i].setBalance(customerList[i].getBalance()-amount);
					return "Amount Withdraw Successfully and your final balance is "+customerList[i].getBalance();
				}
				return "insufficiant Balance\n";
			}
		}
		return "customer not found";
	}
	
	public String transfer(int id1,int id2,double amount) {
		String res="Amount Withdraw Successfully from ";
		for(int i=0;i<index;i++) {
			if(customerList[i].getId()==id1) {
				for(int j=0;j<index;j++) {
					if(customerList[j].getId()==id2){
						if(amount<=customerList[i].getBalance()) {
							customerList[i].setBalance(customerList[i].getBalance()-amount);
						    customerList[j].setBalance(customerList[j].getBalance()+amount);
						    return res+customerList[i]+" to "+customerList[j];
					}
						return "insufficiant balance";
					
					}
					
						
				}return "enter correct reciver id";
				
			}
		}return "enter correct sender id ";
	}
	public void displayALL(){

		for(int i=0;i<=index;i++){

			System.out.println(customerList[i]);
		}
	}	
	
}

==================================================================
customer.java
=================================================================
package bankAccount;

public class Customer {

	protected static int count=1000;
	protected int id;
	protected String first_Name;
	protected String last_Name;
	protected String address;
	protected double  balance;
	public Customer() {
		this.id = count++;
	}
	public Customer(String first_Name, String last_Name, String address, double balance,String P_number,String H_number) {
		super();
		this.id = count++;
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.address = address;
		this.balance = balance;
	}
	public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getLast_Name() {
		return last_Name;
	}
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance){
		this.balance=balance;
	}
	
	
}
class PersonaLCustomer extends Customer{
	private String homePhone;
	private String workphone;
	
	public PersonaLCustomer() {
		
	}
	
	public PersonaLCustomer(String first_Name, String last_Name, String address, double balance,String homePhone,String workphone) {
		super(first_Name,last_Name,address,balance, homePhone, workphone);
		this.homePhone=homePhone;
		this.workphone=workphone;
		
	}


	public String getHomePhone() {
		return homePhone;
	}

	
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	
	public String getWorkphone() {
		return workphone;
	}

	/**
	 * @param workphone the workphone to set
	 */
	public void setWorkphone(String workphone) {
		this.workphone = workphone;
	}

	@Override
	public String toString() {
		return "PersonaLCustomer [getHomePhone()=" + getHomePhone() + ", getWorkphone()=" + getWorkphone()
				+ ", getFirst_Name()=" + getFirst_Name() + ", getLast_Name()=" + getLast_Name() + ", getAddress()="
				+ getAddress() + ", getId()=" + getId() + ", getBalance()=" + getBalance() + "]";
	}
	
	

}

class CommercialCustomer extends Customer{
	private String person_no;
	private String business_no;
	
	public CommercialCustomer() {
		
	}
	
	public CommercialCustomer(String first_Name, String last_Name, String address, double balance,String person_no,String business_no) {
		super(first_Name,last_Name,address,balance,person_no,business_no);
		
	}
	
	

	@Override
	public String toString() {
		return "CommercialCustomer [getPerson_no()=" + getPerson_no() + ", getBusiness_no()=" + getBusiness_no()
				+ ", getFirst_Name()=" + getFirst_Name() + ", getLast_Name()=" + getLast_Name() + ", getAddress()="
				+ getAddress() + ", getId()=" + getId() + ", getBalance()=" + getBalance() + "]";
	}

	public String getPerson_no() {
		return person_no;
	}

	public void setPerson_no(String person_no) {
		this.person_no = person_no;
	}

	public String getBusiness_no() {
		
		return business_no;
	}

	public void setBusiness_no(String business_no) {
		this.business_no = business_no;
	}
	
	
}