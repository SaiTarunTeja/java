package Arrays;
import java.util.*;
public class CharacterArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Length");
		int length = sc.nextInt();
		char a[]=new char[length];
		int x;
		System.out.println("Enter Characters");
		for(x=0;x<a.length;x++)
		{
			a[x]=sc.next().charAt(0);
		}
		System.out.println("Output is");
		for(x=0;x<a.length;x++)
		{
			System.out.print(a[x]+" ");
		}

	}

}
