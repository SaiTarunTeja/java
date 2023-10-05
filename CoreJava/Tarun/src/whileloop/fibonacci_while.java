package whileloop;

public class fibonacci_while {

	public static void main(String[] args) {
		int a=0,b=1,i=0;
		while(i<=10)
		{
		    int c=a+b;
		    System.out.println(a);
		    a=b;
		    b=c;
		    i++;
		}

	}

}
