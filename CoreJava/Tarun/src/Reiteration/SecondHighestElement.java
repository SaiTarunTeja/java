package Reiteration;

public class SecondHighestElement {

	public static void main(String[] args) {
		int[] a = new int[] {1,3,2,7,3,9,3,9};
		int secondHighest = findSecondHighest(a);
		if(secondHighest!=Integer.MIN_VALUE)
			System.out.println("Second Highest Element is "+secondHighest);
		else
			System.out.println("No Second Highest Element Found In the Array");
	}
	public static int findSecondHighest(int[] a)
	{
		if(a.length<2)
			return Integer.MIN_VALUE;
		
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		
		for(int number:a)
		{
			if(number>highest)
			{
				secondHighest = highest;
				highest = number;
			}
			else if(number>secondHighest && number!=highest)
			{
				secondHighest = number;
			}
		}
		return secondHighest;
	}
}
