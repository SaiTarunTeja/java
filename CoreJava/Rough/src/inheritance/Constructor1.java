package inheritance;

public class Constructor1 {

	public static void main(String[] args) {
		X b1=new X();
		b1.a="veera";
		b1.X1();
		
		X b2=new X();
//		b2.a="veera";
//		b2.X1();

	}

}
class X
{
	String a;
	X()
	{
	    a="Revi";
	    System.out.println(a);
	}
	public void X1()
	{
		System.out.println(a);
	}
}