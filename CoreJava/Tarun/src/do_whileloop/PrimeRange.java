package do_whileloop;
import java.util.*;
public class PrimeRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting Number");
		int s = sc.nextInt();
		System.out.println("Enter Ending Number");
		int e = sc.nextInt();
		int a,count;
	 do
	 {
	       count=0;
		    a=1;
		    do
		    {
		        if(s%a==0)
		        {
		            count++;
		        }
		        a++;
		    }
		    while(a<=s);
		    if(count==2)
		    {
		        System.out.println(s);
		    }
		
		s++;
	 }
	 while(s<=e);

	}

}
