package DAO;

import DTO.Employee;
import java.sql.*;

public interface EmployeeDao 
{
	public int add(Employee employee) throws Exception;
	public int update(Employee employee) throws Exception;
	public int delete(int eid) throws Exception;
	public void display() throws Exception;
}
