package ThreadPractice;

public class UsingThreadClass 
{

	public static void main(String[] args) 
	{
		Test1 t=new Test1();
		Thread tx=new Thread(t);
		tx.start();
		for(int x=0;x<5;x++)
		System.out.println("Main");

	}

}
class Test1 extends Thread
{
	public void run()
	{
		for(int x=0;x<5;x++)
		{
			System.out.println("Test1");
		}
	}
}