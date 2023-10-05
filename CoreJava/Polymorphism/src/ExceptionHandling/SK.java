package ExceptionHandling;
import java.util.*;
public class SK {

	public static void main(String[] args) {
//		System.gc();
		SK s=new SK();
		s.prathap();

	}
	public void prathap()
	{
		Krishna k=new Krishna();
		k.run();
	}

}
class Krishna implements Runnable
{
	public void run()
	{
		System.out.println("Krishna");
	}
	Set s=new HashSet();
	
}