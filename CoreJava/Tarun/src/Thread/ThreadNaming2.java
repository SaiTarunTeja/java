package Thread;

public class ThreadNaming2 {

	public static void main(String[] args) {
		demo_1 d1 = new demo_1("Tarun");
		Thread t1 = new Thread(d1);
		t1.start();
		
		
//		demo_1 d2 = new demo_1("Sai");
//		Thread t2 = new Thread(d2);
//		t2.setPriority(t2.MAX_PRIORITY);
//		t2.start();
//		
//		for(int x=0;x<10;x++)
//			System.out.println(Thread.currentThread().getName());
		
		System.out.println(t1);
		
	}
}
class demo_1 implements Runnable
{
	String name;
	public demo_1(String name)
	{
		this.name = name;
	}

	@Override
	public void run() 
	{
		for(int x=0;x<10;x++)
			System.out.println(name);
		
	}
	
}