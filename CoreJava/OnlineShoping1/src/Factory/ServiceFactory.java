package Factory;

import service.Service1;
import service.Service1Impl;

public class ServiceFactory 
{
	static Service1 service = new Service1Impl(); 
	public static Service1 getService() 
	{
		return service;
	}
}
