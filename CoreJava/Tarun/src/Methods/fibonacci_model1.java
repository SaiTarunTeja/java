package Methods;

public class fibonacci_model1 {

	public static void main(String[] args) {
		M01 m = new M01();
	    m.M11();

	}

}
class M01
{
	int a=0,b=1;
    public void M11()
        {
	       for(int i=0;i<=10;i++)
	        {
	       	System.out.println(a);
	       	int c=a+b; a=b; b=c;
	         } 
        }
}