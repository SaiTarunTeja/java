package For_tarun;

public class roman_ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n=35120,r=0;
      while(n>0)
      {
    	  r=n%10;
    	  n=n/10;
    	String res=(r==0)?"0":(r==1)?"|":(r==2)?"||":(r==3)?"|||":"v";
    	System.out.println(res);
      }
     }

}
