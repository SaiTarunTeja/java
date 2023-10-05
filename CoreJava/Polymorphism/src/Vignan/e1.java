package Vignan;

public class e1 {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		int[] a=new int[4];
		try
		{
			System.out.println(a[5]);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
//		catch(ArrayIndexOutOfBoundsException ai) //ArrayIndexOutOfBoundsException is already handled
//		{
//			System.out.println(ai);
//		}
	}

}
