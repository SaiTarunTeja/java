package Reiteration;

public class StringSort {

	public static void main(String[] args) {
		String[] name= {"vamshi","sai","zan"};
		String temp="";
		for(int i=0;i<name.length;i++)
		{
			for(int j=0;j<name.length;j++)
			{
				if(name[i].compareToIgnoreCase(name[j]) <0)
				{
				  temp=name[i];
				  name[i]=name[j];
				  name[j]=temp;
				}
			}
		}
		for(String te:name)
			System.out.print(te+"  ");

	}

}



