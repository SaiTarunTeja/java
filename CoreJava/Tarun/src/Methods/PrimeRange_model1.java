package Methods;
import java.util.*;
public class PrimeRange_model1 {

	public static void main(String[] args) {
		 RP r1=new RP();
         r1.RP1();

	}

}
class RP
{
    int s,e,count,a;
      public void RP1()
      {
    		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting Number");
		 s = sc.nextInt();
		System.out.println("Enter Ending Number");
		 e = sc.nextInt();
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
		    RP2();
		}
      }
      public void RP2()
      {
		   // if(count==2)
		   if( s!=1 && count==0)
		    {
		        System.out.println(s);
		    }
		}
}