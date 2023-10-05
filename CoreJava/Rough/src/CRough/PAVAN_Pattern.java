package CRough;

public class PAVAN_Pattern {

	public static void main(String[] args) {
		int n=5;
		  for(int i=1;i<=5;i++)
		  {
		   //P
		   for(int j=1;j<=5;j++)
		   {
		    if(i==1||j==1||i==3)
		     System.out.print("* ");
		    else if(i==2&&j==5)
		     System.out.print("* ");
		    else
		     System.out.print("  ");
		   }
		   //SPACE
		   for(int j=1;j<=1;j++)
		    System.out.print("  ");
		   //A
		   for(int j=1;j<=5;j++)
		   {
		    if(j==1||i==1||i==3)
		     System.out.print("* ");
		    else
		     System.out.print("  ");
		   }
		   //SPACE
		   for(int j=1;j<=1;j++)
		    System.out.print("  ");
		   //V
		   for(int j=1;j<=i;j++)
		   {
		    if(j==i)
		     System.out.print("*");
		    else
		     System.out.print(" ");
		   }
		   for(int j=4;j>=i;j--)
		    System.out.print("  ");
		   for(int j=1;j<=i;j++)
		   {
		    if(j==1)
		     System.out.print("*");
		    else
		     System.out.print(" ");
		   }
		   //SPACE
		   for(int j=1;j<=1;j++)
		    System.out.print("  ");
		   //A
		   for(int j=1;j<=5;j++)
		   {
		    if(j==1||i==1||i==3)
		     System.out.print("* ");
		    else
		     System.out.print("  ");
		   }
		   //SPACE
		   for(int j=1;j<=1;j++)
		    System.out.print("  ");
		   //N
		   for(int j=1;j<=i;j++)
		   {
		    if(j==1||j==i)
		     System.out.print("* ");
		    else
		     System.out.print("  ");
		   }
		   for(int j=3;j>=i;j--)
		    System.out.print("  ");
		   for(int j=1;j<=1;j++)
		   {
		    if(i==5)
		     System.out.print(" ");
		    else if(j==1)
		    System.out.print("* ");
		   }
		   System.out.println();
		  }

	}

}
