package Rough;
import java.util.*;
public class A1 extends B {

	public static void main(String[] args)
	{
		 int a=1,b=2,c=3;
			System.out.println(a>b & a++<c);
			System.out.println(a++);
			String s = "Sai";
			System.out.println(s.substring(0,1));
			A1 a1 = new A1();
			a1.add();
			B b1 = new A1();
			b1.add();
	}
	public  void add()
	{
		System.out.println("child");
	}
	public static void div()
	{
		
	}
}
class B
{
	public  void add()
	{
		System.out.println("parent");
	}
	public static void sub()
	{
		
	}
}
