package ThrowsKeyword;

public class ArrayIndexOutOfBounds {

	public static void main(String[] args)throws ArrayIndexOutOfBoundsException 
	{
		int a[]=new int[4];
		
		System.out.println(a[5]);
		System.out.println("Array has "+a.length+" elements");
	}
	

}