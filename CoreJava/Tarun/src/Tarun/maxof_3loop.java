package Tarun;

import java.util.Scanner;

import basics.scan_series;

public class maxof_3loop {

	public static void main(String[] args) {
		System.out.println("Enter a,b and c values");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int i=0;
		while(i<1)
		{
			if(a>b&&a>c)
			{
				System.out.println("max of 3 numbers is "+ a);
			}
			else if(b>a&&b>c)
			{
				System.out.println("max of 3 numbers is "+ b);
			}
			else
			{
				System.out.println("max of 3 numbers is "+ c);
			}
			i++;
		}

	}

}
