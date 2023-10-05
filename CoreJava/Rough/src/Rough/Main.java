package Rough;

public class Main {

	public static void main(String[] args) {
		Demo d=new Demo();
		d.m1();

	}

}
class Demo
{
	void m1()
	{
	    int a=1;
	    if(a<=10)
	    {
		  System.out.println(a);
		  a++;
	    }
	}
}