package BO1_Strings;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1=new String("LISTEN");
		String s2=new String("SILENT");
		int count=0,x;
		if(s1.length()==s2.length())
		{
			char[]a=s1.toCharArray();
			char[]b=s2.toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);
			for(x=0;x<a.length;x++)
			{
				if(a[x]==b[x])
				{
					count++;
				}
			}
			if(count==s1.length())
			{
				System.out.println("Anagram");
			}
			else 
			{
				System.out.println("Not An Anagram");
			}
			/*//int s=Arrays.compare(a, b);
			//if(s==0)
			if(Arrays.equals(a,b))
			{
				System.out.println("Anagram");
			}
			else 
			{
				System.out.println("Not An Anagram");
			}*/
		}
		else
		{
			System.out.println("Not An Anagram");
		}

	}

}
