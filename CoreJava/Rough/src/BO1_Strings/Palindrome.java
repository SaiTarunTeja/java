package BO1_Strings;

public class Palindrome {

	public static void main(String[] args) {
		String s1=new String("malayalam");
		String s2=new String("");
		int x;
		for(x=s1.length()-1;x>=0;x--)
		{
			s2=s2+s1.charAt(x);
		}
		if(s1.equals(s2))
		{
			System.out.println(s1+" is Palindrome");
		}
		else
		{
			System.out.println(s1+" is not Palindrome");
		}

	}

}
