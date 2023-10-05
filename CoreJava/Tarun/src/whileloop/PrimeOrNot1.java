package whileloop;
import java.util.*;
public class PrimeOrNot1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		   System.out.println("Enter Any Number");
		   int n= sc.nextInt();
		   int count=0;
		   int a=1;
		  // int a=2;
		  
    	 while(a<=n)
	    // while(a<=n/2)
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


