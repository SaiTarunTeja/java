package Rough;

public class S13 {

	public static void main(String[] args) {
		String Owner=new String("Rakesh");

		Owner=Owner.replace('k', 'm');
		System.out.println(Owner);
		
//		System.out.println("StringBuilder");
//		hello h=new hello();
//		h.m1();
		
		

	}

}
class hello
{
	public void m1()
	{
		StringBuilder b1=new StringBuilder("");
		System.out.println(b1.hashCode());
		b1.append("Suresh");
		System.out.println(b1);
		System.out.println(b1.hashCode());
	}
}