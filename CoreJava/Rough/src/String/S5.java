package String;

import java.util.Arrays;

public class S5 {

	public static void main(String[] args) {
		String s1=new String("sai arun");
		String s2[]=s1.split(" ");
		int x;
		Arrays.sort(s2);
		for(x=0;x<s2.length;x++)
		{
			System.out.println(s2[x]+" ");
		}
		
		
		

	}

}

