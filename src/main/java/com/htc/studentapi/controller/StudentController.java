package com.htc.studentapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htc.studentapi.model.Student;
import com.htc.studentapi.repository.StudentRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:8090")
public class StudentController {
	
	@Autowired
	private StudentRepository repo;
	
	@GetMapping("/student/{id}")
	Student getStudent(@PathVariable Long id){
		Student stud = repo.findById(id).get();
		return stud;
	}
	
	@PostMapping("/student")
	boolean registerStudent(@RequestBody Student s){
		repo.save(s);
		return true;
	}
	
	@GetMapping("/student")
	List<Student> getAllStudents() {
		List<Student> s = null;
		s = repo.findAll();
		return s;
	}
	
	@DeleteMapping("/student/{id}")
	boolean deleteStudent(@PathVariable Long id) {
		System.out.println(id);
		repo.deleteById(id);
		return true;
	}
	
	@PutMapping("/student")
	boolean updateStudent(@RequestBody Student s){
		repo.save(s);
		return true;
	}

}
