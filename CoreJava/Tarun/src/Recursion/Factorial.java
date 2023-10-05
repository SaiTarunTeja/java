package Recursion;
import java.util.*;
public class Factorial 
{
	 public static void main(String args[])
	 {  
		 System.out.println("Enter Number what factorial you want");
		 Scanner sc = new Scanner(System.in);
		 int fact = sc.nextInt();
		 int factorial1 = farward_factor(fact,1);
		 System.out.println(factorial1);
	 }
	 public static int farward_factor(int number,int start)
	 {
		 if(start==number)
			 return number;
		 else
			 return start*farward_factor(number,start+1);
	 }
}