package Tarun;

import java.util.Scanner;

public class Extraction {

	public static void main(String[] args) 
	{
       System.out.println("ENTER ANY NUMBER");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int r;
       while(n>0)
       {
    	   r=n%10;
    	System.out.println(r);
    	n=n/10;
       }
	}

}
