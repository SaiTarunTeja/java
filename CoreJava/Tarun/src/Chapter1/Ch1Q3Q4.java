package Chapter1;

public class Ch1Q3Q4 {

	public static void main(String[] args) {
		//using for-each loop display the Array Elements
				//find length of array without using method length
				int count=0,count1=0,count2=0,count3=0;
				int a1[]=new int[] {139,12,34,566,7};		
				for(int t:a1)
				{		
					/*Q2Q3Q4*/
					System.out.print(t+" ");
					count++;
				}
				System.out.print("===>Array length is "+count);
				System.out.println();
				char a2[]=new char[] {'c','3','(','?'};
				for(char t:a2)
				{
					System.out.print(t+" ");
					count1++;
				}
				System.out.print("===>Array length is "+count1);
				System.out.println();
				String a3[]=new String[] {"hello","all","good","morning","453","?<>|_"};
				for(String t:a3)
				{
					System.out.print(t+" ");
					count2++;
				}
				System.out.print("===>Array length is "+count2);
				System.out.println();
				boolean a4[]=new boolean[] {true,false,true,false,true,true};
				for(boolean t:a4)
				{
					System.out.print(t+" ");
					count3++;
				}
				System.out.print("===>Array length is "+count3);

	}

}
