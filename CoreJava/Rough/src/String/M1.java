package String;

public class M1 {

	public static void main(String[] args) {
////		String s1=new String("hello");
//		char[] a1=new char[] {'h','e','l','l','o'};
//		String s2=new String(a1);
//		System.out.println(s2);
//		byte []a2=new byte[] {1,2,'3','c','m'};
//		String s3=new String(a2);
//		System.out.println(s3);//why this gives ASCII Symbols
		Hi1 h=new Hi1();
//		h.Hi1();
//		h.Hi1();
		String d =h.Hi1("Ravi");
		System.out.println(d);
//		Hi h1=new Hi();
//		System.out.println(h1.name);
//		System.out.println(h.name);
//		System.out.println(h.roll);
//		System.out.println(h.sec);
		

	}

}
class Hi1
{
	String name;int roll;char sec;
	Hi1()
	{
//		System.out.println("hi");
//		return x;
	}
	public String Hi1(String y)
	{
//		System.out.println("method");
		return y;
	}
}
