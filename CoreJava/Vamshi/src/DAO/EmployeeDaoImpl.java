package DAO;

import java.sql.*;
import DTO.Employee;
import Factory.ConnectionFactory;

public class EmployeeDaoImpl implements EmployeeDao 
{

	@Override
	public int add(Employee employee) throws Exception {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement ps = con.prepareStatement("Insert into Employee1 values(?,?,?,?)");
		ps.setInt(1, employee.getEid());
		ps.setString(2, employee.getEname());
		ps.setString(3, employee.getEdept());
		ps.setDouble(4, employee.getEmobile());
		int rows = ps.executeUpdate();
		return rows;
	}

	@Override
	public int update(Employee employee) throws Exception {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement ps = con.prepareStatement("update employee1 set ename=?,edapt=?,emobile=? where eid=?");
		ps.setString(1, employee.getEname());
		ps.setString(2, employee.getEdept());
		ps.setDouble(3, employee.getEmobile());
		ps.setInt(4, employee.getEid());
		int rows = ps.executeUpdate();
//		System.out.println(ps.executeUpdate());
		return rows;
	}

	@Override
	public int delete(int eid) throws Exception {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement ps = con.prepareStatement("Delete from employee1 where eid=?");
		ps.setInt(1, eid);
		int rows = ps.executeUpdate();
		return rows;
	}

	@Override
	public void display() throws Exception {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement ps = con.prepareStatement("Select * from employee1");
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			System.out.print(rs.getInt(1)+" ");
			System.out.print(rs.getString(2)+" ");
			System.out.print(rs.getString(3)+" ");
			System.out.print(rs.getDouble(4)+" ");
			System.out.println();
		}
	}
	
}
