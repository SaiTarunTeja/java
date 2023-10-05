package CRough;

public class ObjectClassObject {

	public static void main(String[] args) {
		Object x[]=new Object[] {2,2.2,"Hello",false};
		System.out.println(x.length);
		for(Object ZZ:x)
			System.out.print(ZZ+" ");
		System.out.println();
		
		Object x1[]=new Object[2];
		x1[0]=7;x[1]="hiii";x[2]='j';//we are not having add method for Object class
		System.out.println(x1);
		
		/*A a1=new A();//here A is class Name,a1 is reference ,new is key word A() is constructor
		A a2=new A();//where is the object (in polymorphism parent class reference pointing the child class object
		Object m[]=new Object[] {A()};
		for(Object ZZ:m)
			System.out.print(ZZ+" ");*/
		
//		A a1[]=new A[] {2,2.2,"Hello"};
	}

	

}
class A
{
	
}