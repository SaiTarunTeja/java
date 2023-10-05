package Rough;

public class YEAR extends C {

	static public void main(String[] args) {
		C b1=new C();
		b1.display();

	}

}
class A
{
	int a,b,d,e;
	A()
	{
		 a=10;b=20;
		 d=23;e=56;
	}
}
class B1 extends A
{
	int a,b;
	B1()
	{
		 a=100;b=200;		
	}
//	public void display()
//	{
//		System.out.println(super.a+" "+super.b);
//	}
}
class C extends B1
{
	int a,b;
	C()
	{
		super();
		 a=1000;b=2000;
		
	}
	public void display()
	{
		System.out.println(a+" "+b);
		System.out.println(d+" "+e);
		
//		System.out.println(super.a+" "+super.b);
//		super.display();//super should be first line in 
//		constructor only,in method it is used in anywhere
		//how can i print grand parent class variables
		//i.e..a=10 b=20
	}
}