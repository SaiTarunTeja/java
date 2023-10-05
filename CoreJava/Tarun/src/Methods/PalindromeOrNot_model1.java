package Methods;

import java.util.Scanner;

public class PalindromeOrNot_model1 {

	public static void main(String[] args) {
		palin1 P = new palin1();
        P.palin11();
        P.palin12();
   }

}
class palin1
{
	int temp,r,a=0;
	public void palin11()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
        int n=sc.nextInt();
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