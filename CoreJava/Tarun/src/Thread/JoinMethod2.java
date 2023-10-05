package Thread;

public class JoinMethod2 implements Runnable{

	static Thread t1;
	public static void main(String[] args) {
		 t1 = Thread.currentThread();
		 
		 JoinMethod2 j = new JoinMethod2();
		 Thread t2 = new Thread(j,"Tarun");
		 t2.start();
		 
		 for(int x=0;x<15;x++)
		 {
			/*try 
			{
				t2.join();
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			} //DeadLock    */ 
			System.out.println(Thread.currentThread().getName());
		 }
	}
	public void run()
	{
		try 
		{
			t1.join();
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		for(int x=0;x<15;x++)
			System.out.println(Thread.currentThread().getName());
	}
}
