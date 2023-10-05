package SocialCoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EnhancedSwitch {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter Day Name");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String day = br.readLine();
		newStyle(day);
		newStyle(day);

	}
	public static void oldStyle(String day)
	{
		 
		switch (day.toLowerCase()) 
		{
		    case "monday":
		    case "friday": System.out.println("weekday"); break;
		    case "sunday": System.out.println("weekend"); break;
		    default:
		        throw new IllegalStateException("Hmm?");
		}
	}
	public static void newStyle(String day)
	{
		 switch (day) 
		 {
         	case "monday", "friday" ->{ System.out.println("Weekday");}
         	case "sunday" ->{ System.out.println("Weekend");}
         	default -> throw new IllegalStateException("Hmm?");
		 }		
	}
}
