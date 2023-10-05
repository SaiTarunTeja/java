package String;
import java.util.*;
public class ArmM1 {

	public static void main(String[] args) {
		
		Arm a=new Arm();
		a.init();
		

	}

}
class Arm
{
	int x,temp,count,rem,sum,start,end;
	public void init()
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Starting number");
	 start=sc.nextInt();
	System.out.println("Enter Ending number");
	 end=sc.nextInt();
	for(;start<=end;start++)
	{
		temp=start;
		count=0;
		for(;temp>0;temp/=10)
		{
			count++;
		}
		temp=start;
		sum=0;		
		for(;temp>0;temp/=10)
		{
			rem=temp%10;
			sum=sum+((int)(Math.pow(rem,count)));
			
		}
		if(sum==start)
		{
			System.out.println(start);
		}
	}
	}
}