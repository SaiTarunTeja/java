package Tarun;
import java.util.*;
public class seven_modd 
{
   public static void main(String[] args)
   {
	  System.out.println("Enter any number");
	  Scanner sc=new Scanner(System.in);
	  int n = sc.nextInt();
	  int count=0,r,a=0,b=1,temp=n;
	  while(n>0)
	  {
		 if(n>0)
		 {
			 ++count;
		 }
		 n=n/10;
	  }
	  n=temp;
		  if(count%2==0)
		  {
			while(n>0)
			{
				r=n%10;
				a=a+r;
				n=n/10;
			}
			System.out.println(a);
		  } 
		  else
		  {
			  while(n>0)
			  {
				  r=n%10;
				  b=b*r;
				  n=n/10;
			  }
			  System.out.println(b);
		  }
   }
}
