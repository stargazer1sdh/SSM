package com.sdh.service;

import com.sdh.entity.Student;

public interface IStudentService {
	public void addStudent(Student st);

	public Student queryStudentById(int stuNo);
}
