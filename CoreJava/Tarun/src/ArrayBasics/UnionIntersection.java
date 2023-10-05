package ArrayBasics;

public class UnionIntersection {

	public static void main(String[] args) {
		 int a[]=new int[] {1,2,3,4};
		 int b[]=new int[] {3,4,5,6};
		 int c[]=new int[a.length+b.length];
		 int x,y=0;
		 for(x=0;x<a.length;x++)
		 {
			 c[x]=a[x];
		 }
		 for(x=a.length;x<c.length;x++)
		 {
			 c[x]=b[y];
			 y++;
		 }
		 for(x=0;x<c.length;x++)
		 {
			 System.out.print(c[x]+" ");
		 }
		 System.out.print("\nIntersection\n");
		 for(x=0;x<c.length;x++)
		 {
			 int count=0;
			 for(y=0;y<c.length;y++)
			 {
				 if(c[x]==c[y]&&x!=y)
				 {
					 count++;
					 c[y]='-';
				 }
			 }
			 if(count>0&&c[x]!='-')
			 {
				 System.out.print(c[x]+" ");
			 }
		 }
		 System.out.print("\nUnion\n");
		 for(x=0;x<c.length;x++)
		 {
			 int count=0;
			 for(y=0;y<c.length;y++)
			 {
				 if(c[x]==c[y]&&x!=y)
				 {
					 count++;
					 c[y]='_';
				 }
			 }
			 if(c[x]!='_')
			 {
				 System.out.print(c[x]+" ");
			 }
		 }
		 

	}

}
