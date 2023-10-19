package com.controller;

import java.util.ArrayList;
import java.util.List;

import com.dao.Companydao;
import com.dto.Company;
import com.dto.Employee;

public class InsertDetails {

	private static final int ArrayList = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company company = new Company();
		company.setCompanyname("UNISYS");
		company.setCompanyaddress("Hyderabad");
		company.setCompanymobile(951234658l);
		company.setCompanyemail("norply@unisys.com");
		
		Employee employee = new Employee();
		employee.setEmpolyeename("Abhilash");
		employee.setEmployeeage(22);
		employee.setEmployeesalary(70000);
		employee.setEmpolyeeaddress("Suryapet");
		employee.setEnployeemobile(8963251475l);
		
		Employee employee1 = new Employee();
		employee1.setEmpolyeename("Samara");
		employee1.setEmployeeage(22);
		employee1.setEmployeesalary(45000);
		employee1.setEmpolyeeaddress("Chaitanyapuri");
		employee1.setEnployeemobile(98745633210l);
		
		Employee employee2 = new Employee();
		employee2.setEmpolyeename("Abhi");
		employee2.setEmployeeage(20);
		employee2.setEmployeesalary(44000);
		employee2.setEmpolyeeaddress("Panama");
		employee2.setEnployeemobile(5654556850l);
		
		List<Employee> list =new ArrayList<Employee>();
		list.add(employee);
		list.add(employee1);
		list.add(employee2);
		
		company.setEmployees(list);
		
		Companydao companydao = new Companydao();
		companydao.insertDetails(company);
		
		System.out.println("Data Inserted");

	}

}
