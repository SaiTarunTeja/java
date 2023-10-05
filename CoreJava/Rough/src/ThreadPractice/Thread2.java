package ThreadPractice;

public class Thread2 
{
	public static void main(String[] args) 
	{
		test3 t=new test3();
		t.start();	t.getClass();	
		for(int x=0;x<5;x++)
		{
			System.out.println("main");
		}
	}
}
class test3 extends Thread 
{
	public void run()
	{
		for(int x=0;x<5;x++)
		{
			System.out.println("test 3");
		}
	}
}