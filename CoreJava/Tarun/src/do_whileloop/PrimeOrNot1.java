package do_whileloop;
import java.util.*;
public class PrimeOrNot1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		   System.out.println("Enter Any Number");
		   int n= sc.nextInt();
		   int count=0,a=1;
		 do
		 {
		   {
		       if(n%a==0)
		       {
		       count++;
		       }
		   }
		  ++a;
		}
		while(a<=n);
		if(count==2)
		{
		    System.out.println("prime");
		}
		else
		{
		    System.out.println("not prime");
		}

	}

}
