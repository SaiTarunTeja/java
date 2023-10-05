package For_tarun;

import java.util.Scanner;

public class Extraction {

	public static void main(String[] args)
	{
		System.out.println("ENTER ANY NUMBER");
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		int r;
		for(;n>0;n/=10)
		{
			r = n%10;
			System.out.println(r);
		}

	}

}
