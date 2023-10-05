package P1;

public class TryCatch {

	public static void main(String[] args) {
		TryCatch t=new TryCatch();
		System.out.println(t.m1());

	}
    String m1()
    {
	   try
	   {
		   System.out.println("I am in try");
		   return "10";
	   }
	   catch(Exception e)
	   {
		   System.out.println("I am in Catch");
		   return "20";
	   }
	   finally
	   {
		   System.out.println("I am in Finally");
		   return "30";
	   }
//	   return "100";
    }
}
