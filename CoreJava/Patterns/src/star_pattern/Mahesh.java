package star_pattern;
import java.util.*;
public class Mahesh {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Exam Status");
		String status = sc.next();
		if(status.equals("pass"))
		{
			System.out.println("Please Wait For further Round");
			System.out.println("Enter Round-1 Status");
			String round1status=sc.next();
			if(round1status.equals("pass"))
			{
				System.out.println("You cleared Round-1 Interview");
				System.out.println("Enter Round-2 Status");
				String round2status=sc.next();
				if(round2status.equals("pass"))
				{
					System.out.println("You cleared Round-2 Interview");
				}
				else
				{
					System.out.println("You Can Go To Home");
				}
			}
			else
			{
				System.out.println("You Can Go To Home");
			}
			
		}
		else
		{
			System.out.println("You Can Go To Home");
		}
	}

}
