package Exam;

public class Swapping2564To5642 {

	public static void main(String[] args) {
		int num=2564,temp=num,rem,count=1,result=0;
		while(temp>0)
		{
			if(count==1)
			{
				rem=temp%1000;
				result=result*10+rem;
			}
			else
			{
				rem=temp%10;
				result=result*10+rem;
			}
			temp/=1000;
		}
		System.out.println(result);
	}

}
