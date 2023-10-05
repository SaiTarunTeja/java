package CRough;
import java.util.*;
public class SOutput {
	static int count=0;
	public static void main(String[] args) {
		countDown(10);
	}
	static void countDown(int num)
	{
	  if(num < 0) // base case. Stop at 0.
	  {
		return; // stop function.  
	  } else {	  
	      System.out.println(num);
	      countDown(num - 1); // count down 1.
	 }
	}
}
