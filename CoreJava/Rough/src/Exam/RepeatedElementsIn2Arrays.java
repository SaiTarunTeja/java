package Exam;

import java.util.Arrays;

public class RepeatedElementsIn2Arrays {

	public static void main(String[] args) {
		int a[]=new int[]{1,4,9,3,2,56};
		int b[]=new int[]{6,2,4,5,56,29,1,1,1};
		System.out.println(Arrays.toString(a));
		for(int x=0;x<a.length;x++)
		{
			for(int y=0;y<b.length;y++)
			{
				if(a[x]==b[y])
				{
					System.out.print(a[x]+" ");
				}
			}
		}
	}

}
