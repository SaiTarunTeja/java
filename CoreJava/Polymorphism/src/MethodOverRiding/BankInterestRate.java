package MethodOverRiding;

public class BankInterestRate {
//Achieving Polymorphism with hierarchial inheritance
	public static void main(String[] args) {
		Bank b;
		b=new SBI();
		System.out.println("SBI interest rate= "+b.InterestRate());
		b=new ICICI();
		System.out.println("ICICI interest rate= "+b.InterestRate());
		b=new Axis();
		System.out.println("Axis interest rate= "+b.InterestRate());
	}

}
interface RBI
{
	public int InterestRate();
}
class Bank
{
	public int InterestRate()
	{
		return 0;
		
	}
}
class SBI extends Bank
{
	public int InterestRate()
	{
		return 7;
		
	}
}
class ICICI extends Bank
{
	public int InterestRate()
	{
		return 8;
		
	}
}
class Axis extends Bank
{
	public int InterestRate()
	{
		return 9;
		
	}
}