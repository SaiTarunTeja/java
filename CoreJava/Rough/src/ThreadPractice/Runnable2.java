package ThreadPractice;

public class Runnable2 {

	public static void main(String[] args) {
		test4 t=new test4();
		Thread t1=new Thread(t);
		t1.start();
		for(int x=0;x<5;x++)
		{
			System.out.println("main");
		}
	}

}
class test4 implements Runnable
{
	public void run()
	{
		for(int x=0;x<5;x++)
		{
			System.out.println("test4");
		}
	}
}