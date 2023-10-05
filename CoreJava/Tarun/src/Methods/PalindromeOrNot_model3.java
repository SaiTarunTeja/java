package Methods;

import java.util.Scanner;

public class PalindromeOrNot_model3 {

	public static void main(String[] args) {
		palin12 P = new palin12();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
        int n=sc.nextInt();
        P.palin11(n);
        P.palin12();

	}

}
class palin12
{
	int temp,r,a=0;
	public void palin11(int n)
	{
		 temp=n;
        for(;n>0;n/=10)
        {
        	r=n%10;
        	a=a*10+r;
        }
       
	}
	public void palin12()
	{
		if(temp==a)
        	System.out.println(temp+" is a palindrome");
        else
        	System.out.println(temp+" is not a palindrome");
	}
}