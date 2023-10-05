package Tarun;
import java.util.*;
public class Factorial 
{
 public static void main(String args[])

{
	int var=1;
   
     Scanner s = new Scanner (System.in);
     System.out.println("What factorial do you want");
     int n=s.nextInt();
     while(n>=1)
   {
	 var=var*n;
	 --n;
   }
     System.out.println(var);
} 

}