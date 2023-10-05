package Chapter1;

public class Ch1Q5b_f {

	public static void main(String[] args) {
		//divide the array into two equal halfs
		 int a[]=new int[] {12,56,34,23,67,76,32,75,90,345};
        System.out.println("printing two equal halfs");
        int x;
        for(x=0;x<a.length/2;x++)
        {
       	 System.out.print(a[x]+" ");
        }
        System.out.print("\n");
        for(x=a.length/2;x<a.length;x++)
        {
       	 System.out.print(a[x]+" ");
        }
        System.out.println("\n-----------------------------------------------");
        //copying first half in one array and another half in another array
        int b[]=new int[a.length/2];
        for(x=0;x<a.length/2;x++)
        {
       	 	b[x]=a[x];
        }
        int y=0;
        int c[]=new int[a.length/2];
        for(x=a.length/2;x<a.length;x++)
        {
       	 	c[y]=a[x];
       	 	y++;
        }
        System.out.println("-----------------------------------------------");
        
        for(x=0;x<b.length;x++)
        {
       	 System.out.print(b[x]+" ");
        }
        System.out.println("\n");
        for(y=0;y<c.length;y++)
        {
       	 System.out.print(c[y]+" ");
        }
        System.out.print("\n-----------------------------------------------\n");
        //print first half in the reverse order
        for(x=((a.length-1)/2);x>=0;x--)
        {
       	 System.out.print(a[x]+" ");
        }
       System.out.print("__");
        for(x=(((a.length-1)/2)+1);x<a.length;x++)
        {
       	 System.out.print(a[x]+" ");
        }
        System.out.print("\n-----------------------------------------------\n");
      //print second half in the reverse order
        for(x=0;x<=((a.length-1)/2);x++)
        {
       	System.out.print(a[x]+" ");       	
        }
        System.out.print("__");
        for(x=(a.length-1);x>=(((a.length-1)/2)+1);x--)
        {
       	 System.out.print(a[x]+" ");
        }
        System.out.print("\n-----------------------------------------------\n");
        //print both halfs in the reverse order
        for(x=((a.length-1)/2);x>=0;x--)
        {
       	 System.out.print(a[x]+" ");
        }
       System.out.print("__");
       for(x=(a.length-1);x>=(((a.length-1)/2)+1);x--)
       {
      	 System.out.print(a[x]+" ");
       }
       System.out.print("\n-----------------------------------------------\n");
       System.out.println("print only even indexed  elements");
       for(x=0;x<a.length;x=x+2)
       {
       	System.out.print(a[x]+" ");
       }
       System.out.println("\nprint only odd indexed  elements");
       for(x=1;x<a.length;x=x+2)
       {
       	System.out.print(a[x]+" ");
       }
       System.out.print("\n-----------------------------------------------\n");
       System.out.println("print only even elements");
       for(x=0;x<a.length;x++)
       {
       	if(a[x]%2==0)
       	System.out.print(a[x]+" ");        	
       }
       System.out.println("\n-------------------------");
       System.out.println("odd numbers are");
       for(x=0;x<a.length;x++)
       {
           	if(a[x]%2!=0)
                  	System.out.print(a[x]+" ");
       }
       //print the elements which are divisible by 4
       System.out.print("\n-----------------------------------------------\n");
       System.out.println("print the elements which are divisible by 4");
       for(x=0;x<a.length;x++)
       {
       	if(a[x]%4==0)
       		System.out.print(a[x]+" ");
       }
       //print the indexes which are divisible by 3
       System.out.print("\n-----------------------------------------------\n");
       System.out.println("print the indexes which are divisible by 3");
       for(x=0;x<a.length;x++)
       {
       	
       	 if(x%3==0)
       		System.out.print(x+" ");
       }

	}

}
