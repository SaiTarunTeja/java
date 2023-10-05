package Arrays;
import java.util.*;
public class RandomClass {

	public static void main(String[] args) {
		Random r = new Random();
		  int size = r.nextInt(10);
		  int a[] = new int[size];
		  System.out.println("Size is "+size);
		  int x;
		  for(x=0;x<a.length;x++)
		    {
		      a[x]=r.nextInt(10);
		    }
		  for(x=0;x<a.length;x++)
			{
			  System.out.print(a[x]+" ");
			}

	}

}
