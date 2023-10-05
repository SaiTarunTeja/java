package Tarun;
import java.util.*;
public class Sumofevendigits {

	public static void main(String[] args)
	{
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0,temp=n,r,a=0;
        while(n>0)
        {
        	r=n%10;
        	if(r%2==0)
        	{
        		a=a+r;
        	}
        	n=n/10;
        }
        
        System.out.println(a);
       
	}

}
