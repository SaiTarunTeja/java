package MethodOverRiding;

public class E3 {

	public static void main(String[] args)  {
		demo d=new demo();
		Thread t=new Thread(d);
//		System.out.println(t.isDaemon());
		t.start();
//		System.out.println(t.isAlive());
//		how can we know thread is dead
		
		t.yield();
		
    }
}
class demo extends Thread
{
	static boolean b=false;
	public void run()
	{
		m1();
	}
	
//	public void stop()
//		{
//			b=true;
//		}
	
	public static void m1()
	{
		try
		{
			System.out.println("try");
			System.out.println(10/0);
		}
		catch(ArithmeticException a)
		{
			System.out.println("catch");
			
			
		}
		finally
		{
			System.out.println("finally");
			//is finally block execute in all situations
			//is it possible to stop the execute of finally block 
		}
		
	}
}