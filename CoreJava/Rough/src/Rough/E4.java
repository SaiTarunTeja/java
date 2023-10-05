package Rough;

public class E4 {

	public static void main(String[] args) {
		int a[]=new int[4];
		try
		{
			System.out.println(a[5]);
		}
//		finally
//		{
//			System.out.println("Finally");
//		}
		catch(ArrayIndexOutOfBoundsException AE)
		{
			System.out.println("Hello");
			AE.printStackTrace();
		}

	}

}
