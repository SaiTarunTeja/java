package SpringCore;

public class LooseCoupling {

	public static void main(String[] args) {
//		Bank bank = new RBI();
//		bank.getInterestRate();
		RBI rbi = new RBI();
		rbi.getInterestRate();
	}
}
interface Bank
{
	public void getInterestRate();
}
class RBI implements Bank
{
	@Override
	public void getInterestRate() {
//		System.out.println("RBI Interest Rate is 5%");
		
		Bank bank = new SBI();
		
		
		
		bank.getInterestRate();
	}
}
class SBI implements Bank
{
	@Override
	public void getInterestRate() {
		System.out.println("SBI Interest Rate is 6%");		
	}
}
class Union implements Bank
{
	@Override
	public void getInterestRate() {
		System.out.println("Union Bank Interest Rate is 7%");		
	}
}