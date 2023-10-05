package For_tarun;
import java.util.*;
public class PalindromeOrNot
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
        int n=sc.nextInt();
		int temp=n,r,a=0;
        for(;n>0;n/=10)
        {
        	r=n%10;
        	a=a*10+r;
        }
        if(temp==a)
        	System.out.println(temp+" is a palindrome");
        else
        	System.out.println(temp+" is not a palindrome");
	}

}
