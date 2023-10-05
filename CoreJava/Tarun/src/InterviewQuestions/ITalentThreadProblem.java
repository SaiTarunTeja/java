package InterviewQuestions;
import java.util.*;
public class ITalentThreadProblem {

	public static void main(String[] args) throws InterruptedException 
	{
		GenerateRandomNumbers grn = new GenerateRandomNumbers();
		Thread t1 = new Thread(grn);
		t1.start();
		t1.join();
		List l2 =grn.getL2();
		
		GenerateSquares gs = new GenerateSquares(l2);
		Thread t2 = new Thread(gs);
		t2.start(); 
	}
}
class GenerateRandomNumbers implements Runnable
{
	List l2 ,l;
	Random r = new Random();
	public List randomNumberGenerator()
	{
		l= new ArrayList();
		for(int x=0;x<10;x++)
		{
			l.add(r.nextInt(100));
		}
			return l;
	}
	@Override
	public void run() {
		l2=randomNumberGenerator();
		System.out.println("Generated Numbers "+l2);
	}
	public List getL2()
	{
		return l2;
	}
}
class GenerateSquares extends GenerateRandomNumbers implements Runnable{
	List l2 = new ArrayList();
	public GenerateSquares(List l2)
	{
		this.l2=l2;
	}
	@Override
	public void run() {
		List l3=new ArrayList();
		for(int x=0;x<l2.size();x++) {
			int element = (int) l2.get(x);
			l3.add(element * element);
		}
			System.out.println("Squares of the Random Numbers "+l3);
	}
	
}