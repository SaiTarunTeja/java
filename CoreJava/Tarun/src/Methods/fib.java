package Methods;
import java.util.*;
public class fib
{

	public static void main(String[] args)
	{
		M1 m = new M1();
		   m.M11();
		   // System.out.println(s);
		   
		}
	}
	class M1
	{
	    int a,b,c;
	    public void M11()
	        {
	             Scanner sc = new Scanner(System.in);
	             System.out.println("Enter a value");
	              a=sc.nextInt();
	             System.out.println("Enter b value");
	              b=sc.nextInt();
	              M12(); 
	        }
	    public int M12()
	    {
		       for(int i=0;i<=10;i++)
		        {
		            c=a+b;
		            System.out.println(a);
		            a=b;
		            b=c;
		            //return a;
		        }
		       return a;

	}

}
