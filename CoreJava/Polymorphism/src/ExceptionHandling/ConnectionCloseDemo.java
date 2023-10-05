package ExceptionHandling;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionCloseDemo {
	
	public static void main(String[] args)
	{
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try
		{
			//Do Stuff
		}
		catch(Exception ex)
		{
			//Exception Handling Stuff
		}
		finally
		{
			try
			{
				rs.close();
			}
			catch(SQLException e)
			{
				//ignored
			}
			try
			{
				ps.close();
			}
			catch(SQLException e)
			{
				//ignored
			}
			try
			{
				con.close();
			}
			catch(SQLException e)
			{
				//ignored
			}
		}
	}

}
