package com.controller;

import java.util.ArrayList;
import java.util.List;

import com.dao.Companydao;
import com.dto.Company;
import com.dto.Employee;

public class UpdateDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company company = new Company();
		company.setCompanyname("WIPRO");
		company.setCompanyaddress("Benguler");
		company.setCompanymobile(9874563215l);
		company.setCompanyemail("norply@wipro.com");
		
		Employee employee = new Employee();
		employee.setEmployeeid(4);
		employee.setEmpolyeename("Rahul");
		employee.setEmployeeage(25);
		employee.setEmployeesalary(40000);
		employee.setEmpolyeeaddress("Hyderabad");
		employee.setEnployeemobile(5469321588l);
		
		Employee employee1 = new Employee();
		employee1.setEmployeeid(5);
		employee1.setEmpolyeename("Kohli");
		employee1.setEmployeeage(22);
		employee1.setEmployeesalary(55000);
		employee1.setEmpolyeeaddress("Chaitanyapuri");
		employee1.setEnployeemobile(56489855665l);
		
		Employee employee2 = new Employee();
		employee2.setEmployeeid(6);
		employee2.setEmpolyeename("Dhoni");
		employee2.setEmployeeage(27);
		employee2.setEmployeesalary(54000);
		employee2.setEmpolyeeaddress("Hyderabad");
		employee2.setEnployeemobile(8555445555l);
		
		List<Employee> list =new ArrayList<Employee>();
		list.add(employee);
		list.add(employee1);
		list.add(employee2);
		
		company.setEmployees(list);
		
		Companydao companydao = new Companydao();
		
		companydao.updateDetails(2, company);
		
		System.out.println("Data updated");

	}

}
