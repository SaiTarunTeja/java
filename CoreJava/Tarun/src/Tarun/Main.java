package Tarun;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int i,j,temp;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter arry sized");
	int size =sc.nextInt();
	int a[]=new int[size];
	System.out.println("Enter array elements");
	for( i=0;i<size;i++)
	{
	    a[i]= sc.nextInt();
	}
	    for(i=0;i<size;i++)
	    {
	       for( j=i+1;j<5;j++)
	       {
	           if(a[i]>a[j])
	           {
	                temp=a[i];
	               a[i]=a[j];
	               a[j]=temp;	           
	               
	           }
	       }
	    }
	    for(i=0;i<size;i++)
    	{
	      a[i]= sc.nextInt();
    	}
	}
}