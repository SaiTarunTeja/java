package VignanArrays;

public class ElementSum20 {

	public static void main(String[] args) {
		int b[]=new int[] {1,11,13,15,17,19,12,2,5,6};
		int x,y;
		for(x=0;x<b.length;x++)
		{
			for(y=0;y<b.length;y++)
			{
				if(b[x]+b[y]==20)
				{
					System.out.println(b[x]+" "+b[y]);
				}
			}
		}

	}

}
