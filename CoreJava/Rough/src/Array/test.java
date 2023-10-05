package Array;

public class test {

	public static void main(String[] args) {
		test1 t=new test1();
		t.m1();
        m12();
        test1.m21();
	}
	public static void m12()
	{
		System.out.println("m12");
	}

}
class test1
{
	int a,b,c;
	test1()
	{
	   
	}
	public void m1()
	{
		  m2();
		 System.out.println(c);
	}
	public void m2()
	{
		   a=10;
		   b=20;
		   c=a+b;
	}
	public static void m21()
	{
		System.out.println("m21");
	}
}