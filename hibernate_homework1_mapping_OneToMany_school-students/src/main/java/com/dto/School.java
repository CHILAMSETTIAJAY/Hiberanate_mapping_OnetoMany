package com.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class School {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int schoolid;
	private String schoolname;
	private String schooladress;
	private long schoolmobile;
	
	@OneToMany
	List<Student> students;

	public int getSchoolid() {
		return schoolid;
	}

	public void setSchoolid(int schoolid) {
		this.schoolid = schoolid;
	}

	public String getSchoolname() {
		return schoolname;
	}

	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}

	public String getSchooladress() {
		return schooladress;
	}

	public void setSchooladress(String schooladress) {
		this.schooladress = schooladress;
	}

	public long getSchoolmobile() {
		return schoolmobile;
	}

	public void setSchoolmobile(long schoolmobile) {
		this.schoolmobile = schoolmobile;
	}


	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return students;
	}

	@Override
	public String toString() {
		return "School [schoolid=" + schoolid + ", schoolname=" + schoolname + ", schooladress=" + schooladress
				+ ", schoolmobile=" + schoolmobile + ", students=" + students + "]";
	}
	
	
}
