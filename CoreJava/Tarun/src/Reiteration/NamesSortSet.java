package Reiteration;

import java.util.*;


public class NamesSortSet {

	public static void main(String[] args) {
		Set names = new LinkedHashSet();
		names.add("vamshi");
		names.add("sravan");
		names.add("vinod");
		names.add("anjaneyulu");
//		Collection c1=hashSetEx(names);
		System.out.println("original Collection"+names);
		System.out.println("HashSet Result ==>"+hashSetEx(names));
		System.out.println("Linked HashSet Result ==>"+linkedHashSetEx(names));
		System.out.println("Tree Set Result ==>"+treeSetEx(names));
	}
	public static Set hashSetEx(Collection names)
	{
		Set s = new HashSet();
		s.addAll(names);
		return s;
	}
	public static Set linkedHashSetEx(Collection names)
	{
		Set s = new LinkedHashSet();
		s.addAll(names);
		return s;
	}
	public static Set treeSetEx(Collection names)
	{
		Set s = new TreeSet();
		s.addAll(names);
		return s;
	}
}

abstract interface hi{
	public void hello();
}
