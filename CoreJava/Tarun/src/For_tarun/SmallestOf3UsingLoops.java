package For_tarun;

public class SmallestOf3UsingLoops {

	public static void main(String[] args) {
//		Smallest Of Three Using Loops
		int a=255,b=22,c=5,count=0;
		int d=a+b+c;
		for(int i=1;i<d;i++)
		{
			if(a!=0&&b!=0&&c!=0)
			{
				--a;
				--b;
				--c;
				++count;
			}
		}
		System.out.println(count);
//		Greatest Of Three Using Loops
		int a1=255,b1=22,c1=5,count1=0;
		int d1=a1+b1+c1;
		for(int i=1;i<d;i++)
		{
			if(a1>0||b1>0||c1>0)
			{
				--a1;
				--b1;
				--c1;
				++count1;
			}
		}
		System.out.println(count1);

	}

}
