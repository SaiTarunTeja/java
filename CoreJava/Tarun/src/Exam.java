import java.util.*;
public class Exam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array");
		int len = sc.nextInt();
		int a[]=new int[len];
		System.out.println("Enter elements in array");
		int x;
		for(x=0;x<len-1;x++)
		{
         a[x]=sc.nextInt();   
		}
		System.out.println("Enter Element");
		int ele=sc.nextInt();
		a[len-1]=ele;
		for(int t:a)
		{
			System.out.print(t+" ");
		}

	}

}
