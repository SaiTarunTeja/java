//bank class
package Bank_Project;


class BalanceInsufficientException extends Exception {
	public String toString() {
		return "Balance Insufficient!";
	}
}

public class Bank{

	Customer[] customerList = new Customer[50];

	static int index =0;

	/*public String   addCustomer(String fname,String lname,String address,double balance){

		Customer cust = new Customer(fname,lname,address,balance);

		customerList[index++]=cust;

		return "Account created Successfully !! id is :"+cust.getId();

	}*/
	public String addPersonalCustomer(String fname,String lname,String address,double balance, long personalnumber){
		Customer cust = new PersonalAccount(fname,lname,address,balance,personalnumber);
		customerList[index++] = cust;
		return "Personal Account created Successfully !! id is :"+cust.getId();
	}
	public String addBusinessCustomer(String fname,String lname,String address,double balance, long gstnumber){
		Customer cust = new Account(fname,lname,address,balance,gstnumber);
		customerList[index++] = cust;
		return "Business Account created Successfully !! id is :"+cust.getId();
	}
	
	public String  deposit(int id,double amount){
		//String result="";
		for(int i=0;i<=index;i++){
			if(customerList[i].getId()==id){	
				customerList[i].setBalance(customerList[i].getBalance()+amount);
				return "Amount deposited Successfully" +customerList[i].getBalance();
			}			
		}
		return "customer not found";
	}
	public void displayALL(){

		for(int i=0;i<index;i++){
			System.out.println(i);
//			customerList[i].display();
			System.out.println(customerList[i].toString());
		}
	}
	public String withdraw(int id, double amount)throws BalanceInsufficientException{
		for(int i=0;i<index;i++){
			if(customerList[i].getId()==id){
				if(customerList[i].getBalance()<amount){
					throw new BalanceInsufficientException();
					
				}
				else{
					customerList[i].setBalance(customerList[i].getBalance()-amount);
					return "Withdraw Successful"+customerList[i].getBalance();
				}
			}
		}
		return "User Not Found";		
	}
	public String transfer(int id1,int id2,double amount) throws BalanceInsufficientException{
		for(int i=0;i<index;i++){
			if(customerList[i].getId()==id1){
				for(int j=0;j<index;j++){
					if(customerList[j].getId()==id2){
						if(customerList[i].getBalance()<amount){
							 throw new BalanceInsufficientException();
						}
						else{
							customerList[i].setBalance(customerList[i].getBalance()-amount);
							customerList[j].setBalance(customerList[j].getBalance()+amount);
							return "Transfer Successful. Your remaining balance"+customerList[i].getBalance();
						}
					}
				}
				return "receiver user not found";
			}
		}
		return "Sender account not found";
	}
	public String calculateInterest(int id){
		for(int i=0;i<index;i++){
			if(customerList[i].getId() == id){
				return "interest is : "+customerList[i].interest();
			}
		}
		return "Customer Not Found";
	}
}