package Factory;

import DAO.*;

public class EmployeeDaoFactory
{
	static EmployeeDao employeedao = new EmployeeDaoImpl();
	public static EmployeeDao getEmployeeDao()
	{
		return employeedao;
	}
}
