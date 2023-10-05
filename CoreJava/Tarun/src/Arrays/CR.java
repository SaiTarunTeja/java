package Arrays;
import java.util.*;
public class CR {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[]=new int[] {1,2,3,4,5,6,7,8,9,10};
	    int x,y;
	    System.out.println("Before Rotation");
	    for(int z:a)
	     System.out.print(z+" ");
	    System.out.println("Enter number of rotations");
	    int rotation=sc.nextInt();
	    for(y=1;y<=rotation;y++)
	    {
		   int temp=a[9];
		   for(x=a.length-1;x>0;x--)
		    {
			   a[x]=a[x-1];
		    }
		a[x]=temp;
	    }
		for (int z:a)
		System.out.print(z+" ");

	}

}
   