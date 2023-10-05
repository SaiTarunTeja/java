package String;

public class Palindrome {

	public static void main(String[] args) {
		String s1=new String("malayalam");
		String s2=new String("");
		System.out.println("s1 "+s1);
		for(int x=s1.length()-1;x>=0;x--)
		{
			s2=s2+s1.charAt(x);
		}
		System.out.println("s2 "+s2);
		if(s1.equals(s2))
		{
			System.out.println("It Is Palindrome");
		}
		else
		{
			System.out.println("It Is Not A Palindrome");
		}

	}

}
