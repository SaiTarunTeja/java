package Factory;

import Service.EmployeeService;
import Service.EmployeeServiceImpl;

public class EmployeeServiceFactory 
{
	static EmployeeService employeeservice = new EmployeeServiceImpl();
	public static EmployeeService getEmployeeService()
	{
		return employeeservice;
	}
}