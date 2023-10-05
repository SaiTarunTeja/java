package whileloop;
import java.util.*;
public class PrimeRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting Number");
		int s = sc.nextInt();
		System.out.println("Enter Ending Number");
		int e = sc.nextInt();
		int a,count;
		while(s<=e)
		{
		    count=0;
		   // a=1;
		    a=2;
		    //while(a<=s)
		    while(a<=s/2)
		    {
		        if(s%a==0)
		        {
		            count++;
		        }
		        a++;
		    }
		  //  if(count==2)
		 if(s!=1 && count==0)
		   //if( s!=1 && count==0)
		    {
		        System.out.println(s);
		    }
		    s++;
		}

	}

}
