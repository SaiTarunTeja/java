package Exam;

public class TwinPrime {

	public static void main(String[] args) {
		int starting =1;
		int ending =110;
		int x,count=0,n,count1=0;
		for(;starting<=ending;starting++)
		{
			count=0;
			for(x=1;x<=starting;x++)
			{
				if(starting%x==0)
				{
					count++;
				}
			}
		
			if(count==2)
			{				
				n=starting+2;
				{
					count1=0;
					for(x=1;x<=n;x++)
					{
						if(n%x==0)
						{
							count1++;
							
						}
					}
					if(count1==2)
					{
						System.out.println(starting+","+n);
					}
				}
				
				
			}
		}

	}

}
