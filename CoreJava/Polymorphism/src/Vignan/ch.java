package Vignan;

public class ch {

	public static void main(String[] args) {
		vamshi v=new vamshi();
		v.run();
	}

}
class A
{
	public void run()
	{
		System.out.println("ch");
	}
	
}
class vamshi extends A
{
	//is a program contains only one public class
	public void run()
	{
		for(int x=0;x<5;x++)
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String [] args)
	{
		String[] s= {"vamshi","kane"};
		ch.main(s);
		System.out.println("van");
		
	}
}