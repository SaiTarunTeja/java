package Strings;

public class s1 {

	public static void main(String[] args) {
		//print a string
		String s=new String("Hello All Good Morning");
		int x;
		for(x=0;x<s.length();x++)
		{
			System.out.print(s.charAt(x)+" ");
		}
		System.out.println();
		// Reverse of String
		for(x=s.length()-1;x>=0;x--)
		{
			System.out.print(s.charAt(x)+" ");
		}

	}

}
