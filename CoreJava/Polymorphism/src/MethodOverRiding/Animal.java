package MethodOverRiding;

public class Animal 
{
//achieving polymorphism with single inheritance	
	public void eat()
	{
		System.out.println("Animal Eat");
	}
	public static void main(String[] args) 
	{
		Animal a1=new Dog();//upcasting
		a1.eat();
	}
}

class Dog extends Animal
{
	public void eat()
	{
		System.out.println("Dog Eat");
	}
}
