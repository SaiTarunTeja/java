package For_tarun;
import java.util.Scanner;
public class AlternativePrimes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Starting Number");
		int start=sc.nextInt();
		System.out.println("Enter Ending Number");
		int end=sc.nextInt();
		int x,count=0,c=0,var=1;
		for(;start<=end;start++)
		{	
			count=0;
			for(x=1;x<=start;x++)
			{
				if(start%x==0)
				{
					count++;
				}
				
				
			}
			if(count==2)
			{
				if(var%2!=0) 
				{
				System.out.println(start);
				var++;}
				else
				var++;
			}
			
		}
		//System.out.println(var);
		//System.out.println(start);

	}

}
