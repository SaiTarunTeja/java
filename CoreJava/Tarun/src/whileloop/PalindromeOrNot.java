package whileloop;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        int temp=n,r,a=0;
        while(n>0)
        {
        	r=n%10;
            a=a*10+r;
            n=n/10;
        }
        if(temp==a)
        	System.out.println(a +" is a palindrome");
        else
        	System.out.println(a +" is not a palindrome");

	}

}
