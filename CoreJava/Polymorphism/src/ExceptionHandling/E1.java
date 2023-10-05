package ExceptionHandling;

public class E1 {

	public static void main(String[] args) throws InterruptedException {
		Demo  d=new Demo ();
		d.n1();
	}

}
class Demo 
{
	public static void n1() throws InterruptedException
	{
		Thread.sleep(10000);
		for(int x=0;x<5;x++)
		System.out.println("n1");
		
	}
}