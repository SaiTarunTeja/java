package Tarun;

import java.util.Scanner;

public class Extraction_sum3 {

	public static void main(String[] args)
	{
		System.out.println("ENTER ANY NUMBER");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int var1=1,var2=1,count=0,r;
		while(n>0)
		{
			if(count<n)
			{
				++count;
			}
			r=n%10;
			if(count%2==0)
			{
				var1=var1*r;
			}
			else
			{
				var2=var2*r;
			}
			n=n/10;
		}
        System.out.println(var1+var2);
	}

}
