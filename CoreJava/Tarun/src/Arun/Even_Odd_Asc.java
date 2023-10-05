package Arun;
import java.util.*;
public class Even_Odd_Asc {

	public static void main(String[] args) {
		int[] arr = new int[] {3,4,2,1,5,6};
		/**
		 * int[] arr = new int[] {3,4,2,1,5,6};
		 * find smallest number i.e smallest =1
		 * chech smallest number is even or odd , in this case small is odd
		 * check smallest is in Zeroth index or not , if not swap to zeroth index
		 * after swaping {1,4,2,3,5,6}
		 * now select one element like select oth index element , check next element is odd or not
		 * if 1 index is consists of odd leave it else go to next 
		 * if 2 index is consists of odd element  swap 2 and 1 indexes 
		 */
		findSnnalest(arr);
		
	}
	public static void findSnnalest(int[] arr)
	{
		int small=Integer.MAX_VALUE;
		int even=0,odd=0,index=0;
		for(int x=0;x<arr.length;x++)
		{
			if(arr[x]<small)
			{
				small=arr[x];
				index=x;
			}
		}
		System.out.println("Smallest number = "+small+" Index= "+index);
		
		System.out.println("Total Even numbers "+even);
//		System.out.println("Total Odd numbers "+odd);
//		if(small!=arr[0])
//		{
//			int temp=arr[0];
//			arr[0]=small;
//			
//		}
	}
}