package ArrayBasics;
import java.util.*;
public class FloatArray {

	public static void main(String[] args) {
		Random r = new Random();
		int length = r.nextInt(10);
		double a[]=new double[length];
		System.out.println("Array length is "+length);
		int x;
		for(x=0;x<a.length;x++)
		{
			a[x]=r.nextFloat();
		}
		System.out.println("our array is ");
		for(x=0;x<a.length;x++)
		{
			System.out.println(a[x]);
		}

	}

}
