package Methods;
import java.util.*;
public class PalinRangeModel23 {

	public static void main(String[] args) {
		Pal p=new Pal();
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER ANY TWO NUMBERS");
		int start=sc.nextInt();
		int end=sc.nextInt();
		
		for(; start<=end;start++)//11//12
		{
			int y=p.calPalin(start);
			if(y==0)
				continue;
			System.out.println(y);
		}
	}
}
class Pal
{
	
	public int calPalin(int number)//11//12
	{
		int rev,flag=0;
		int copy=number;
		rev=0;
		for(; number  > 0 ; number/=10)
		{
			int rem=number%10;
			 rev=rev*10+rem;
		}
		if(copy==rev)//11
		{
			flag=copy;
		}
		
		return flag;//11
	}
}
