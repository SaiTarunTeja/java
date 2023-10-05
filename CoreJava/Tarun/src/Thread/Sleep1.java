package Thread;

public class Sleep1 {

	public static void main(String[] args) {
		sleep s = new sleep();
		Thread t = new Thread(s);
		t.start();
		for(int x=0;x<10;x++)
			System.out.println(Thread.currentThread().getName());
	}
}
class sleep implements Runnable
{
	@Override
	public void run() 
	{
		for(int x=0;x<10;x++)
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