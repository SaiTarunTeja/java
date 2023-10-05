package String;

public class s2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a1=new String("hello");
		String a2=new String("hello");
		System.out.println(a1.equals(a2));//matches of
		String a3="hello";
		String a4=new String("hello").intern();
//		System.out.println(a4.hashCode());
//		System.out.println(a1.hashCode());
//		System.out.println(a2.hashCode());
//		System.out.println(a3.hashCode());
		System.out.println(a3==a4);
		System.out.println(a3==a1);
		System.out.println(a3.equals(a4));
		char m[]=a1.toCharArray();
//		for(int x=0;x<m.length;x++)
//		{
//			if(m[x]==h)
//			{
//				
//			}
//		}
		
	}

}
