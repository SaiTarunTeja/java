package Rough;

import java.util.LinkedHashSet;

public class A2 {

	public static void main(String[] args) {
		LinkedHashSet l=new LinkedHashSet();
		int a[]=new int[] {5,16,13,4,8,13};
		int x;
		for(x=0;x<a.length;x++)
		{
			l.add(a[x]);
		}
		System.out.println(l);

	}
	public void LHS()
	{
		LinkedHashSet l=new LinkedHashSet();
		int a[]=new int[] {5,16,13,4,8,13};
		int x;
		for(x=0;x<a.length;x++)
		{
			l.add(a[x]);
		}
		System.out.println(l);
	}

}
