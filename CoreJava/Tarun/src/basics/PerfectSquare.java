package basics;
import java.util.*;
public class PerfectSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		double result = Math.sqrt(num);
		if(result==(int)result)
			System.out.println(num+" is Perfect Square");
		else
			System.out.println(num+" is Not Perfect Square");
	}

}
