package do_whileloop;
import java.util.*;
public class PalindromeOrNot 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		int r,a=0,temp=n;
		do
		{
			r=n%10;
			a=a*10+r;
			n=n/10;
		}
        while(n>0);
		if(temp==a)
			System.out.println(a+" is a palindrome");
		else
			System.out.println(a+" is not a palindrome");
	}

}
