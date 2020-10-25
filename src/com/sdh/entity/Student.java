package com.sdh.entity;

public class Student {
	public Student() {
		System.out.println("ππ‘Ïstudent");
	}
	private int stuNo;
	private String stuName;
	private int StuAge;
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getStuAge() {
		return StuAge;
	}
	public void setStuAge(int stuAge) {
		StuAge = stuAge;
	}
	
	
}
