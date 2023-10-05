package Thread;

public class MultiDemo {

	public static void main(String[] args) {
		/*Demo1 d1 = new Demo1();
		Thread t1 = new Thread(d1);
		t1.start();//*/
		
		/*Demo2 d2 = new Demo2();
		Thread t2=new Thread(d2);
		t2.start();
		Demo2 d21 = new Demo2();
		Thread t3 = new Thread(d21);
		t3.start();//*/
		
		/*Demo22 d221 = new Demo22("Thread1");
		Thread t4=new Thread(d221);
		t4.start();
		Demo22 d222 = new Demo22("Thread2");
		Thread t5 = new Thread(d222);
		t5.start();//*/
		
		/*Demo3 d3=new Demo3();
		Thread t6 = new Thread(d3);
		t6.start();
		Demo4 d4 = new Demo4();
		Thread t7 = new Thread(d4);
		t7.start();//*/
				

	}

}
//Performing single task from single thread
class Demo1 implements Runnable
{
	public void run()
	{
		System.out.println("task 1");
	}
}
//Performing single task from multiple threads
class Demo2 implements Runnable
{
	public void run()
	{
		System.out.println("Task");
	}
}
//Performing single task from multiple threads
class Demo22 implements Runnable
{
	String name;
	Demo22(String name)
	{
		this.name=name;
		
	}
	public void run()
	{
		for(int x=0;x<5;x++)
			System.out.println(name+":"+x);
	}
}
//Performing multiple tasks from multiple threads
class Demo3 implements Runnable
{
	public void run()
	{
		System.out.println("Play video");
	}
}
class Demo4 implements Runnable
{
	public void run()
	{
		System.out.println("Play Music");
	}
}