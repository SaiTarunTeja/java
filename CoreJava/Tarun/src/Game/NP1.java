package Game;

public class NP1 {

	public static void main(String[] args) {
		int a=5;
		int b[]=new int[a];
		int c=0,d=b.length;
		for(int i=0;i<b.length;i++)
		{
			b[i]=1;
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		while(true)
		{
			for(int i=0;i<b.length;i++)
			{
				
				if(b[i]==1)
				{
					if(c==0)
					{
						c=1;
					}
					else if(c==1)
					{
						c=0;
						b[i]=0;
						
					}
					
				}
				
			}
		}
		
	}
		

}
