package Thread;

public class Thread_lamda {

	public static void main(String[] args) {
		Runnable r1 = new Runnable()
		{
			public void run()
			{
				for(int x=0;x<5;x++)
				{
					System.out.println("run");
				}
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		
		for(int x=0;x<5;x++)
			System.out.println("main");
	}

}
