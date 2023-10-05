package Tarun;
import java.util.*;
public class Multiplication_table {

	public static void main(String[] args) 
	{
		int a=1,b=20;
		System.out.println("what table do you want ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while(a<=b)
		{
			System.out.println(n +"x"+ a +"="+ n*a);
			a++;
		}
		

	}

}
