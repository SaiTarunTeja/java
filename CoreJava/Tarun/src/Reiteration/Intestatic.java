package Reiteration;

class Intestatic implements test
{
	
	public static void main(String[] args)
	{
		Intestatic i = new Intestatic();
		test.met();
		i.met1();
		
	}

}
interface test
{
	public static void  met()
	{
		System.out.println("static");
	}
	default void met1()
	{
		System.out.println("default");
	}
}
