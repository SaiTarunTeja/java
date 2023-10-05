package BO1_Strings;

public class Split {

	public static void main(String[] args) {
		String s1=new String("Hello all good morning");
		String s2[]=s1.split(" ");
		for(int x=0;x<s2.length;x++)
		{
			System.out.println(s2[x]+" ");
		}

	}

}
