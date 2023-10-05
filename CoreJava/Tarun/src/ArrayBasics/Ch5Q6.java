package ArrayBasics;
import java.util.*;
public class Ch5Q6 {

	public static void main(String[] args) {
		// Delete an element=40 in below array 10,20,30,40,50,60,70,80,90,100
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array");
		int length = sc.nextInt();
		int a[]=new int[length];
		System.out.println("Enter Array Elements");
		int x;
		for(x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
		}
		//delete 40 without using index number

	}

}
