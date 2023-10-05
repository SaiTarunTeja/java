package BO1_Strings;

import java.util.Arrays;

public class StringAlphabet {

	public static void main(String[] args) {
		String s1=new String("The quick brown fox jumps over the lazy dog");
		s1=s1.toUpperCase();
		System.out.println(s1);
		int x,y,count,count2=0;
		char[] c=s1.toCharArray();
		Arrays.sort(c);
		boolean[] b=new boolean[c.length];
		for(x=0;x<c.length;x++)
		{
			if(b[x]==true)
			continue;
			count=0;
			for(y=x+1;y<c.length;y++)
			{
				if(c[x]==c[y] && c[x]!=' ')
				{
					count++;
					b[y]=true;
				}
			}
			if(count>=0)
			{
				if(c[x]!=' ')
				count2++;
				//System.out.println(c[x]);
			}
			
		}
		if(count2==26)
			System.out.println("true");
		else
			System.out.println("false");

	}

}
