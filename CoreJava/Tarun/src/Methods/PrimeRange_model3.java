package Methods;

public class PrimeRange_model3 {

	public static void main(String[] args) {
		RPP r1=new RPP();
        r1.RP1(1,20);

	}

}
class RPP
{
    int s,e,count,a;
      public void RP1(int s,int e)
      {
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
		    this.s=s;
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