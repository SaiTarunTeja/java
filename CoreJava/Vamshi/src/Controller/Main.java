package Controller;

import java.sql.*;
import java.util.*;

import DTO.Employee;
import Factory.EmployeeServiceFactory;
import Service.EmployeeService;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static Employee employee = new Employee();
	static EmployeeService employeeservice = EmployeeServiceFactory.getEmployeeService();
	public static void main(String[] args) throws Exception {
		System.out.println("Welcome To EmployeeManagement Application");
		
		while(true)
		{
			
			System.out.println("1.Add Employee");
			System.out.println("2.Update Employee");
			System.out.println("3.Delete Employee");
			System.out.println("4.Display Employee");
			System.out.println("5.Exit");
			System.out.println("Enter your option");
			int option = sc.nextInt();
			switch(option)
			{
				case 1:
					employeedetails();
					int rows = employeeservice.add(employee);
					if(rows>=1)
					{
						System.out.println("Employee Added Successfully");
					}
					else
					{
						System.out.println("Employee Not added Please Try again later");
					}
				break;
				case 2:
				{
					employeedetails();
					rows = employeeservice.update(employee);
					if(rows>=1)
					{
						System.out.println("Employee Updated Successfully");
					}
					else
					{
						System.out.println("Employee Not Updated Please Try again later");
					}
				break;
				}
				case 3:
				{
					System.out.println("Enter EmployeeId");
					int eid= sc.nextInt();
					employee.setEid(eid);
					rows = employeeservice.delete(eid);
					if(rows>=1)
					{
						System.out.println("deleted Succesfully");
					}
					else
					{
						System.out.println("please Try again Later");
					}
				break;
				}
				case 4 :
				{
					employeeservice.display();
				break;
				}
				case 5:
				{
					System.out.println("Thank you And Visit Again");
					System.exit(0);
				}
				default :
				{
					System.out.println("Enter valid Option");
				}
			}
			
		}
	}
	public static void employeedetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter EmployeeId");
		int eid = sc.nextInt();
		System.out.println("Enter Employee Name");
		String ename = sc.next();
		System.out.println("Enter Employee Department");
		String edept = sc.next();
		System.out.println("Enter Employee Mobile Number");
		double emobile = sc.nextDouble();
		employee.setEid(eid);
		employee.setEname(ename);
		employee.setEdept(edept);
		employee.setEmobile(emobile);
	}

}
