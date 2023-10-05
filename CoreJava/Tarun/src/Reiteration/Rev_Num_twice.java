package Reiteration;
import java.util.*;
public class Rev_Num_twice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = sc.nextInt();
//		System.out.println(useExtraction(number));
		System.out.println(first_Zero(number));
	}
	public static int useExtraction(int number)
	{
		int temp1=number,rem,count=0,rev1=0,rev2=0;
		while(temp1>0)
		{
			rem=temp1%10;
			rev1=rev1*10+rem;
			if(rev1==0)
				count++;
			temp1/=10;
			
		}
		System.out.println(rev1);
		int temp2=rev1;
		while(temp2>0)
		{
			rem=temp2%10;
			rev2=rev2*10+rem;
			temp2/=10;
		}
		if(count>0)
		{
			for(int x=0;x<count;x++)
				rev2=(rev2*10);
		}
		return (rev2);
	}
	public static String first_Zero(int number)
	{
		int temp1 = number,count=0,f_zeros=0,rev=0,rev1=0,rem;
		StringBuffer sb =new StringBuffer("");
		int digits=0;
		while(temp1>0)
		{
			digits++;
			temp1/=10;
		}
		temp1 = number;
		int iter =0;
		while(iter<digits)
		{
			rem=temp1%10;
			rev=rev*10+rem;
			System.out.println("rev"+rev+"rev1"+rev1);
			if(rev==rev1)
			{
				f_zeros++;
			}
			else
				rev1=rev;
			System.out.println("f_zeros"+f_zeros);
			if(rev==0)
				count++;
			
			temp1/=10;
			iter++;
		}
		System.out.println(rev);
		int temp2=rev,rev2=0;
		while(temp2>0)
		{
			rem=temp2%10;
			rev2 = rev2*10+rem;
			temp2/=10;
		}
		if(count>0)
		{
			for(int x=0;x<count;x++)
				rev2=(rev2*10);
		}
		System.out.println(rev2);
		if(f_zeros>0)
		{
			for(int x=0;x<f_zeros;x++)
				sb.append('0');
		}
			sb=sb.append(rev2);
		System.out.println(sb);

		return sb.toString();
	}
}
