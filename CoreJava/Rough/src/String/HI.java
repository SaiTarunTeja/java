package String;

//public class HI extends aaa
//{
//
//	public static void main(String[] args) {
////		AA a=new AA();
//		HI a=new HI();
//		a.add();
//		
//
//	}
//
//}
interface x
{
	 default void add()
	 {
		System.out.println("hi bro"); 
	 }
//	public void sub();
}
//abstract class AA implements x
//{
//	public void add()
//	{
//		System.out.println("A add()");
//	}
//}
//class aaa extends AA
//{
//	public void sub()
//	{
//		
//	}
//}
interface y 
{
	public static void mul()
	{
		System.out.println("gfds");
	}
}

class HI implements x
{
	public static void main(String[] Args)
	{
//		y f1=new y();
		y.mul();
	}
}