package Thread;

public class sleepJoin implements Runnable
{
	static Thread t;
	public static void main(String[] args) 
	{
		t = Thread.currentThread();
		
		sleepJoin sj = new sleepJoin();
		Thread t1 = new Thread(sj);
		t1.start();
		try 
		{
			t1.join();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		for(int x=0;x<5;x++)
			System.out.println(Thread.currentThread().getName());
	}
	public void run()
	{
		for(int x=0;x<5;x++)
		{
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		}
	}
}
