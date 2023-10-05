package Methods;
import java.util.*;
public class PrimeOrNot_model2 {

	public static void main(String[] args) {
		prime p = new prime() ;
		  p.p1();

	}

}
class prime_
{
    int a,count=0;
    public void p1()
     {
       Scanner sc = new Scanner(System.in);
	   System.out.println("Enter Any Number");
	   int n= sc.nextInt();
	  for(a=1;a<=n;a++)
	   {
	       if(n%a==0)
	       count++;
	   }
	   System.out.println(p2());
     }  
      public String p2()
    {
	   if(count==2)
      {
	       return "Pr";
	   }
	    else
	   {
	      return "np";
	   }
    }  
}