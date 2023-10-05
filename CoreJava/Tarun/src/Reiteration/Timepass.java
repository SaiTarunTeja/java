package Reiteration;

import java.util.Scanner;

public class Timepass { 

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roman Number");
		String RomanNumber = sc.next().toUpperCase();
		int arbicNumber=values(RomanNumber);
		if(arbicNumber==-1)
			System.out.println("Invalid Input");
		else
			System.out.println("Arabic Equivalent "+arbicNumber);
	}
 	public static int values(String RomanNumber)
 	{
 		int previousNumber=0;
 		int result=0;
 		for(int x=RomanNumber.length()-1;x>=0;x--)
 		{
 			char currentChar=RomanNumber.charAt(x);
 			int currentNumber = 0;
 			
 			if(currentChar=='I')
 				currentNumber=1;
 			else if(currentChar=='V')
 				currentNumber=5;
 			else if(currentChar=='X')
 				currentNumber=10;
 			else if(currentChar=='L')
 				currentNumber=50;
 			else if(currentChar=='C')
 				currentNumber=100;
 			else if(currentChar=='D')
 				currentNumber=500;
 			else if(currentChar=='M')
 				currentNumber=1000;
 			else
 				return -1;
 			if(currentNumber<previousNumber)
 			{
 				result-=currentNumber;
 			}
 			else 
 			{
 				result+=currentNumber;
 			}
 			previousNumber=currentNumber;
 		}
 		return result;
 	}
 }
//
//
//public class Timepass//RomanToArabicConverter 
//{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a Roman numeral: ");
//        String romanNumeral = scanner.nextLine();
//        
//        int result = romanToArabic(romanNumeral);
//        
//        if (result == -1) {
//            System.out.println("Invalid Roman numeral");
//        } else {
//            System.out.println("Arabic equivalent: " + result);
//        }
//    }
//    
//    public static int romanToArabic(String s) {
//        int result = 0;
//        int prevValue = 0;
//        
//        for (int i = s.length() - 1; i >= 0; i--) {
//            char currentChar = s.charAt(i);
//            int currentValue = 0;
//            
//            if (currentChar == 'I') {
//                currentValue = 1;
//            } else if (currentChar == 'V') {
//                currentValue = 5;
//            } else if (currentChar == 'X') {
//                currentValue = 10;
//            } else if (currentChar == 'L') {
//                currentValue = 50;
//            } else if (currentChar == 'C') {
//                currentValue = 100;
//            } else if (currentChar == 'D') {
//                currentValue = 500;
//            } else if (currentChar == 'M') {
//                currentValue = 1000;
//            } else {
//                return -1; // Invalid Roman numeral
//            }
//            
//            if (currentValue < prevValue) {
//                result -= currentValue;
//            } else {
//                result += currentValue;
//            }
//            
//            prevValue = currentValue;
//        }
//        
//        return result;
//    }
//}
//
