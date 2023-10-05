//accounts class
package Bank_Project;

public class Account extends Customer{
	protected long gstnumber;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(String first_Name, String last_Name, String address, double balance, long gstnumber) {
		super(first_Name, last_Name, address, balance);
		this.gstnumber = gstnumber;
		
	}
	public double interest(){
		double in;
		in = (balance*5)/100;
		return in;
	}
	
}

class PersonalAccount extends Customer{
	protected long personalnumber;

	public PersonalAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonalAccount(String first_Name, String last_Name, String address, double balance,long persosnalnumber) {
		super(first_Name, last_Name, address, balance);
		this.personalnumber = persosnalnumber;
	}
	public double interest(){
		double in;
		in = (balance*6)/100;
		return in;
	}

}

