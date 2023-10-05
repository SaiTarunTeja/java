package Arrays;
import java.util.*;
public class ForEachLoop {

	public static void main(String[] args) {
		// find out the length of an array with out using length
		int a[]=new int[] {1,2,3,4,5};
		int count=0;
		for(int z:a)
		{
			count++;
		}
		System.out.println("count is "+count);
		for(int x=0;x<count;x++)
		{
			System.out.print(a[x]+" ");
		}

	}

}
