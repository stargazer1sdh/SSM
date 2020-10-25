package com.sdh.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdh.entity.Student;
import com.sdh.mapper.StudentMapper;
import com.sdh.service.IStudentService;

@Service("studentService")
public class StudentServiceImpl implements IStudentService {
	//@Autowired
	@Resource
	private StudentMapper studentMapper;

	/*
	 * public void setStudentMapper(StudentMapper studentMapper) {
	 * this.studentMapper = studentMapper; }
	 */

	@Override
	public void addStudent(Student st) {
		studentMapper.addStudent(st);
	}

	@Override
	public Student queryStudentById(int stuNo) {
		return studentMapper.queryStudentById(stuNo);
	}

}
