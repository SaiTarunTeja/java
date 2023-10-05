package Tarun;

import java.util.Scanner;

public class Extraction_sum {

	public static void main(String[] args) 
	{
		System.out.println("ENTR ANY NUMBER");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int var1=1,var2=1,r,count=0;
		while(n>0)
		{
			r = n%10;
			if(count<n)
			{
				++count;
			}
			if(count==1 && count==4)
			{
				var1=var1*r;
			}
			else
			{
				var2=var2*r;
			}
			n=n/10;
			++count;
		}
         System.out.println(var1+var2);
	}

}
