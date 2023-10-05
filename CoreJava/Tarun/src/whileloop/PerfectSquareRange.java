package whileloop;

public class PerfectSquareRange {

	public static void main(String[] args) {
		int i=1;
		double result;
		while(i<=100)
		{
			result = Math.sqrt(i);
			if(result==(int)result)
				System.out.print(i+" ");
			i++;
		}
	}
}
