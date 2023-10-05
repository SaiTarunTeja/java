//Friday assignment

import java.util.*;
 
public class Do_while {

	static int sum=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=0;
		ArrayList<String> b = new ArrayList<String>() ;
		
		
		do{
			System.out.println("1. Cold Coffee   100");
			System.out.println("2. Samosa         40");
			System.out.println("3. Sandwiche     100");
			System.out.println("4. Cappuccino     50");
			System.out.println("5. Coffee         30");
			System.out.println("enter your choice");
			n = sc.nextInt();
			
			switch(n){
			case 1: 
				System.out.println("Ok Wait some time !!\n");
				b.add(" Cold Coffee   100");
				sum+=100;
			break;
			case 2:
				System.out.println("Here Your Samosa !!\n");
				b.add(" Samosa         40");
				sum+=40;
			break;
			case 3:
				System.out.println("Your order will recive in short time!!\n");
				b.add(" Sandwiche     100");
			    sum+=100;
			break;
			case 4:
				System.out.println("You have A great choice!!\n");
				b.add(" Cappuccino     50");
				sum+=50;
			break;
			case 5:
				System.out.println("Here is your coffee !!\n");
				b.add(" Coffee         30");
			    sum+=30;
			break;
			default:
				System.out.println("Thank you for your visit!\n");
				System.out.print("Your total amount ");
				System.out.println(b);
				System.err.print(sum);
			break;
			
			}
			
		}while(n<6);
		


	
	}
	
	
	
	

}