package basics;

import java.util.Scanner;

public class EvenOdd{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to  test");
		int number=sc.nextInt();
		System.out.println("Select Number below");
		System.out.println("1.modularOperator");
		System.out.println("2.withoutModularOperator");
		
		int option=sc.nextInt();
		switch(option)
		{
		case 1: System.out.println(modularOperator(number)); break;
		case 2: System.out.println(withoutModularOperator(number)); break;
		}
	}
	public static String modularOperator(int number)
	{
		if(number%2==0)
			return number+" is Even Number";
		return number+" is Odd Number";
	}
	public static String withoutModularOperator(int number)
	{
		int remainder=number/2;
		int result=remainder*2;
		if(result==number)
			return number+" is Even Number";
		return number+" is Odd Number";
	}
}
