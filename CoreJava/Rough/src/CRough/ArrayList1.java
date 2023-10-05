package CRough;
import java.util.ArrayList;
public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		System.out.println(al.size());
		al.add(1);
		al.add(12.34);
		al.add("Hello");
		al.add(false);
		for(int x=0;x<al.size();x++)
		{
			System.out.print(al.get(x)+" ");
		}
		System.out.println();
		System.out.println(al);
		System.out.println(al.hashCode());
        //how can we write foreach loop to print all al elements
		al.add(0, "Ravi");
		System.out.println(al);System.out.println(al.hashCode());
		
//		al.addAll(al);
//		System.out.println(al);
		
		al.addAll((al.size()), al);
		System.out.println(al);
		
		System.out.println(al.hashCode());
		
		al.clear();
		System.out.println(al);
	}

}
