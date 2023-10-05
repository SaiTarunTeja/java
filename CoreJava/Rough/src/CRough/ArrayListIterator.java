package CRough;
import java.util.ArrayList;
public class ArrayListIterator {

	public static void main(String[] args) {
		ArrayList al=new ArrayList() ;
		System.out.println(al.add(5));//true
		System.out.println(al);
		al.add(8);
		al.add(7);
		al.add(4);
		al.add(0);
		al.add(5);
		System.out.println(al.add(al));

	}

}
