package inheritance;

public class constructorInherit {

	public static void main(String[] args) {
		B b=new B();

	}

}
class A
{
	A()
	{
		System.out.println("A Constructor");
	}
}
class B extends A
{
	B()
	{
		System.out.println("B Constructor");
	}
	B(int x)
	{
		System.out.println("p");
	}
}