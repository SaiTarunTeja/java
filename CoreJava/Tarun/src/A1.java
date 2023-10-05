
public class A1 {

	public static void main(String[] args) {
		int[] a =new int[]{1,2,3,5,7,8,9,10};
		int count=0,flag=1, value=0,ex=0;
		int x=0;
		for(x=0;x<a.length;x++)
		{
			count++;
		  if(a[x]!=count)
		  {
			  System.out.println(count+"   ");
			  value=count;
			  flag=0;
			  count++;
			  
			  
		   }
		}
		if(flag==0)
			if(x<a.length)
		{
			System.out.println(value);
			count=ex;			
		}
		// TODO Auto-generated method stub

	}

}
