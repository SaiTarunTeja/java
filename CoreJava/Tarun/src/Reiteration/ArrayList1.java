package Reiteration;

import java.util.*;



public class ArrayList1 {

	public static void main(String[] args) {
		/*ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(1);
		al1.add(2);
		al1.add(3);
		System.out.println(al1);
		al1.add(1,0);
		System.out.println(al1);
		Iterator<Integer> it = al1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("-----");
//		ListIterator li = al1.listIterator();
//		while(li.hasPrevious())
//		{
//			System.out.println(li.previous());
//		}
		System.out.println("-----");
//		al1.sort(Comparator.naturalOrder());
//		System.out.println(al1);
//		al1.sort(Comparator.reverseOrder());
//		System.out.println(al1);
		
		//Iterator it = queue.decending interator
		
		TreeSet t = new TreeSet();
		t.addAll(al1);
//		t.sort(Comparator.reverseOrder());
		Map m = new HashMap();
		m.put(1,"Lakshman");
		m.put(120,"Lakshman");
		m.put(560,"Lakshman");
		m.put(10,"Lakshman");
		System.out.println("keySet"+m.keySet());
		System.out.println("values"+m.values());
		System.out.println("entrySet"+m.entrySet());*/
		String s="I";
		String s1="A";
//		System.out.print(Character.getNumericValue(s.charAt(2)));
//		Solution sol = new Solution();
//		int num=sol.romanToInt(s);
//		System.out.println(num);
		int I=0;
	     char first=s.charAt(0);
	     if(first=='I')
	    	 first=1;
	     System.out.println(first);
	}	
}
class Solution {
    public int romanToInt(String s) {
        int I = 1;
        int V = 5;
        int X = 10;
        int L = 50;
        int C = 100;
        int D = 500;
        int M = 1000;
        int x,y,first,next,result=0;
        for(x=0,y=x+1;x<s.length()-1;x++)
        {
           
//            for(y=x+1;y<s.length();y++)
//            {
                first=s.charAt(x);
                next=s.charAt(y);
                if(first>next)
                    result=result+first;
                else if(first<next)
                {
                    result=result+next-first;
                   
                }
                else if(first==next)
                {
                    result=result+first+next;
                    
                }
                System.out.println(x+"first"+first+" "+result);
                System.out.println(y+"next"+next+" "+result);
//            }
        }
        return result;
    }
}