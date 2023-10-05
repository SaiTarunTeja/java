//customer class
package Bank_Project;

public abstract class Customer {

	private static int count=1000;
	protected int id;
	protected String first_Name;
	protected String last_Name;
	protected String address;
	protected double  balance;
	public Customer() {
		this.id = count++;
	}
	public Customer( String first_Name, String last_Name, String address, double balance) {
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
	public abstract double interest();
	public void display(){
		System.out.println("Full name is : "+this.first_Name + " " + this.last_Name);
		System.out.println("Address is : "+this.address);
		System.out.println("Balance is : "+this.balance);
		System.out.println("Interest is :"+interest());
	}
}
