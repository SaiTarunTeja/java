package Thread;

public class yieldmethod {

	public static void main(String[] args) throws InterruptedException {
		
//		Thread.currentThread().setPriority(Thread.currentThread().MAX_PRIORITY);
		Demo_3 d = new Demo_3();
		Thread t = new Thread(d);
		t.setName("Demo_3");
		
		
		t.start();
		for(int x=0;x<15;x++)
		{
			
			Thread.yield();
			
			System.out.println(Thread.currentThread().getName());
		}
	}
}
class Demo_3 implements Runnable
{
	@Override
	public void run() 
	{
		
		for(int x=0;x<15;x++)
		{
			
			Thread.yield();
			System.out.println(Thread.currentThread().getName());
		}
	}
}