package For_tarun;

import java.util.*;
public class Aptroid_Palindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of primes you want");
		int n= sc.nextInt();
		int start = 1,count=1,count1;
		while(true)
		{
			if(count>n)
				break;
			else
			{
				count1=0;
				for(int x=1;x<=start;x++)
				{
					if(start%x==0)
					{
						count1++;
					}					
				}
				if(count1==2)
				{
					System.out.print(start+" ");
					count++;
				}
				start++;				
			}
		}

	}

}
