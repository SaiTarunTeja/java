package Thread;

public class Thread_lamda2 {

	public static void main(String[] args) {
		Runnable r = () ->
					{
						for(int x=0;x<5;x++)
						{
							System.out.println("run");
						}
					}
					
					;
				
					Thread t = new Thread(r);
					t.start();
					
				for(int x=0;x<5;x++)
				{
					System.out.println("main");
				}
	}

}
