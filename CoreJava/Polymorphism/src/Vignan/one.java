package Vignan;

public class one {

	public static void main(String[] args) {
		main2.m1();

	}

}
class main1
{
	public static void m1()
	{
		String day = "fri";
		String time="";
		switch(day)
		{
		    case "mon" ,"fri":      time="6am"; break;
		    case "wed":              time="8am";break;
		    default :                 time="7am";
		}
		System.out.println(time);
	}
}
class main2
{
	public static void m1()
	{
		String day = "wed";
		String time="";
		switch(day)
		{
		    case "mon" ,"fri" -> time="6am";
		    case "wed" ->  time="8am";
		    default -> time="7am";
		}
		System.out.println(time);
	}
}