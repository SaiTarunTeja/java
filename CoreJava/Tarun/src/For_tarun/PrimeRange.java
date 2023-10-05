package For_tarun;
import java.util.*;
public class PrimeRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting Number");
		int s = sc.nextInt();
		System.out.println("Enter Ending Number");
		int e = sc.nextInt();
		int a,count;
		for(;s<=e;s++)
		{
		    count=0;
		    //for(a=1;a<=s;a++)
		    for(a=2;a<=s/2;a++)
		    {
		        if(s%a==0)
		        {
		            count++;
		        }
		    }
		   // if(count==2)
		   if( s!=1 && count==0)
		    {
		        System.out.println(s);
		    }
		}

	}

}
