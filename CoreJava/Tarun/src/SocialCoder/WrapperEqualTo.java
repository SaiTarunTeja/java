package SocialCoder;

public class WrapperEqualTo 
{
	public static void main(String[] args) 
	{
		Integer a = 1000;
		Integer b = 1000;
		Integer c = 100;
		Integer d= 100;
		System.out.println(a==b);//false
		System.out.println(c==d);//true
		System.out.println(a.equals(b));//true
		System.out.println(c.equals(d));//true
	}

}
