package DTO;

import java.sql.ResultSet;

public class Employee {
	private int eid;
	private String ename,edept;
	private double emobile;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEdept() {
		return edept;
	}
	public void setEdept(String edept) {
		this.edept = edept;
	}
	public double getEmobile() {
		return emobile;
	}
	public void setEmobile(double emobile) {
		this.emobile = emobile;
	}
	public ResultSet display() {
		// TODO Auto-generated method stub
		return null;
	}

}
