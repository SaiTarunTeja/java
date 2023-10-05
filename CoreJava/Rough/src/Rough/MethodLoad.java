package Rough;

public class MethodLoad {

	public static void main(String[] args) {
		MethodLoad.main();
		MethodLoad m1=new MethodLoad();		
		m1.main(10);
		main(2.3);
		m1.main("rakesh");
		

	}
	public static void main()
	{
		System.out.println("default");
	}
	public static void main(int a)
	{
		System.out.println("integer");
	}
	public static void main(double b)
	{
		System.out.println("double");
	}
	public static void main(char b)
	{
		System.out.println("char");
	}
	public static void main(String b)
	{
		System.out.println("String");
	}
}
