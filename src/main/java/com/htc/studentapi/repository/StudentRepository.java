package com.htc.studentapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htc.studentapi.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
	
}
