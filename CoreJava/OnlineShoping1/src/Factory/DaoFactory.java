package Factory;

import dao.*;

public class DaoFactory 
{
	static UserDao d = new UserDaoImpl();
	public static UserDao getDao()
	{
		return d;
	}
	
}
