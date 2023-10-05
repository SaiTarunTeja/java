package Exam;
/*153 
 * 370 371
 *407 1634 8208 * 
 */
public class ArmstrongPattern {

	public static void main(String[] args) {
		int starting=100;
		int ending=8210;
		int temp,count,x,r,y,count2=0,sum=0,z=0;
		int k[]=new int[6];
		for(starting=100;starting<=ending;starting++)
		{
			temp=starting;
			count=0;
			for(;temp>0;temp/=10)
			{
				count++;
			}
			temp=starting;
			sum=0;
			for(;temp>0;temp/=10)
			{
				 r=temp%10;
				 sum=sum+((int)(Math.pow(r,count)));
			}
			if(sum==starting)
			{				
			k[z]=starting;
				z++;
				
				/*for(x=0;x<=2;x++)
				{
					for(y=0;y<=x;y++)
					{
						System.out.print(starting+" "); 						
					}
					System.out.println();
				}*/
				
				
			}
		}
		
		for(x=0,z=0;z<k.length;x++)
		{
			for(y=0;y<=x;y++,z++)
			{
				System.out.print(k[z]+" ");
				
			}
			System.out.println();
		}

	}

}
