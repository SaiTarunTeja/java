package CRough;

public class Poly {
       public static void main(String [] args)
       {
    	   A11 a1=new B();
    	   
    	   a1.Add();
       }
}
class A11
{
	int a=10,b=20;
	public void Add()
	{
		System.out.println(a+b);
	}
}
class B extends A11
{
	public void Add()
	{
		System.out.println(a-b);
	}
}