package Constructor;

public class MethodAndConstructor {

	public static void main(String[] args) {
		A a1=new A();//if object created once,then constructor calls only once
		a1.A();//but method calles n number of times
		a1.A();
		a1.A1();
//		B b1=new B();
//		b1.x="Hari";
//		b1.add();
//		B b2=new B();
		
//		b2.add();
//		A.A();

	}

}
class A
{
     A()
	{
		System.out.println("Iam ConStructor A");
	}
	public static void A()
	{
		System.out.println("Iam Method A");
	}
	public void A1()
	{
		System.out.println("Iam Method A1");
	}
}
class B
{
	int a;String x;
	B()
	{
		x="ravi";
		System.out.println(x);
		
	}
	public void add()
	{
		System.out.println(x);
	}
}
