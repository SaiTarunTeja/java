package InterviewQuestions;
import java.io.*;
public class StringSpaceRemoval 
{
	public static void main(String[] args) throws IOException {
		System.out.println("Enter String");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String givenString = br.readLine();
		System.out.println(replaceAllMethod(givenString));
		System.out.println(trimMethod(givenString));	
	}
	public static String replaceAllMethod(String givenString)
	{
		return  givenString.replaceAll("\\s","");
	}
	public static String trimMethod(String givenString)
	{
		return givenString.trim();
	}
}
