package Array;

public class TenOddSum {

	public static void main(String[] args) {
		int i,sum=0;
		for(i=0;i<20;i++)
		{
			if(i%2!=0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
		usewhile.oddsum();
	}

}
class usewhile
{
	public static void oddsum()
	{
		int i=0,count=0,sum=0;
		while(count<10)
		{
			if(i%2!=0)
			{
				sum=sum+i;
				count++;
			}
			i++;
		}
		System.out.println(sum);
	}
}