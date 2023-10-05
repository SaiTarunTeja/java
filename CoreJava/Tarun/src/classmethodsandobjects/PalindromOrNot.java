package classmethodsandobjects;

import java.util.Scanner;

public class PalindromOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Palin p= new Palin();
		System.out.println("Enetr any number=");
		p.n=sc.nextInt();
		p.temp=p.n;
		p.palin1();
		p.palin2();

	}

}
class Palin
{
	int n;
	int r,a=0;
	int temp=n;
	public void palin1()
	{
	//Scanner sc = new Scanner(System.in);
		//int temp=n;
		System.out.println("temp value in palin1= "+ temp);
	        for(;n>0;n=n/10)
	        {
	        	
	        	r=n%10;
	        	a=a*10+r;
	        }
	        System.out.println("a in palin1= "+ a);
	}
	public void palin2()
	{
		   //int temp=n;
		   System.out.println("temp value in palin2= "+ temp);
		   System.out.println("a in palin2= "+ a);
	         if(a==temp)
	         {
	        	 System.out.println("it is palindrom");
	         }
	         else
	        	 System.out.println("it is not a palindrom");
	}
}
