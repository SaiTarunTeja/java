package Vignan;
class Third extends Thread
{
	
	public void run()
	{
    	for(int x=0;x<10;x++)
		System.out.println("run");
	
		for(int x=0;x<10;x++)
			System.out.println("running");
	}
	public static void main(String args[])
	{
		for(int x=0;x<10;x++)
			System.out.println("Main");
		
		
		Third t=new Third();
		Thread ta=new Thread(t);
		ta.start();	
	}
	
}