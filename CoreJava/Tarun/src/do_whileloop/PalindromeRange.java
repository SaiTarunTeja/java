package do_whileloop;
import java.util.*;
public class PalindromeRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter Starting Number");
		int s = sc.nextInt();
		System.out.println("ENter Ending Number");
		int e = sc.nextInt();
		int a,r;
		do
		{
			int temp=s;
			 a=0;
			       do
			       {
			    	    r=temp%10;
			    	   a=a*10+r;
			    	   temp=temp/10;
			       }
			       while(temp>0);
			    	   if(s==a)
			    		   System.out.println(s);
	  s++;
			       
		}
		while(s<=e);
	}

}
