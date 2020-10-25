package com.sdh.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sdh.entity.Student;
import com.sdh.service.IStudentService;


@Controller
public class StudentController{
	@Autowired
	IStudentService studentService;

	@RequestMapping("/queryStudentById/{stuno}")
	public String queryStudentById(@PathVariable("stuno") Integer stuNo, Map<String,Object> m) {
		Student stu = studentService.queryStudentById(stuNo);
		m.put("stu", stu);
	//	return "/views/result.jsp";
		return "result";
	}

}
