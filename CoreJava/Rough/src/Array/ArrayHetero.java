package Array;

import java.util.Arrays;

public class ArrayHetero {

	public static void main(String[] args) {
		int[] a=new int[4]; 
		a[0]=10;
		a[1]='a';
		byte b=56;
		a[2]=b;
		short s=5;
		a[3]=s;
		for(int x=0;x<a.length;x++)
		{
			System.out.println(a[x]);
		}
//		System.out.println(Arrays.toString(a));
	}

}
