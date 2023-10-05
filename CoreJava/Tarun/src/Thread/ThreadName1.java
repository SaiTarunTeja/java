package Thread;

public class ThreadName1 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Main m = new Main();
		System.out.println(m.getName());
		Thread.currentThread().setName("Tarun");
		System.out.println(Thread.currentThread().getName());
		
		Demo d = new Demo();
		Thread t = new Thread(d);
		t.start();
		System.out.println(t.getName());
		t.setName("Runnable Thread");
		System.out.println(t.getName());
		
		
	}

}
class Main extends Thread
{
	
}
class Demo implements Runnable
{
	@Override
	public void run() {
		
		
	}
}