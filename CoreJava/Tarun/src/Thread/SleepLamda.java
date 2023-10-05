package Thread;

public class SleepLamda
{

	public static void main(String[] args) {
		
		Runnable r = () ->
		{
			for(int x=0;x<15;x++)
			{
				System.out.println(Thread.currentThread().getName());
				try 
				{
					Thread.sleep(1000);
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}
		;
		
		Thread t = new Thread(r);
		t.start();
		
		for(int x=0;x<5;x++)
			System.out.println(Thread.currentThread().getName());
	}
}