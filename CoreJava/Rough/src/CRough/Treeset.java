package CRough;
import java.text.Collator;
import java.text.RuleBasedCollator;
import java.util.*;
import java.util.stream.Collectors;
public class Treeset {

	public static void main(String[] args) {
//		TreeSet t=new TreeSet();
////		t.add(new StringBuffer("A"));
////		t.add(new StringBuffer("Z"));
////		t.add(new StringBuilder("L"));
//		t.add((10));
//		System.out.println(t.getClass());
//		A1 a1=new A1();
		/*a1.a=10;a1.b=20;
		int x=a1.a;int y=a1.b;
		t.add(x);
		t.add(y);
		System.out.println(t);
//		System.out.println(x+" "+y);//*/
//		MyComparator a1=new MyComparator();
		int a=89,b=28;
		String s="ioooooooop";
		Employee e1=new Employee("nag",100);
		Employee e2=new Employee("ballaiah",200);
		Employee e3=new Employee("chiru",50);
		Employee e4=new Employee("venki",150);
		Employee e5=new Employee("nag",100);
		
		TreeSet t=new TreeSet();
		t.add(e1);t.add(e2);t.add(e3);t.add(e4);t.add(e5);
		System.out.println(t);
//		t.add(null);
		System.out.println(t);
//		TreeSet t1=new TreeSet(new MyComparator());
//		t1.add(e1);t1.add(e2);t1.add(e3);t1.add(e4);t1.add(e5);
//		System.out.println(t1);
		HashSet h=new HashSet();
		h.add(10);
		h.add("A");
		h.add(null);h.add(null);
		System.out.println(h);
	}
}
class Employee implements Comparable{
	String name;
	int eid;
	Employee(String name,int eid)
	{
		this.name=name;
		this.eid=eid;
	}
	public String toString()
	{
		return name+"-"+eid;
	}
	@Override
	public int compareTo(Object obj) {
		int eid1=this.eid;
		Employee e=(Employee)obj;
		int eid2=e.eid;
		if(eid1<eid2)
		{
			return -1;
		}
		else if(eid1>eid2)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}
class MyComparator implements Comparator
{
	@Override
	public int compare(Object obj1, Object obj2) {
		Employee e1=(Employee)obj1;
		Employee e2=(Employee)obj2;
		String s1=e1.name;
		String s2=e2.name;
		
			return s1.compareTo(s2);
	}	
}
class A23 implements Iterable
{

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}