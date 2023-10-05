package CRough;
import java.util.ArrayList;
import java.util.ListIterator;
public class ListIterator2 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(12);al.add(12.5);al.add("Hello");al.add('c');
		ListIterator li=al.listIterator();
		System.out.println("Forward Iteration");
		while(li.hasNext())
		{
			System.out.print(li.next()+" ");
		}
		System.out.println();
		System.out.println("Backward Iteration");
		while(li.hasPrevious())
		{
			System.out.print(li.previous()+" ");
		}

	}

}
