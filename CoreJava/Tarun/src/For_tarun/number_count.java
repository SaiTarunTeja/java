package For_tarun;

import java.util.Scanner;

public class number_count {

	public static void main(String[] args) 
	{
		System.out.println("ENTER ANY NUMBER");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for(;n>0;n/=10)
		{
			count++;
		}
        System.out.println(count);
	}

}
