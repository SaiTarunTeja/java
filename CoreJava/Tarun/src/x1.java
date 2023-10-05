
public class x1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("Apple");
		char a[]=s1.toCharArray();
		int x,y,length=0;
		for(x=0;x<a.length;x++)
		{
			length=0;
			for(y=0;y<a.length;y++)
			{
				if(a[x]==a[y]&&x!=y)
				{
					length++;
				}
			}
			if(length==0)
			{
				System.out.print(a[x]+" ");
			}
		}
	}

}
