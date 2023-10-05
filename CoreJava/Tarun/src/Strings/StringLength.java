package Strings;
import java.util.*;
public class StringLength {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1=sc.nextLine();
		System.out.println(s1.length());
		System.out.println("String length without using method");
		int count=0;
		char s2[]=s1.toCharArray();
		for(char zz:s2)
		{
			count++;
		}
		System.out.println(count);

	}

}
