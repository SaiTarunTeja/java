package RandomArray;
import java.util.*;
public class IntegerArray {

	public static void main(String[] args) {
		Random r = new Random();
		int length=r.nextInt(10);
		int a[]=new int[length];
		System.out.println("length of the Array is "+ length);
		int x;
		for(x=0;x<a.length;x++)
		{
			a[x]=r.nextInt(10);
		}
		System.out.println("Your Array is");
		for(x=0;x<a.length;x++)
		{
			System.out.print(a[x]+" ");
		}

	}

}
