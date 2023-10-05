package Array;

public class ArmstrongPattern {

	public static void main(String[] args) {
		int starting=100,ending=8208,temp;
		for(int x=0;x<5;x++) {
			for(int y=0;y<=x;y++) {
				for(;starting<=ending;starting++) {
					temp=starting;
					int count=0;
					int reverse=0;
					for(;starting>0;starting/=10) {
						count++;
					}
					starting=temp;
					for(;starting>0;starting/=10) {
						int rem=starting%10;
					   reverse=(reverse)+(int)(Math.pow(rem,count));
					}
					starting=temp;
					//System.out.print(starting);
					if(reverse==starting) {
						System.out.print(starting+" ");
						starting++;
						break;
					}
					
				}
				
				
			}
			System.out.println();
		}

	}

}
