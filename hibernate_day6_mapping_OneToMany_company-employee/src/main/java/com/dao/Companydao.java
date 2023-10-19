package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.dto.Company;
import com.dto.Employee;

public class Companydao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Ajay");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void insertDetails(Company company) {

		List<Employee> list = company.getEmployees();

		entityTransaction.begin();
		entityManager.persist(company);
		for (Employee employee : list) {
			entityManager.persist(employee);
		}
		entityTransaction.commit();
	}

	public void fetchDetails(int companyid) {
		Company company = entityManager.find(Company.class, companyid);
		List<Employee> list = company.getEmployees();
		System.out.println("--------------------------------");
		System.out.println(company);
		System.out.println("--------------------------------");
		for (Employee employee : list) {
			System.out.println(employee);
		}

	}

	public void fetchAllDetails() {
		Query query = entityManager.createQuery("select s from Company s");
		List<Company> list = query.getResultList();
		System.out.println("--------------------------------");
		System.out.println(list);
		System.out.println("--------------------------------");
	}

	public void deleteDetails(int companyid) {

		Company company = entityManager.find(Company.class, companyid);
		List<Employee> list = company.getEmployees();
		entityTransaction.begin();
		entityManager.remove(company);
		for (Employee employee : list) {
			entityManager.remove(employee);
		}
		entityTransaction.commit();
		System.out.println("Company deleted");
	}
	
	public void updateDetails(int id , Company company) {
		company.setCompanyid(id);
		List<Employee> list= company.getEmployees();
		
		entityTransaction.begin();
		entityManager.merge(company);
		for (Employee employee : list) {
			entityManager.merge(employee);
		}
		entityTransaction.commit();
	}
}
