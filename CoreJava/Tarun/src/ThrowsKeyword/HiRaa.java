package ThrowsKeyword;

public class HiRaa {

	public static void main(String[] args) throws InterruptedException 
	{
		m1();

	}
	public static void m1() throws InterruptedException
	{
		m2();
	}
	public static void m2() throws InterruptedException
	{
		for(int x=0;x<10;x++)
		{
//			Thread.sleep(1000);
			System.out.println("Coding hub.org.in");
			Thread.sleep(1000);
		}
	}

}
