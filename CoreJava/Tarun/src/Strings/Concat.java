package Strings;
import java.util.*;
public class Concat {

	public static void main(String[] args) {
//		JAVA program to concatenate two strings without using string method concat()
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String");
		String s1=sc.nextLine();
		System.out.println("Enter Second String");
		String s2=sc.nextLine();
		System.out.println(s1+s2);
//		JAVA program to concatenate two strings using string method concat()
		System.out.println(s1.concat(s2));
		

	}

}
