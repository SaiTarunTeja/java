package classmethodsandobjects;
import java.util.Scanner;

public class ArmstrongWithoutPower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Armstrong1 x = new Armstrong1();
		System.out.println("enter any number");
		x.n = sc.nextInt();
		x.n=x.temp;
		x.arm1();
		x.temp=x.n;
		int a=x.n;
		for(;x.n>0;x.n/=10)
		  {
			x.count++;
		  }
		for(;a>0;a/=10)
		{
			x.r=a%10;
			x.b=x.b+x.power();
		}
		if(x.b==x.temp)
		System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");
	}

}
class Armstrong1
{
	int n,temp;
	int count=0,r,d,e=1;
	double b=0;
	public void arm1()
	{
	  for(;n>0;n/=10)
	  {
		count++;
	  }
	}

	public int power()
	{
	  for(d=1;d<=count;d++)
	  {
		  e=e*r;
	  }
	  return e;
    }
}
