package Reiteration;

public class OverrideStatic 
{
	public static void main(String[] args)
	{
		Parent1 p = new Child1(); //Upcasting
		p.m1();//Parent
		p.m2();//Child m2()
		
		Child1 ch = new Child1();//Child class object in Child class reference
		ch.m1();//Child
		ch.m2();//Child m2() 
	}
}
class Parent1
{
	public  static void m1()
	{
		System.out.println("Parent");
	}
	public void m2()
	{
		System.out.println("Parent m2()");
	}
}
class Child1 extends Parent1
{
	public  static void m1()
	{
		System.out.println("Child");
	}
	public void m2()
	{
		System.out.println("Child m2()");
	}
}