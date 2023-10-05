package Strings;
import java.util.*;
public class CompareTwoStrings {
//	JAVA program to compare two strings without using string method equals()
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1");
		String s1=sc.nextLine();
		
		System.out.println("Enter String 2");
		String s2=sc.nextLine();
		
		char str1[]=s1.toCharArray();
		char str2[]=s2.toCharArray();
		int flag=1;
		int len1=s1.length();
		int len2=s2.length();
		
		
		if(len1==len2)
		{
			for(int x=0;x<s1.length();x++)
			{
				if(str1[x]!=str2[x])
				{
					flag=0;
				}
			}
		}
		else
		{
			flag=0;
		}
		if(flag==1)
		{
			System.out.println("Strings Are Equal");
			System.out.println(s1+" == "+s2);
		}
		else
		{
			System.out.println("Strings Are Not Equal");
			System.out.println(s1+" != "+s2);
		}

	}

}
