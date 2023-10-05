package Thread;

import java.util.Scanner;

public class RaceCondition1 implements Runnable{
	int count;
	public static void main(String[] args) {
		RaceCondition1 rc = new RaceCondition1();
		Thread t1 = new Thread(rc ,"Sai");
		t1.start();
		Thread t2 = new Thread(rc ,"Tarun");
		t2.start();
	}
	
	@Override
	public void run() {
		dataInconsistencyproblem();
	}
//	public  void dataInconsistencyproblem()
//	{
//		
//		for(int x=1;x<=5;x++)
//		{
//			count++;
//			System.out.println(Thread.currentThread().getName()+"==>"+count);
//		}
////		System.out.println(Thread.currentThread().getName()+"==>"+count);
//	}
	public  synchronized void dataInconsistencyproblem()
	{
		
		for(int x=1;x<=10;x++)
		{
			count++;
		System.out.println(Thread.currentThread().getName()+"==>"+count);
		}
//		System.out.println(Thread.currentThread().getName()+"==>"+count);
	}
}
