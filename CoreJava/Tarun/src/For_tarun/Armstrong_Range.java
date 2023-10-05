package For_tarun;
import java.util.*;
public class Armstrong_Range 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the start values");
		int start=sc.nextInt();
		System.out.println("enter the end values");
		int end=sc.nextInt();
		int count=0;
		double sum=0;
		for(;start <= end;start++)
		{
			count=0;sum=0;
			int temp=start;
			for(;temp > 0; temp/=10)
			{
				count++;
			}
			temp=start;
			for(;temp > 0 ;temp/=10)
			{
				int rem=temp%10;
				sum=sum+Math.pow(rem, count);
			}
			temp=start;
			if(start==sum)
				System.out.println(sum);
		}
	}
}
