package Rough;

public class Hiiiiiiiii {

	public static void main(String[] args) 
	{
		
			TestInterruptingThread1 obj=new TestInterruptingThread1();
			Thread t=new Thread(obj);
			t.start();
			try {
				int x=10/0;
				t.sleep(1200);
				t.start();
			} catch (InterruptedException e) {
				
				System.out.println("Hii");
			}
			catch (ArithmeticException e1) {
				
				System.out.println("Hello");
			}
			finally
			{
				System.out.println("hhhh");
			}
			
	}

}
class TestInterruptingThread1 extends Thread
{  
      public void run()
      {  
          System.out.println("I am Running");
      }
  
}  