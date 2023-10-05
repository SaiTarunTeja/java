package Arrays;
import java.util.*;
public class LeftRotation {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in)	;
	System.out.println("Enter length of array");
    int length = sc.nextInt();
    int a[]=new int[length];
    int x;
    System.out.print("Enter Array Elements");
    for(x=0;x<a.length;x++)
    {
    	a[x]=sc.nextInt();
    }
    System.out.print("Enter Rotation number");
    int b=sc.nextInt();
    for(x=b;x<a.length;x++)
    {
    	System.out.print(a[x]+" ");
    }
    for(x=0;x<b;x++)
    {
    	System.out.print(a[x]+" ");
    }
	}

}
