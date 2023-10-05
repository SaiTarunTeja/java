package classmethodsandobjects;

import java.util.Scanner;
public class primeornot {

	public static void main(String[] args) {
		prime1 p = new prime1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		p.n=sc.nextInt();
		p.count();
		p.calprime();
	}
}
class prime1
{
   int n,count=0;
   public void count()
   {
      for(int a=1;a<=n;a++)
      {
          if(n%a==0)
          {
              count++;
          }
      }
   }
   public void calprime()
   {
       if(count==2)
       System.out.println(n +" is prime number");
       else
       System.out.println(n +" is not prime");
   }
}