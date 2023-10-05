package Reiteration;

public class TwinPrime 
{

	public static void main(String[] args)
	{
		int a=5,b=3;
		String num1=firstNum(a);
		String num2=firstNum(b);
		if(num1.equals("prime") && num2.equals("prime"))
		{
			if(a-b==-2)
				System.out.println("Twin");
			else if(a-b==2)
				System.out.println("Twin");
			else
				System.out.println(" Not Twin");
		}
		else
			System.out.println("try Another");	
	}
	public static String firstNum(int n)
	{
		int count=0;
		for(int x=1;x<=n;x++)
		{
			if(n%x==0)
				count++;
		}
		if(count==2)
			return "prime";
		else
			return "Not";
	}
	public static String secondNum(int n)
	{
		int count=0;
		for(int x=1;x<=n;x++)
		{
			if(n%x==0)
				count++;
		}
		if(count==2)
			return "prime";
		else
			return "Not";
	}

}
