package Rough;

public class Inter implements x {

	public static void main(String[] args) {
		x.m1();
		Inter i=new Inter();
		i.m2();
		i.m3();

	}

	@Override
	public void m3() {
		System.out.println("m3");
		
	}

}
interface x
{
	static void m1()
	{
		System.out.println("Static Interface");
	}
	default void m2()
	{
		System.out.println("default interface");
	}
	public void m3();
}