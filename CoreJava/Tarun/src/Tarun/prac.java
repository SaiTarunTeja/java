package Tarun;
import java.util.*;
public class prac
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n,f=0,sa=0,r;
		n=s.nextInt();
		int temp=n;
		for(;n>0;n=n/10)
		{
			r=n%10;
			f=f>r?f:r;
			
		}
		System.out.println("max :"+ f);
		for(;temp>0;temp=temp/10)
		{
			r=temp%10;
			if(f!=r)
			{
				if(sa>r)
					sa=sa;
				else
					sa=r;
			}
		}
		System.out.println("max2 :"+ sa);
		

	}

}
