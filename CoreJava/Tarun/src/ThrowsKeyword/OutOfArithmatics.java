package ThrowsKeyword;


public class OutOfArithmatics {

	public static void main(String[] args) {
		Arithmatic.m1();
		OutOf.m2();

	}

}
class Arithmatic
{
	static int a[]=new int[] {1,2,3,4};
	public static void m1() throws ArithmeticException
	{
		  System.out.println(a[0]/0);
	      System.out.println("Try Another");
	}
}
class OutOf extends Arithmatic
{
	//static int a[]=new int[] {1,2,3,4};
	public static void m2() throws ArrayIndexOutOfBoundsException
	{
		    System.out.println(a[5]);
			System.out.println("Array has "+a.length+" elements");
	}
}