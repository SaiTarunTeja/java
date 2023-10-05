package whileloop;

public class GCD {
	static int num1 = 12 , num2 = 14,gcd = 0,i=2;
	public static void main(String[] args) {
		
		while(i<=num1 && i<=num2)
		{
			if(num1%i==0 && num2%i==0)
			{
					gcd = i;
					break;
			}
		}
		System.out.println(gcd);

	}
	public static void backwardItteration()
	{
		
	}

}
