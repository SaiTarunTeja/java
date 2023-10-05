import java.util.*;
public class twoDarraysum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r=2,c=2,x,y;
		System.out.println("Enter Elements in'a[]' Array");
       int a[][]=new int[r][c];
       for(x=0;x<r;x++)
       {
    	   for(y=0;y<c;y++)
    	   {
    		   a[x][y]=sc.nextInt();
    	   }
       }
       System.out.println("Enter Elements in'b[]' Array");
       int b[][]=new int[r][c];
       for(x=0;x<r;x++)
       {
    	   for(y=0;y<c;y++)
    	   {
    		   b[x][y]=sc.nextInt();
    	   }
       }
      
       int d[][]=new int[r][c];
       for(x=0;x<r;x++)
       {
    	   for(y=0;y<c;y++)
    	   {
    		   d[x][y]= a[x][y]+ b[x][y];
    	   }
       }
        System.out.println("----------------------------------------");
        for(x=0;x<r;x++)
        {
     	   for(y=0;y<c;y++)
     	   {
     		   System.out.print(a[x][y]+" ");
     	   }
     	   System.out.println();
        }
        System.out.println("----------------------------------------");
        for(x=0;x<r;x++)
        {
     	   for(y=0;y<c;y++)
     	   {
     		   System.out.print(b[x][y]+" ");
     	   }
     	   System.out.println();
        }
        System.out.println("----------------------------------------");
       for(x=0;x<r;x++)
       {
    	   for(y=0;y<c;y++)
    	   {
    		   System.out.print(d[x][y]+" ");
    	   }
    	   System.out.println();
       }
	}

}
