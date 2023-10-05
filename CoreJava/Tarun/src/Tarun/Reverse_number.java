package Tarun;
import java.util.*;
public class Reverse_number {

	public static void main(String[] args) 
	{
		System.out.println("ENTER ANY NUMBER");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = 0;
		int a =0;
		while(n>0)
		{
			r = n%10;
			a =a*10+r;
			n/=10;
		}
        System.out.println(a);
	}

}
