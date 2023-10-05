package Exam;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word");
		String s1=sc.next();
		String s2=new String("");
		int x;
		for(x=s1.length()-1;x>=0;x--)
		{
			 s2=s2+s1.charAt(x);
		}
		if(s1.equals(s2))
		{
			System.out.println("it is palindrome");
		}
		else 
		{
			System.out.println("it is not palindrome");
		}
		

	}

}
