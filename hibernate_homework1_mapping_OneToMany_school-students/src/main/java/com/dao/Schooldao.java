package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.internal.build.AllowSysOut;

import com.dto.School;
import com.dto.Student;

public class Schooldao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Ajay");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public void insertDetails(School school) {
		List<Student> list = school.getStudents();
		
		entityTransaction.begin();
		entityManager.persist(school);
		for (Student student : list) {
			entityManager.persist(student);
		}
		entityTransaction.commit();
	}
	
	public void fetchDetails(int id) {
		School school = entityManager.find(School.class, id);
		List<Student> list = school.getStudents();
		System.out.println("------------------------------");
		System.out.println(school);
		System.err.println("------------------------------");
		for (Student student : list) {
			System.out.println(student);
		}
		System.out.println("------------------------------");
	}
	public void fetchAll() {
		Query query = entityManager.createQuery("Select s from School s");
		List<School> list = query.getResultList();
		System.out.println(list);
	}
	
	public void removeDetails(int schoolid) {
		School school = entityManager.find(School.class,schoolid);
		List<Student> list = school.getStudents();
		entityTransaction.begin();
		entityManager.remove(school);
		for (Student student : list) {
			entityManager.remove(student);
		}
		entityTransaction.commit();
	}
	public void updateDetails(int schoolid, School school) {
		school.setSchoolid(schoolid);
		List<Student> list = school.getStudents();
		entityTransaction.begin();
		entityManager.merge(school);
		for (Student student : list) {
			entityManager.merge(student);
		}
		entityTransaction.commit();
	}
}
