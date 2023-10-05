package For_tarun;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		System.out.println("What factorial do you want");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int var=1;
		for(;n>0;n--)
		{
			var = var*n;
//			System.out.println(var);
		}
		System.out.println(var);

	}

}
