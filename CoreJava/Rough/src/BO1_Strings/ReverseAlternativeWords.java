package BO1_Strings;

public class ReverseAlternativeWords {

	public static void main(String[] args) {
		String s1=new String ("Hello All Good Morning");
		String s2[]=s1.split(" ");
		int x;
		for(x=0;x<s2.length;x=x+2)
		{			
			  String temp=s2[x];
			  s2[x]=s2[x+1];
			  s2[x+1]=temp;			
		}
		for(x=0;x<s2.length;x++)
		{
		  System.out.println(s2[x]);
		}
	}

}
