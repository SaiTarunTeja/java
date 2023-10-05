package whileloop;

public class EO_Series {

	public static void main(String[] args) {
		int n=3;
		System.out.print(n +" "); 
				while(n>1)
				{
				    if(n%2==0)
				    {
		                n=n/2;
				    }
				    else if(n%2!=0)
				    {
		                n=(3*n+1);
				    }
				    System.out.print(n +" "); 
				}
			}
		}