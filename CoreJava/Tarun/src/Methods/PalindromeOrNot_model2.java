package Methods;

import java.util.Scanner;

public class PalindromeOrNot_model2 {

	public static void main(String[] args) {
		palin01 P = new palin01();
        P.palin11();
        P.palin12();

	}

}
class palin01
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
        String i=palin12() ;
        System.out.println(i);
	}
	public String palin12()
	{
		if(temp==a)
        	return "palindrome";
        else
        	return "not palindrome";
	}
}