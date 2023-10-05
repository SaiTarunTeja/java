package Arrays;
import java.util.*;
public class CR2 {

	public static void main(String[] args) {
		int a[]=new int[] {1,2,3,4,5,6,7,8,9,10};
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Rotation Number");
		int r =sc.nextInt();
		int x,y,temp;
		for(x=0;x<r;x++)
		{
			temp=a[0];
			for(y=0;y<a.length-1;y++)
			{
				a[y]=a[y+1];
				
			}
			a[y]=temp;
		}
        for(int t:a)
        {
        	System.out.print(t+" ");
        }
	}

}
