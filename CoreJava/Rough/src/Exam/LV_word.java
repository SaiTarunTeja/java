package Exam;
import java.util.Scanner;
public class LV_word {

	public static void main(String[] args) {
		String s=new String("HAPPY NEW YEAR ");
		String[] a=s.split(" ");
		String h_vowel=new String("");
		int x,y,count1=0,count2=0;
		for(x=0;x<a.length;x++)
		{
			count1=0;
			for(y=0;y<a[x].length();y++)
			{
				if(a[x].charAt(y)=='A' || a[x].charAt(y)=='E' || a[x].charAt(y)=='I'|| a[x].charAt(y)=='O'|| a[x].charAt(y)=='U')
				{
					count1++;
				}
			}
			if(count1>count2)
			{
				count2=count1;
				h_vowel=a[x];
			}
		}
		System.out.println(h_vowel);
		

	}

}
