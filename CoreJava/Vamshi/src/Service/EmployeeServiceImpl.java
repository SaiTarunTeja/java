package Service;

import DTO.Employee;
import Factory.EmployeeDaoFactory;
import java.sql.*;
import DAO.EmployeeDao;

public class EmployeeServiceImpl implements EmployeeService
{

	@Override
	public int add(Employee employee) throws Exception {
		EmployeeDao employeedao = EmployeeDaoFactory.getEmployeeDao();
		int rows = employeedao.add(employee);
		return rows;
	}

	@Override
	public int update(Employee employee) throws Exception {
		EmployeeDao employeedao = EmployeeDaoFactory.getEmployeeDao();
		int rows = employeedao.update(employee);
		return rows;
	}

	@Override
	public int delete(int eid) throws Exception {
		EmployeeDao employeedao = EmployeeDaoFactory.getEmployeeDao();
		int rows = employeedao.delete(eid);
		return rows;
	}

	@Override
	public void display() throws Exception {
		EmployeeDao employeedao = EmployeeDaoFactory.getEmployeeDao();
		employeedao.display();		
	}	
}