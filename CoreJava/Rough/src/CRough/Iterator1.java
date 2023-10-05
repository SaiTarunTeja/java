package CRough;
import java.util.ArrayList;
import java.util.Iterator;
public class Iterator1 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Hello");al.add(2);al.add(2.2);al.add('s');al.add(true);
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
        
	}

}
