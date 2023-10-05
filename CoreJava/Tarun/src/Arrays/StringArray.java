package Arrays;
import java.util.*;
public class StringArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter ARRAY LENGTH");
		int length = sc.nextInt();
		String a[]=new String[length];
		System.out.println("Enter Strings");
		int x;
		 sc.nextLine();
		for(x=0;x<a.length;x++)
		{
			 a[x]=sc.nextLine();
			
		}
		System.out.println("Output is");
		for(x=0;x<a.length;x++)
		{
			System.out.print(a[x]+" ");
		}
	}

}
