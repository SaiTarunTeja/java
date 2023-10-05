package For_tarun;
import java.util.*;
public class PrimeOrNot1 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		   System.out.println("Enter Any Number");
		   int n= sc.nextInt();
		   int count=0;
		   for(int a=1;a<=n;a++)
		 // for(int a=2;a<=n/2;a++)
		   {
		       if(n%a==0)
		       count++;
		       a++;
		   }
		   if(count==2)
		   //if(count==0)
		   {
		       System.out.println("prime");
		   }
		    else
		   {
		       System.out.println("Not prime");
		   }
	}
}


