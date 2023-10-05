package CRough;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new Comparator() {
			  @Override
			  public int compare(Object o1, Object o2) {
			    return o1==null?-1:(o2==null?1:0);
			  }
			});
			ts.add(null);
			ts.add(null);

			System.out.println(ts);

	}

}
