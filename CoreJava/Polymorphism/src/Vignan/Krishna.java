package Vignan;



public class Krishna {

	public static void main(String[] args)  {
		String s1=new String("Sai");
		s1=null;
		System.gc();//==>finalize is not executing
	    Krishna k1=new Krishna();
	    Krishna k2=new Krishna();
	    k1=null;
	    k2=null;
	    k1.finalize();
	    System.gc();
	}
	 protected void finalize()  
	{
		System.out.println("Finalize");
		
	}
	
	

}



