package Exam;
import java.util.*;
public class Space_Remove {
    static String s1;
    static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
		
			predefinedmethod();
			cnst();
	}
	public static String scannerclass()
	{
		System.out.println("Enter String");
		 s1=sc.nextLine();
		 return s1;
	}
	public static void predefinedmethod()
	{
		s1=scannerclass();
		String[] s2=s1.split(" ");
		for(int x=0;x<s2.length;x++)
		{
			System.out.print(s2[x]);
		}
		System.out.println();
	}
	public static void cnst()
	{
		s1=scannerclass();
		for(int x=0;x<s1.length();x++)
		{
			if(s1.charAt(x)!=' ')
			{
				System.out.print(s1.charAt(x));
			}
		}
	}

}
