package Reiteration;

public class MultipleInheritance1 {

	public static void main(String[] args) {
		parent c = new child();
		c.call();
		c.call1();
//		c.call3();
		child c1 = new child();
		c1.call();
		c1.call1();
		c1.call3();
	}

}
class parent
{

	public  void call()
	{
		
		System.out.println("Parent");
	}
	public  void call1()
	{
		System.out.println("Parent1");
	}
}
class child extends parent
{

	public  void call()
	{
		System.out.println("child");
	}
	public void call3()
	{
		System.out.println("call3");
	}
}