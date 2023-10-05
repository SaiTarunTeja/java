package String;

public class parent {

	public static void main(String[] args) {
		A a=new A(10);

	}

}
class A extends B
{
	A(int a)
	{
		System.out.println("A"+a);
	}
}
class B extends c
{
	B()
	{
		System.out.println("B");
	}
}
class c
{
	c()
	{
		System.out.println("hi bro");
	}
}