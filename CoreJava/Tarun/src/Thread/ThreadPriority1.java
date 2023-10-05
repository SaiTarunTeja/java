package Thread;

public class ThreadPriority1 {

	public static void main(String[] args) {
		
		
		Demo_11 d = new Demo_11();
		Thread t = new Thread(d);
		System.out.println("Runnable interface Default Priority "+t.getPriority());
		System.out.println("main Thread Default Capacity "+Thread.currentThread().getPriority());
		
		t.setPriority(t.MAX_PRIORITY);
		System.out.println(t.getPriority());
		
	}
}
class Demo_11 implements Runnable
{
	public void run()
	{
		for(int x=0;x<5;x++)
			System.out.println("run");
	}
}