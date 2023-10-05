package TryCatchBlock;

public class OutOfArithmatics {

	public static void main(String[] args) {
		
		Arithmatic.m1();
		OutOf.m2();

	}

}
class Arithmatic
{
	static int a[]=new int[] {1,2,3,4};
	public static void m1()
	{
		try
		{
		  System.out.println(a[0]/0);
		}
		catch(ArithmeticException AE)
		{
			System.out.println("Try Another");
		}
	}
}
class OutOf extends Arithmatic
{
	//static int a[]=new int[] {1,2,3,4};
	public static void m2()
	{
		try
		{
		    System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException AE)
		{
			System.out.println("Array has "+a.length+" elements");
		}
	}
}