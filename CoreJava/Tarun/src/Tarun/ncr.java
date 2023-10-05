package Tarun;

import java.util.Scanner;

public class ncr {

	public static void main(String[] args)
	{
		System.out.println("Enter n value");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter r value");
		int r = sc.nextInt();
		int temp1=1,temp2=1,temp3=1,a=0,answer=0;
		a=n-r;
		
		
			while(n>0)
			{
				temp1=temp1*n;
				--n;
			}
			while(r>0)
			{
				temp2=temp2*r;
				--r;
			}
			while(a>0)
			{
				temp3=temp3*a;
				--a;
			}
		
		
		answer=temp1/(temp2*temp3);
        System.out.println("ncr="+ answer);
	}

}
