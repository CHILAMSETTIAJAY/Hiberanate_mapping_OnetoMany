package com.controller;

import java.util.ArrayList;
import java.util.List;

import com.dao.Schooldao;
import com.dto.School;
import com.dto.Student;

public class UpdateDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School school = new School();
		school.setSchoolname("GNITC");
		school.setSchooladress("Hyderabad");
		school.setSchoolmobile(79856321452l);
		
		Student student1 = new Student();
		student1.setStudentid(10);
		student1.setStudentname("Ajay");
		student1.setStudentadress("Bhagyalatha");
		student1.setStudentmobile(8972541632l);
		
		Student student2 = new Student();
		student2.setStudentid(11);
		student2.setStudentname("Omsai");
		student2.setStudentadress("Khammam");
		student2.setStudentmobile(2255226555l);
		
		Student student3 = new Student();
		student3.setStudentid(12);
		student3.setStudentname("Teja");
		student3.setStudentadress("Chaitanhyapuri");
		student3.setStudentmobile(7896542632l);
		
		List<Student> list = new ArrayList<Student>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		
		school.setStudents(list);
		
		Schooldao schooldao = new Schooldao();
		schooldao.updateDetails(4, school);;
		System.out.println("Data updated");

	}

}
