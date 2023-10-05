package Thread;

public class ThreadNaming1 implements Runnable{

	public static void main(String[] args) {
		ThreadNaming1 tn = new ThreadNaming1();
		Thread t = new Thread(tn);
		t.setName("Tarun");
		t.start();

		for(int x=0;x<10;x++)
			System.out.println(Thread.currentThread().getName());
	}

	@Override
	public void run() {
		for(int x=0;x<10;x++)
			System.out.println(Thread.currentThread().getName());
		
	}
}
