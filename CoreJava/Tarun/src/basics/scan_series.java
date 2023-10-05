package basics;
import java.util.*;
public class scan_series {

	public static void main(String[] args) 
	{
		System.out.println("ENTER ANY NUMBER");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=n,b=1,c=0;
		while(c<n)
		{
			if(a>n/2)
			{
				System.out.println(a);
				--a;
			}
			else
			{
				System.out.println(b);
				++b;
			}
			++c;
		}
		

	}

}
