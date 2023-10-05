package Exam;

public class Overriding_Fruit {

	public static void main(String[] args) {
		fruit f1=new Mango("Mango","Sour");
		f1.eat();
		fruit f2=new Mango("Banana","Sweet");
		f2.eat();
	}
}
class fruit
{
	String name,taste;
    void eat() 
    {
    	
	}	
}
class Mango extends fruit
{
	Mango(String name,String taste)
	{
		
		this.name=name;
		this.taste=taste;
	}
	void eat() 
    {
    	System.out.println(name+" "+taste);
	}	
}
class Banana extends fruit
{
	Banana(String name,String taste)
	{
		this.name=name;
		this.taste=taste;
	}
	void eat() 
    {
    	System.out.println(name+" "+taste);
	}	
}