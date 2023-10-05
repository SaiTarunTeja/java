
public class s1 {

	public static void main(String[] args) {
		String s = new String ("hello all good morning");
		int x,count=0;
		for(x=0;x<s.length();x++)
		{
			if(s.charAt(x)=='a' || s.charAt(x)=='e'|| s.charAt(x)=='i' || s.charAt(x)=='o' || s.charAt(x)=='u')
			{
				count++;
				System.out.print(s.charAt(x)+" ");
			}
//			else if()
			
		}
		System.out.println();
		System.out.println(count);

	}

}
