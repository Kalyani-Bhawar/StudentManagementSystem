package com.StudentManagementSystem.service;

import java.util.List;

import com.StudentManagementSystem.entity.Student;

public interface Studentservice {
	
	public List<Student> getAllStudent();
	
	public Student saveStudent(Student student);
	
	public Student getById(int id);
	
	public void deleteById(int id);
	
	public Student viewById(int id);
	
	}
