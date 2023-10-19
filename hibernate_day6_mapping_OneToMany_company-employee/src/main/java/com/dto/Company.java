package com.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int companyid;
	private String companyname;
	private String companyaddress;
	private long companymobile;
	private String companyemail;
	
	@OneToMany
	List<Employee> employees;
	
    
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public int getCompanyid() {
		return companyid;
	}
	public void setCompanyid(int companyid) {
		this.companyid = companyid;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getCompanyaddress() {
		return companyaddress;
	}
	public void setCompanyaddress(String companyaddress) {
		this.companyaddress = companyaddress;
	}
	public long getCompanymobile() {
		return companymobile;
	}
	public void setCompanymobile(long companymobile) {
		this.companymobile = companymobile;
	}
	public String getCompanyemail() {
		return companyemail;
	}
	public void setCompanyemail(String companyemail) {
		this.companyemail = companyemail;
	}
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employees;
	}
	@Override
	public String toString() {
		return "Company [companyid=" + companyid + ", companyname=" + companyname + ", companyaddress=" + companyaddress
				+ ", companymobile=" + companymobile + ", companyemail=" + companyemail + ", employees=" + employees
				+ "]";
	}


	
	

}
