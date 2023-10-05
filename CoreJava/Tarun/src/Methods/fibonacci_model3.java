package Methods;

public class fibonacci_model3 {

	public static void main(String[] args) {
	    	 M10 m = new M10();
		     m.M11(0,1);

	}

}
class M10
{
    int a=0,b=1,c;
    public void M11(int a,int b)
        {
	       for(int i=0;i<=10;i++)
	        {
	            c=a+b;
	            System.out.println(a);
	            a=b;
	            b=c;
	        }
        }
}