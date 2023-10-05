package Exam;

public class DivisorsOf6 {

	public static void main(String[] args) {
		System.out.println("Divisors of 6 are ");
		for(int x=1;x<=6;x++)
		{
			if(6%x==0)
				System.out.print(x+",");
		}
	}

}
