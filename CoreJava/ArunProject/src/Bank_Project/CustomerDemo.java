//customerDemo class
package Bank_Project;

import java.util.Scanner;

public class CustomerDemo {

	public static void main(String[] args) {
		Bank bank = new Bank();
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do{
			System.out.println("1.Add a customer");
			System.out.println("2.Display all customers");
			System.out.println("3.Deposit");
			System.out.println("4.Withdraw");
			System.out.println("5.Transfer");
			System.out.println("6.Caluclate Interest");
			System.out.println("enter your choice");
			choice = sc.nextInt();
			
			switch(choice){
		
			case 1:
				System.out.println("Enter 1 for personalcustomer");
				System.out.println("Enter 2 for Businesscustomer");
				int c = sc.nextInt();
				if(c==1){
					System.out.println("enter your firstname :");
					String fname= sc.next();
					System.out.println("enter your lastname :");
					String lname= sc.next();
					System.out.println("enter your address :");
					String address= sc.next();
					System.out.println("enter your balance :");
					double balance= sc.nextDouble();
					System.out.println("enter personal number :");
					long personalnumber = sc.nextLong();
					String result = bank.addPersonalCustomer(fname, lname, address, balance,personalnumber);
					System.out.println(result);
				}
				else if(c==2){
					System.out.println("enter your firstname :");
					String fname= sc.next();
					System.out.println("enter your lastname :");
					String lname= sc.next();
					System.out.println("enter your address :");
					String address= sc.next();
					System.out.println("enter your balance :");
					double balance= sc.nextDouble();
					System.out.println("enter gst number :");
					long gstnumber = sc.nextLong();
					String result = bank.addBusinessCustomer(fname, lname, address, balance, gstnumber);
					System.out.println(result);
				}
				else{
					System.out.println("Invalid Input choose one from options");
				}
				break;
			case 2:
				bank.displayALL();
				break;
			case 3:
				System.out.println("enter your id :");
				int id1=sc.nextInt();
				System.out.println("enter the amount:");
				double amount = sc.nextDouble();
				String result1 = bank.deposit(id1,amount);
				System.out.println(result1);
				break;
			case 4:
				System.out.println("Enter your Id :");
				int id2 = sc.nextInt();
				System.out.println("Enter Amount to WithDraw :");
				double amount1 = sc.nextDouble();
				String res;
				try {
					res = bank.withdraw(id2, amount1);
					System.out.println(res);
				} catch (BalanceInsufficientException e1) {
					e1.printStackTrace();
				}
				
				break;
			case 5:
				System.out.println("Enter Your id");
				int id3 = sc.nextInt();
				System.out.println("enter receivers id");
				int id4 = sc.nextInt();
				System.out.println("enter amount to transfer");
				double amount2 = sc.nextDouble();
				String res1;
				try {
					res1 = bank.transfer(id3, id4, amount2);
					System.out.println(res1);
				} catch (BalanceInsufficientException e) {
					e.printStackTrace();
				}
				break;
			case 6:
				System.out.println("Enter ID");
				int id5 = sc.nextInt();
				String res2 = bank.calculateInterest(id5);
				System.out.println(res2);		
			}	
		}while(choice<7);
		sc.close();
	}

}
