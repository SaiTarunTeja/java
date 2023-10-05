package Methods;

public class PrimeOrNot_model3 {

	public static void main(String[] args) {
		prime31 p = new prime31() ;
		  p.p1(7);

	}

}
class prime31
{
    int a,count=0;
    public void p1(int n)
     {
	  for(a=1;a<=n;a++)
	   {
	       if(n%a==0)
	       count++;
	   }
	   p2();
     }  
      public void p2()
    {
	   if(count==2)
      {
	       System.out.println("prime");
	   }
	    else
	   {
	       System.out.println("Not prime");
	   }
    }  
}