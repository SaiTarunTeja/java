package Exam;
import java.util.Scanner;
public class FCWframe {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		String[] a=s.split(" ");
		int x;
        for(x=0;x<a.length;x++)
        {
        	System.out.print(a[x].charAt(0));
        }
	}

}
