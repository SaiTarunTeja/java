package BO1_Strings;

public class Immutable 
{
	public static void main(String[] args)
	{
		String s1=new String("Hello"); 
		System.out.println(s1+"==>"+s1.hashCode());
		s1=s1.concat("all");
		System.out.println(s1+"==>"+s1.hashCode());
		s1.toUpperCase();
		System.out.println(s1+"==>"+s1.hashCode());
		

	}

}
