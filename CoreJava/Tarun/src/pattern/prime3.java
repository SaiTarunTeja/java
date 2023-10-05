package pattern;

import java.util.Scanner;


public class prime3 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Pr p = new Pr();
		System.out.println("Enter Starting Number");
		int s=sc.nextInt();
		System.out.println("Enter Ending Number");
		int e=sc.nextInt();
        p.prime1(s,e);
       //p.prime2();
	}

}
class Pr
{
	int a,s,e,count;
	public void prime1(int s,int e)
  {
	for(;s<=e;s++)
	{
		count=0;
		for(a=1;a<=s;a++)
		{
			if(s%a==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(s);
		}
		
	}
  }
	


	}


