package Rakesh;

public class overRidef {

	public static void main(String[] args) {
//		fruit f1=new Mango();
//		f1.eat();
//		fruit f2=new Banana();
//		f2.eat();
		Mango m=new Mango();
		m.eat();
		Banana b=new Banana();
		
		}
	}
	interface fruit
	{
//		String name,taste;
		public void eat();
//		{
//			System.out.println(name+" "+taste);
//		}
	}
	class Mango implements fruit
	{
		
		public void eat()
		{
			System.out.println("Mango"+" "+"Sour");
		}
	}
	class Banana implements fruit
	{
		public void eat()
		{
			System.out.println("Banana"+" "+"Sweet");
		}
	}
