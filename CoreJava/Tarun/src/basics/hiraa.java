package basics;

import java.util.Scanner;

public class hiraa {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Prime p=new Prime();
		 System.out.println("Enter Starting Number");
		  p.s = sc.nextInt();
		 System.out.println("Enter Ending Number");
		  p.e = sc.nextInt();
		  p.prime1();
	}

}
class Prime
{
	 int a,count=0,s,e;
    public void prime1()
    {
	 for(;s<=e;s++)
	 {
	    count=0;
	     for(a=1;a<=s;a++)
	     {
	         if(s%a==0)
	         {
	             count++;
	         }
	     }
	     prime2();
	 }
    }
    public void prime2()
    {
         if(count==2)
	     {
	         System.out.println(s);
	     }
    }
}