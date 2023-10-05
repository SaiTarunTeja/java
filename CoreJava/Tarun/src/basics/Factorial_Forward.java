package basics;
import java.util.*;
public class Factorial_Forward {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "Tsrn";
		int a= 10,b=15;
//		s=a+b;
//		System.out.println(s);
//		int[] h1 = new int[5];
//		int[] h2 = new int[5];
//		int[] h3 = h1;
//		System.out.println(h1+" "+(h2));
//		System.out.println(h1==h3);
//		System.out.println(h1.equals(h3));
		
		if(++a <10 || ++b>15)
		{
			System.out.println("Hello");
			a++;
		}
		else
		{
			b++;
		}
		System.out.println(a+" "+b);
	}

}
