package String;

public class InstanceConstructor {

	public static void main(String[] args) {
		Test z=new Test();
		z.a=10;
		z.b=20;
		z.Test();	}

}
class Test
{
	int a,b,c=20,x;
	Test()
	{	
		 x=1;
		this.x=x;
		System.out.println(x); 
		System.out.println("in conStructor a is "+a);
		System.out.println("in conStructor b is "+b);
	}
	public void Test()
	{
		System.out.println("in method a is "+a);
		System.out.println("in method b is "+b);
		System.out.println(x);
	}
}