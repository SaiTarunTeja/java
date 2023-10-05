package RandomArray;
import java.util.*;
public class DoubleArray {

	public static void main(String[] args) {
		Random r =new Random();				
		int length=r.nextInt(10);
		double a[]=new double[length];
		System.out.println("Array length is "+ length);
		int x;
		for(x=0;x<a.length;x++)
		{
			a[x]=r.nextDouble(10);
		}
		System.out.println("Our Array is ");
		for(x=0;x<a.length;x++)
		{
			System.out.println(a[x]);
		}
		

	}

}
