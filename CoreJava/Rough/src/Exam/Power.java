package Exam;

public class Power 
{
	public static void main(String[] args) 
	{
		doublepower dp=new doublepower();
		dp.p1();
		intpower ip=new intpower();
		ip.p1();
	}
}
class doublepower
{
	double num=2.2,pow=2.5,mul=1,x;
	public void p1()
	{
		for(x=0;x<=pow;x++)
		{
			mul=num*mul;
		}
		System.out.println(num);
		System.out.println(Math.pow(2.2,2.5));
	}
}
class intpower
{
	int num=2,pow=5,mul=1,x;
	public void p1()
	{
		for(x=0;x<pow;x++)
		{
			mul=mul*num;
		}
		System.out.println(mul);
	}
}