package Strings;

public class DotEquals {

	public static void main(String[] args) {
		String s1=new String("Hello");
		String s2=new String("Hello");
		if(s1.equals(s2))
		{
			System.out.print("Equal");
		}
		else
		{
			System.out.print("not Equal");
		}
		System.out.println("--------------------------");
		String s3=new String("HELLO");
		String s4=new String("hello");
		if(s3.equalsIgnoreCase(s4))
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.print("not Equal");
		}
		System.out.println("--------------------------");
		String s5=new String("hello all good morning");
		String s6=new String("hello all good morning");
		if(s5.equals(s6))
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("not Equal");
		}
		System.out.println("--------------------------");
		String s7=new String("HELLO ALL GOOD MORNING");
		String s8=new String("hello all good morning");
		if(s7.equalsIgnoreCase(s8))
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("not Equal");
		}

	}

}
