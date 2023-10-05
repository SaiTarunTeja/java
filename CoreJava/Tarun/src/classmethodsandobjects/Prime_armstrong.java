package classmethodsandobjects;
import java.util.*;
public class Prime_armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     Prime p=new Prime();
     System.out.println("enter n value");
	 p.n=sc.nextInt();
	 p.temp=p.n;
	 p.calPrime();
	 p.calPalin();
	}

}
class Prime
{
	int n,count=0,x,rev,r1,temp,f=0;
	public void calPrime()
	{
		System.out.println(temp);
		for(x=1;x<=n;x++)
		{
			if(n%x==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("prime");
		}
		else
			System.out.println("not prime");
	}
	public void calPalin()
	{
		for(;n>0;n/=10)
		{
			r1=n%10;
			rev=rev*10+r1;
		}
		if(rev==temp)
		System.out.println("palindrome");
		else
			System.out.println("nota palindrome");
		
	}
	
}
