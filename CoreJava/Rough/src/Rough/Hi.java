package Rough;

public class Hi extends Thread {

	public static void main(String[] args) throws InterruptedException
	{
		Demo1 d=new Demo1();
		Thread t=new Thread(d);
		t.start();
			     
	     System.out.println("Hello Java"); 
	}

}
class Demo1 extends Thread
{
	public void run()
	{		
		for(int x=0;x<10;x++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		System.out.println("Run");
		}
	}
}