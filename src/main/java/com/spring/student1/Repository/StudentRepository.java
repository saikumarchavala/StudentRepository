package com.spring.student1.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.student1.Entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {

public 	Optional<Student> findById(Long studentId);


public Student findByStudentName(String studentName);


public Student findByStudentNameIgnoreCase(String studentName);






	


}
