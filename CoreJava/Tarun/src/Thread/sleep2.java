package Thread;

public class sleep2 implements Runnable{

	public static void main(String[] args) 
	{
		sleep s = new sleep();
		Thread t = new Thread(s);
		t.start();
		for(int x=0;x<10;x++)
			System.out.println(Thread.currentThread().getName());
	}
	public void run()
	{
		try 
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		for(int x=0;x<10;x++)
			System.out.println(Thread.currentThread().getName());
	}
}
