package Reiteration;

import java.io.*;
public class PalinOrNot {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number To check Palindrom or Not");
		int number=0;
		try {
			number=Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		boolean result=ispalin(number);

		if(ispalin(number))
			System.out.println(number+" is palindrom");
		else
			System.out.println(number+" is not palindrom");
		
	}
	public static boolean ispalin(int number)
	{
		int temp = number,rem,sum=0;
		while(temp>0)
		{
			rem = temp%10;
			sum = sum*10+rem;
			temp=temp/10;
		}
		if(sum==number)
			return true;
//		else
			return false;
	}
}
