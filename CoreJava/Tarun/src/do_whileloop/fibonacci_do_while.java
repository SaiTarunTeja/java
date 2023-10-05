package do_whileloop;

public class fibonacci_do_while {

	public static void main(String[] args) {
		int a=0;
	    int b=1,i=1;
	    do
	    {
	        	System.out.println(a);
	        	int c=a+b;
	        	a=b;
	        	b=c; 
	        	i++;
	    }
	    while(i<=10);

	}

}
