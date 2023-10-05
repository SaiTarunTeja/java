package Exam;

public class PalinPrimePattern {

	public static void main(String[] args) {
		int i,j,x,y,starting=100,ending=730,temp,r,palin,count;
		for(i=0;i<4;i++)
		{
			for(j=0;j<=i;j++)
			{
				for(;starting<=ending;starting++)
				{
					temp=starting;
					palin=0;
					for(;temp>0;temp/=10)
					{
						r=temp%10;
						palin=palin*10+r;
					}
					if(palin==starting)
					{
						count=0;
						for(x=1;x<=starting;x++)
						{
							if(starting%x==0)
							count++;
						}
						if(count==2)
						{
							System.out.print(starting+" ");
							starting++;
							break;
						}

					}
				}
			}
			System.out.println();
		}

	}

}
