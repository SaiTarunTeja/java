package Reiteration;
import java.util.*;
public class DigitNewLine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = sc.nextInt();		
			
		useExtraction(number);
		useStrings(number);

	}
	public static void useExtraction(int number)
	{
		int temp=number,rem,rev=0;
		while(temp>0)
		{
			rem = temp%10;
			rev = rev*10+rem;
			temp/=10;
		}
		int temp1 = rev;
		System.out.println("Using Extraction");
		while(temp1>0)
		{
			rem = temp1%10;
			System.out.println(rem);
			temp1/=10;
		}
	}
	public static void useStrings(int number)
	{
		
		String s = Integer.toString(number);
		System.out.println("using String Class");
		for(int x=0;x<s.length();x++)
			System.out.println(s.charAt(x));
	}
}
