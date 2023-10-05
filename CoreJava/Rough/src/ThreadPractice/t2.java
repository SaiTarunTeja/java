package ThreadPractice;

public class t2 {

	public static void main(String[] args) {
		test t=new test();
//		Thread t1=new Thread();
		t.start();

	}

}
class test extends Thread
{
	public void run()
	{
		for(int x=0;x<5;x++)
		System.out.println("run");
	}
}