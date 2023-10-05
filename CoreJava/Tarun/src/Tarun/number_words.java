package Tarun;

import java.util.Scanner;

public class number_words 
{

	public static void main(String[] args)
	{
		
		System.out.println("Emter any number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev=0,r,count=0;
		for(;n>0;n/=10)
		{
		 r=n%10;
		 rev=rev*10+r;
		 if(rev==0)
		 {
			 count++;
		 }
		
		} 
		 for(;rev>0;rev/=10)	
		 {
			 r=rev%10;
			 switch(r)
			 {
		 case 0 :
			    System.out.print(" Zero ");
			    break;
		  case 1 :
			    System.out.print(" one ");
			    break;
		  case 2 :
				System.out.print(" Two ");
				break;
		  case 3 :
				System.out.print(" Three ");
				break;
		  case 4 :
				System.out.print(" Four ");
				break;
		  case 5 :
				System.out.print(" Five ");
				break;
		  case 6 :
				System.out.print(" Six ");
				break;
		  case 7 :
				System.out.print(" Seven ");
				break;
		  case 8 :
				System.out.print(" Eight ");
				break;
		  case 9 :
				System.out.print(" Nine ");
				break;
		  }
		 }	 
		  for(;count>0;count--)
		  {
			  System.out.print(" zero ");
		  }
			

	}

}
