package com.StudentManagementSystem.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentManagementSystem.entity.Student;
import com.StudentManagementSystem.service.Studentservice;

@Service
public class ServiceImpl implements Studentservice {
	
	@Autowired
	 com.StudentManagementSystem.repository. Studentrepository  Studentrepository;

	@Override
	public List<Student> getAllStudent() {
		
		List<Student> list=Studentrepository.findAll();
		return list;
	}
	
	public Student saveStudent(Student student) {
		return Studentrepository.save(student);
	}

	@Override
	public Student getById(int id) {
		
		return Studentrepository.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		Studentrepository.deleteById(id);
		
	}

	@Override
	public Student viewById(int id) {
        Optional<Student> studentOpt = Studentrepository.findById(id);
        if(studentOpt.isPresent()) {
            return studentOpt.get();
        } else {
            throw new IllegalArgumentException("Invalid student Id: " + id);
        }
    }
	
}
