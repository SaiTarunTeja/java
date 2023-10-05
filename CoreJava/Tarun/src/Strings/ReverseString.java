package Strings;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1=sc.nextLine();
		int x;
		for(x=s1.length()-1;x>=0;x--)
		{
			System.out.print(s1.charAt(x));
		}
		System.out.println();
//		JAVA program to reverse a string without using string method reverse()
		char a[]=s1.toCharArray();
		for(x=a.length-1;x>=0;x--)
		{
			System.out.print(a[x]);
		}
		

	}

}
