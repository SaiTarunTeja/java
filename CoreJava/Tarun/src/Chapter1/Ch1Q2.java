package Chapter1;

public class Ch1Q2 {

        
		public static void main(String[] args) {	
			//find the length of array
			int a1[]=new int[] {139,12,34,5,566,7};			
			int count1=0;
			for(int t:a1)
			{
				count1++;
			}
			System.out.println("length of the array is "+count1);
			System.out.println("---------------------------------");
			System.out.println("---------------------------------");
			int count=0;
			for(int x=0;x<a1.length;x++)
			{			
				count++;			
			}
			System.out.println("length of array a1 is "+count);
			System.out.println("---------------------------------");
			char a2[]=new char[] {'c','3','(','?'};
			int count2=0;
			for(char t:a2)
			{
				count2++;
			}
			System.out.println("length of the array is "+count2);
			System.out.println("---------------------------------");
		    String a3[]=new String[] {"hello","all","Morning","453","?<>|+_"};
			int count3=0;
			for(String t:a3)
			{
				count3++;
			}
			System.out.println("length of the array is "+count3);
			System.out.println("---------------------------------");
			boolean a4[]=new boolean[] {true,false,true,false,true,true};
			int count4=0;
			for(boolean t:a4)
			{
				count4++;
			}
			System.out.println("length of the array is "+count4);
			
		}

}
