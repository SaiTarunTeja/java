package Rough;

public class MethodLoad1 {

	public static void main(String[] args) {
		System.out.println(Adder.add(11,11));
	}
	class Adder
	{  
		static int add(int a)
		{
			return a;
		}  
		static double add(int a,int b)
		{ 
			return b+a;
		}  
	}  
}
