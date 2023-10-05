package MethodOverRiding;

public class BabyDog extends Dog {
//Achieving Runtime Polymorphism with Multilevel Inheritance
	public static void main(String[] args) {
		Animal_1 a=new Animal_1();
		Animal_1 b=new Dog1();
		a.eat();
		b.eat();

	}

}
class Animal_1
{
	public  void eat()
	{
		System.out.println("Animal Eating");
	}
}
class Dog1 extends Animal_1
{
	public  void eat()
	{
		System.out.println("Dog Eating");
	}
}