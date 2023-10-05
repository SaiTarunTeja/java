package classmethodsandobjects;

import java.util.Scanner;

 class Armstrong {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Armmethod m = new Armmethod();
		System.out.println("Enter any number");
		m.n = sc.nextInt();
		
		/*	for(;m.temp>0;m.temp/=10)
			{
			    m.r=m.temp%10;
			    m.a=a+m.Arm3();
			}
			if(n==m.a)
			System.out.println("Armstrong");
			else
				System.out.println("not Armstrong");

		*/
	}
}
class Armmethod
{
	int n=152;
	int temp=n,r,count=0,x=1,y=1; double a=0;
	public void Arm1()
	{
		for(;temp>0;temp/=10)
		{
		    count++;
		}
	}
	public void Arm2()
	{
		temp=n;
		for(;temp>0;temp/=10)
		{
		     r=temp%10;
		    a=a+Math.pow(r,count);
		}
		if(n==a)
		System.out.println("Armstrong");
		else
			System.out.println("not Armstrong");
	}
	public void Arm3()
	{
		for(;x<=count;x++)
		{
			y=y*r;
	}

	System.out.println(y);
	}	
}

