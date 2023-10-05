package Thread;

public class ThreadPriority2 {

	public static void main(String[] args) {
		
		Demo_2 d = new Demo_2();
		Thread t = new Thread(d);
		t.setName("Demo_2");
		t.setPriority(t.MAX_PRIORITY);
		t.start();
		
		System.out.println(Thread.currentThread().getName()+"==>"+Thread.currentThread().getPriority());
		System.out.println(t.getName()+"==>"+t.getPriority());
		for(int x=0;x<5;x++)
			System.out.println(Thread.currentThread().getName());

	}
}
class Demo_2 implements Runnable
{
	@Override
	public void run()
	{
		for(int x=0;x<5;x++)
			System.out.println(Thread.currentThread().getName());
	}
	
}