package com.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentid;
	private String studentname;
	private String studentadress;
	private long studentmobile;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentadress() {
		return studentadress;
	}
	public void setStudentadress(String studentadress) {
		this.studentadress = studentadress;
	}
	public long getStudentmobile() {
		return studentmobile;
	}
	public void setStudentmobile(long studentmobile) {
		this.studentmobile = studentmobile;
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentadress=" + studentadress
				+ ", studentmobile=" + studentmobile + "]";
	}
	
}
