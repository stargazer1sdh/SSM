package com.sdh.mapper;

import com.sdh.entity.Student;

public interface StudentMapper {
	void addStudent(Student stu);

	Student queryStudentById(int stuNo);
}
