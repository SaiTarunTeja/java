package Game;
import java.util.*;
public class NP {

	public static void main(String[] args) {
		G1 g=new G1();
		g.p1();

	}

}
class G1
{
	Scanner sc= new Scanner(System.in);
	public void p1()
	{
		System.out.println("Enter Any Number");
		int num=sc.nextInt();
		int pow=1,x=0;
//		while(pow<num/2)
//		{
//			pow=pow*2;
//			x++;
//		}
		while(pow*2<num)
		{
			pow=pow*2;
			x++;
		}
		System.out.println(pow);
//		System.out.println((num-pow)*2+1);
	}
}