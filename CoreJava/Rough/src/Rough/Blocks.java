package Rough;

public class Blocks {
	static
	{
		System.out.println("Static block 1");
	}
	{
		System.out.println("Instance block 1");
	}
	Blocks()
	{
		System.out.println("Default Constructor");
	}

	public static void main(String[] args) {
		Blocks b=new Blocks();
		System.out.println("Main method");
//		Blocks b=new Blocks();
	}
	{
		System.out.println("Instance block 2");
	}
	static
	{
		System.out.println("Static block 2");
	}

}
