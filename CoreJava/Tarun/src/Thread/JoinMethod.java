package Thread;

public class JoinMethod {

	public static void main(String[] args)
	{
		demo_4 d = new demo_4();
		Thread t = new Thread(d,"demo_4");
		t.start();
		for(int x=0;x<15;x++)
		{
			try 
			{
				t.join();
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		}		
	}
}
class demo_4 implements Runnable

{
	@Override
	public void run() 
	{
		for(int x=0;x<15;x++)
			System.out.println(Thread.currentThread().getName());
	}
}
