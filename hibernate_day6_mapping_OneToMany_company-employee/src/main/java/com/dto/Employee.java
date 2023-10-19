package com.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeid;
	private String empolyeename;
	private int employeeage;
	private double employeesalary;
	private long enployeemobile;
	private String empolyeeaddress;
	
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmpolyeename() {
		return empolyeename;
	}
	public void setEmpolyeename(String empolyeename) {
		this.empolyeename = empolyeename;
	}
	public int getEmployeeage() {
		return employeeage;
	}
	public void setEmployeeage(int employeeage) {
		this.employeeage = employeeage;
	}
	public double getEmployeesalary() {
		return employeesalary;
	}
	public void setEmployeesalary(double employeesalary) {
		this.employeesalary = employeesalary;
	}
	public long getEnployeemobile() {
		return enployeemobile;
	}
	public void setEnployeemobile(long enployeemobile) {
		this.enployeemobile = enployeemobile;
	}
	public String getEmpolyeeaddress() {
		return empolyeeaddress;
	}
	public void setEmpolyeeaddress(String empolyeeaddress) {
		this.empolyeeaddress = empolyeeaddress;
	}
	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", empolyeename=" + empolyeename + ", employeeage=" + employeeage
				+ ", employeesalary=" + employeesalary + ", enployeemobile=" + enployeemobile + ", empolyeeaddress="
				+ empolyeeaddress + "]";
	}
	
	
	
}
