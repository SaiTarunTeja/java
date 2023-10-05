package Exam;

public class Overriding_Fruit2 {

	public static void main(String[] args) {
	fruit1 f1=new Mango1();
	f1.eat();
	fruit1 f2=new Banana1();

	}

}
class fruit1
{
	String name="mango",taste="sour";
	public void eat()
	{
		System.out.println(name+" "+taste);
	}
}
class Mango1 extends fruit1
{
	
	public void eat()
	{
		System.out.println(name+" "+taste);
	}
}
class Banana1 extends fruit1
{
	public void eat()
	{
		System.out.println(name+" "+taste);
	}
}