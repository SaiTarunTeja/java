package Rough;


public class AAAimp_x implements Runnable
{
	public void run()
	{
		for(int x=0;x<10;x++)
		System.out.println("run");
	}
	public static void main(String[] args) {
		for(int x=0;x<10;x++)
			System.out.println("Main");
		AAAimp_x a=new AAAimp_x();
		a.run();

	}

}
