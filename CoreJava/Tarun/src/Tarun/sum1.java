package Tarun;
import java.util.*;
public class sum1 {

	public static void main(String[] args) 
	{
		System.out.println("Enter n value");
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		double var=1;
		while(n>1)
		{
			//var=var+(1/n);
			//--n;
			var+=1/n; 
			--n;
		}
		System.out.println(var);
	}

}

