package ArrayBasics;

public class Arrays_Union {
   public static void main(String[] arguments) {
	  int[] a= {1,2,3,4,5};
	  int[] b= {5,6,4,8,9};
	  int n=a.length+b.length;
	  int[] c=new int[n+10];
	 
	  
	  for(int i=0;i<a.length;i++) {
		  c[i]=a[i];
	  }
	  
	  int count1=a.length;
	
	  for(int i=0;i<b.length;i++) {
		  int count=0;
		  for(int j=0;j<a.length;j++) {
		   if(b[i]==a[j]) {
			  count++;
		   }
		  }
		  if(count==0) {
			  c[count1]=b[i];
			  count1++;
		  }
	  }
	  for(int i=0;i<count1;i++) 
	  {
	  System.out.println(c[i]);
	 }
   }
}
