package Rough;
import java.util.*;
public class E1 {

	public static void main(String[] args) {
		int x=10,z;
		Scanner sc = new Scanner(System.in);
		int y=sc.nextInt();
		try
		{
			z=x/y;
		}
		catch(InputMismatchException P)
		{
			System.out.println("hi");
		}
		catch(Exception e) 
		{
			e.printStackTrace();;
		}
	}

}
