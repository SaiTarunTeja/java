package Thread;

public class Thread_A2 {

	public static void main(String[] args) {
		m2 m = new m2();
		m.start();
		for(int x=0;x<5;x++)
			System.out.println("main");
	}

}
class m2 extends Thread
{
	public void run()
	{
		for(int x=0;x<5;x++)
			System.out.println("run");
	}
}