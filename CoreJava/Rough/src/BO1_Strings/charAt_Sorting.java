package BO1_Strings;

public class charAt_Sorting {

	public static void main(String[] args) {
		StringBuilder word = new StringBuilder("apple");
	    boolean swapped;
	    
	    do 
	    {
	          swapped = false;
	          for (int i = 0; i < word.length() - 1; i++)
	          {
	              char a = word.charAt(i), b = word.charAt(i + 1);

	              if (a > b)
	              { // <-- this is fine.
	                word.setCharAt(i, b);
	                word.setCharAt(i + 1, a);
	                swapped = true;
	              }
	         }
	    } 
	    while (swapped);
	    System.out.println(word);

	}

}
