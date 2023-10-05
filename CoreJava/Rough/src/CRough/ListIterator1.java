package CRough;
import java.util.ArrayList;
import java.util.ListIterator;
public class ListIterator1 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);al.add(1.23);al.add('d');al.add("Hello");
		ListIterator i=al.listIterator(al.size());
		while(i.hasPrevious())
		{
			
			System.out.println(i.previous());
		}

	}

}
