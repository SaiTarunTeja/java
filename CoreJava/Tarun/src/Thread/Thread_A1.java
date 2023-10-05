package Thread;

public class Thread_A1 
{
	public static void main(String[] args) {
		Mahesh m=new Mahesh();
		Thread t=new Thread(m);
		t.start();
		for(int x=0;x<5;x++)
		{
			System.out.println("main");
		}
	}
}
class Mahesh extends Thread
{
	public void run()
	{
		m1();
	}
	public void m1()
	{
		for(int x=0;x<5;x++)
		{
			System.out.println("Mahesh");
		}
	}
}