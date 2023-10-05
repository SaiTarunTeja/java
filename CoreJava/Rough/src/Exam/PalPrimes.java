package Exam;
import java.util.Scanner;
public class PalPrimes 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting Number");
		int starting=sc.nextInt();
		System.out.println("Enter Ending");
		int ending=sc.nextInt();
		int x,temp,r,pal,count;
		for(;starting<=ending;starting++)
		{
			pal=0;
			temp=starting;
			
			for(;temp>0;temp/=10)
			{
				r=temp%10;
				pal=pal*10+r;
			}
			if(pal==starting)
			{
				count=0;
				for(x=1;x<=starting;x++)
				{
					if(starting%x==0)
					{
					   count++;
					}
				}
				if(count==2)
				{
					System.out.print(starting+" ");
				}
			}
		}
		
	}

}
