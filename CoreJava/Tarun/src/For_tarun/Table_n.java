package For_tarun;

import java.io.*;

public class Table_n {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("What Table do you do you want to print");
		int table = Integer.parseInt(br.readLine());
		for(int x=1;x<=10;x++)
			System.out.println(table+"x"+x+"="+table*x);
//		int number=3,power=5,result=1;
//		for(int x=0;x<power;x++)
//		{
//			result=result*number;
//		}
//		System.out.println(result);

	}

}
