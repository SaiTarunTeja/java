package Thread;

public class Thread_A3 {

	public static void main(String[] args) {
		m1 m = new m1();
		Thread t=new Thread(m);
		t.start();
		for(int x=0;x<5;x++)
			System.out.println("main");

	}

}
class m1 implements Runnable
{
	public void run()
	{
		for(int x=0;x<5;x++)
			System.out.println("run");
	}
}