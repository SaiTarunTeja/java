package Tarun;

import java.util.Scanner;

public class Maxofgivennumber 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r,max=0,max2=0,max3=0,temp=n;
		while(n>0)
		{
			r=n%10;
		   if(r>max)
		   {
			   max = r;
		   }
		   n=n/10;
		}
           System.out.println(max);
           n=temp;
           while(n>0)
           {
        	   r=n%10;
        	   if(max>r&&r>max2)
        	   {
        		   max2=r;
        	   }
        	   n=n/10;
           }
           System.out.println("second highest digit of given number = "+ max2);
           n=temp;
           while(n>0)
           {
        	   r=n%10;
        	   if(max>r&&max2>r&&r>max3)
        	   {
        		   max3=r;
        	   }
        	   n=n/10;
           }
           System.out.println("Third highest digit of given number = "+ max3);
           
	}

}
