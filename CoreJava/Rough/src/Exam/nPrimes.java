package Exam;
import java.util.*;
public class nPrimes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting Number");
		int start=sc.nextInt();
		System.out.println("Enter Ending Number");
		int end=sc.nextInt();
		int count=0;
		for(int i=0;i<3;i++)
		{
			for(int k=2;k>i;k--)
			{
				System.out.print("  ");
			}
			for(int j=0;j<=i;j++)
			{
				for(;start<=end;start++)
				{
					count=0;
					for(int x=1;x<=start;x++)
					{
						if(start%x==0)
							count++;
					}
					if(count==2)
					{
						System.out.print(start+" ");
						start++;
						break;
					}
				}
			}
			System.out.println();
		}
		System.out.println("Enter number");
		int e=sc.nextInt();
		for(int i=0;i<2;i++)
		{
			for(int k=0;k<i;k++)
			{
				System.out.println("  ");
			}
			for(int j=0;j<=i;j++)
			{
				for(;end<e;end++)
				{
					count=0;
					for(int x=1;x<=e;x++)
					{
						if(end%x==0)
							count++;
					}
					if(count==2)
					{
						System.out.print("*"+" ");
						end++;
						break;
					}
				}
			}
		}
	}

}
