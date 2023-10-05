package Reiteration;

public class MultipleInheritance extends Testingimpl {

	public static void main(String[] args) 
	{
		MultipleInheritance m = new MultipleInheritance();
				m.add();
//				Testing.add();
	}
	
}
class Testing
{
	public static void add()
	{
		System.out.println("Tesing Interface add method");
	}
}
class Testing1 extends Testing
{
	public static void add()	{
		System.out.println("Tesing1 Interface add method");
	}
}
class Testingimpl extends Testing1
{
	public static void add()	
	{
		System.out.println("Testingimpl class add method");
	}
}