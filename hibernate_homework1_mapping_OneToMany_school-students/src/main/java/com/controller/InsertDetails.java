package com.controller;

import java.util.ArrayList;
import java.util.List;

import com.dao.Schooldao;
import com.dto.School;
import com.dto.Student;

public class InsertDetails {

	public static void main(String[] args) {
		
		School school = new School();
		school.setSchoolname("Resonance");
		school.setSchooladress("Khammam");
		school.setSchoolmobile(9638452175l);
		
		Student student1 = new Student();
		student1.setStudentname("Ajay");
		student1.setStudentadress("Khammam");
		student1.setStudentmobile(8972541632l);
		
		Student student2 = new Student();
		student2.setStudentname("Shiva");
		student2.setStudentadress("Hyderabad");
		student2.setStudentmobile(8551526555l);
		
		Student student3 = new Student();
		student3.setStudentname("Rajesh");
		student3.setStudentadress("Bhalepali");
		student3.setStudentmobile(4545541632l);
		
		List<Student> list = new ArrayList<Student>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		
		school.setStudents(list);
		
		Schooldao schooldao = new Schooldao();
		schooldao.insertDetails(school);
		System.out.println("Data Inserted");
	}

}
