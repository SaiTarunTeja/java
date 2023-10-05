package Strings;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter String");
		String s1=sc.nextLine();
		String s2="";
		int x,rev ;
		for(x=s1.length()-1;x>=0;x--)
		{
			s2=s2+s1.charAt(x);
		}
		if(s1.equals(s2))
		{
			System.out.println("It is Palindrome");
		}
		else
		{
			System.out.println("It is not Palindrome");
		}
		// TODO Auto-generated method stub

	}

}
