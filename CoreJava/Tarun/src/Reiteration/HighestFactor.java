package Reiteration;
import java.util.*;
public class HighestFactor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int highestdigit = highDigit(num);
		System.out.println(highestdigit+" is Highest digit of "+num); 
		System.out.println("Second Highest Factor Of "+highestdigit+" is "+highFactor(highestdigit));
	}
	public static int highDigit(int num)
	{
		int high=0;
		int temp=num;
		while(temp>0)
		{
			int rem=temp%10;
			if(rem>high)
				high=rem;
			temp/=10;
		}
		return high;
	}
	public static int highFactor(int num)
	{
		int factor=1;
		for(int x=1;x<=num/2;x++)
		{
			if(num%x==0)
				factor=x;
		}
		return factor;
	}
}
