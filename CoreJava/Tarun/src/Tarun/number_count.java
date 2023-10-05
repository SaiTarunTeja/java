package Tarun;
import java.util.*;
public class number_count {

	public static void main(String[] args) 
	{
		int count=0;
		System.out.println("Enter any number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while(n>0)
		{
			n = n/10;
			count=count+1;
			
		}
		 System.out.println("It is "+ count +" digit number");
	}

}
