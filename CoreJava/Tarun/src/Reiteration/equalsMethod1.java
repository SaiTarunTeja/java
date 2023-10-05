package Reiteration;

import java.util.*;
public class equalsMethod1 {

	public static void main(String[] args) {
		String s = new String("Tarun");
		StringBuilder sb = new StringBuilder("Tarun");
		System.out.println(s.equals(sb));
//		System.out.println(s==sb);//Incompatible operand types String and StringBuilder
		String s1="you can not change me";
		String s2="you can not ";
		String s3=s2+"change me";
		System.out.println(s3==s1);
		System.out.println("----------");
		for(int x=0;x<5;x++)
	    {
			System.out.println(x);
			break;
//    		System.out.println(s1);
	    }
		System.out.println("Hello");
		System.out.println("----------");
		int[] num = {1,2,10,3,1,0};
		Set set = new LinkedHashSet();
		for(int temp:num)
		set.add(temp);
		if(num.length==set.size())
			System.out.println(false);
		else
			System.out.println(true);
		System.out.println("----------");
		int small = Integer.MAX_VALUE;
		for(int temp1:num)
		{
			if(temp1<small)
				small=temp1;
		}
			System.out.println(small);
			
		System.out.println("----------");

		equalsMethod1 em=null;
		System.out.println(em.toString());
	}

}
