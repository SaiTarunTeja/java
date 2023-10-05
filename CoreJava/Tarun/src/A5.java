
public class A5 {

	public static void main(String[] args) {
		int a[]=new int[] {60,30,80,10,40,130,100};
		for(int i=0;i<a.length;i=i+2) {
			for(int j=0;j<a.length;j=j+2) {
				if(a[i]<a[j]) {
					int temp = a[i];
					a[i]=a[j];
					a[j] = temp;
				}
			}
		}
		for(int i=1;i<a.length;i=i+2) {
			for(int j=1;j<a.length;j=j+2) {
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i]=a[j];
					a[j] = temp;
				}
			}
		}
		
		for(int t:a) {
			System.out.println(t);
		}
	}
}
