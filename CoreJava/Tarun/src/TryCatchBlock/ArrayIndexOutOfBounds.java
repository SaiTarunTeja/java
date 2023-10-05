package TryCatchBlock;

public class ArrayIndexOutOfBounds {

	public static void main(String[] args) {
		int a[]=new int[4];
		try
		{
		System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException AI)
		{
		  System.out.println("array has only "+a.length+" elemrnts");
		}

	}

}
