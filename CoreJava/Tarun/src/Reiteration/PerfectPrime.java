package Reiteration;
import java.util.*;
public class PerfectPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int rev = reverse(num);
		String res1 = prime(num);
		String res2 = prime(rev);		
		if(res1.equals("prime") && res2.equals("prime"))
			System.out.println("perfect prime");
		else
			System.out.println("Not perfect prime");

	}
	public static String prime(int num)
	{
		int count=0;
		for(int x=1;x<=num;x++)
		{
			if(num%x==0)
				count++;
		}
		if(count==2)
			return "prime";
		else 
			return "Not Prime";
	}
	public static int reverse(int number)
	{
		int temp = number;
		int rev=0,rem;
		while(temp>0)
		{
			rem = temp%10;
			rev=rev*10+rem;
			temp/=10;
		}
		return rev;
	}
}
