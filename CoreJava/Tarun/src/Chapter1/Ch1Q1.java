package Chapter1;
import java.util.*;
public class Ch1Q1 {

	public static void main(String[] args) {
		//insert and display the in the array 
		Scanner sc = new Scanner(System.in);
		System.out.println("Compile time Initilization");
		int a[]=new int[] {139,12,34,5,566,7};
		int x;
		for(x=0;x<a.length;x++)
	    {
		System.out.print(a[x]+" ");
		}
		System.out.println();
		char b[]=new char[] {'c','3','(','?'};
		for(x=0;x<b.length;x++)
		{
		System.out.print(b[x]+" ");
		}
		System.out.println();
		String c[]=new String[] {"hello","all","good","morning","453","?<>|+_"};
		for(x=0;x<c.length;x++)
		{
		System.out.print(c[x]+" ");
		}
		System.out.println();
		boolean d[]=new boolean[] {true,false,true,false,true,true};
		for(x=0;x<d.length;x++)
		{
		  System.out.print(d[x]+" ");
		}
		System.out.println();
		System.out.println("----------------------------------------------");
		System.out.println("Run time initialization");
		System.out.println("Enter length of an int Array e[] ");
		int len = sc.nextInt();
		int e[]=new int[len];
		System.out.println("Enter e[] array elements");
		for(x=0;x<e.length;x++)
		{
			e[x]=sc.nextInt();
		}
		System.out.println("our e[] array is ");
		for(x=0;x<e.length;x++)
		{
			System.out.print(e[x]+" ");
		}
		System.out.println("-----------------------------------------");
		System.out.println("Enter length of an charecter Array f[] ");
		int leng = sc.nextInt();
		char f[]=new char[leng];
		System.out.println("Enter f[] array elements");
		for(x=0;x<f.length;x++)
		{
			f[x]=sc.next().charAt(0);
		}
		System.out.println("our f[] array is ");
		for(x=0;x<f.length;x++)
		{
			System.out.print(f[x]+" ");
		}
		System.out.println();
		System.out.println("-----------------------------------------");
		System.out.println("Enter length of String Array g[] ");
		int lengt = sc.nextInt();
		String g[]=new String[lengt];
		System.out.println("Enter g[] array elements");
		for(x=0;x<g.length;x++)
		{
			g[x]=sc.next();
		}
		System.out.println("our g[] array is ");
		for(x=0;x<e.length;x++)
		{
			System.out.print(g[x]+" ");
		}
		System.out.println("-----------------------------------------");
		System.out.println("Enter length of Array h[] ");
		int length = sc.nextInt();
		boolean h[]=new boolean[length];
		System.out.println("Enter h[] array elements");
		for(x=0;x<h.length;x++)
		{
			h[x]=sc.nextBoolean();
		}
		System.out.println("our h[] array is ");
		for(x=0;x<h.length;x++)
		{
			System.out.print(h[x]+" ");
		}
	  }
	}


