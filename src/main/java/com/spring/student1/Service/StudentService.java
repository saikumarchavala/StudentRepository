package com.spring.student1.Service;

import java.util.List;

import com.spring.student1.Entity.Student;

public interface StudentService {

	public Student saveStudent(Student student);


	public List<Student> getAllStudentList();


	public Student getStudentById(Long studentId);


	public void deleteStudentById(Long studentId);


	public Student updateStudentById(Long studentId, Student student);


	public Student getStudentByName(String studentName);

	








	

	



}
