package com.spring.student1.Controller;

import java.util.List;

import javax.validation.Valid;

import org.apache.logging.log4j.LogBuilder;
import org.apache.logging.log4j.Logger;
import org.slf4j.ILoggerFactory;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.student1.Entity.Student;
import com.spring.student1.Service.StudentService;

@RestController
public class StudentController {
	private final ILoggerFactory loggger=LoggerFactory.getILoggerFactory();
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/students")
	public Student saveStudent(@Valid @RequestBody Student student) {
		org.jboss.logging.Logger.getLogger("Inside of Save Student of Student Controller");
		return studentService.saveStudent(student);
	}
     @GetMapping("/students")
     public List<Student> getAllStudentList(){
    	 return studentService.getAllStudentList();
     }
     @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable("id") Long studentId) {
	return studentService.getStudentById(studentId);
  }
       @DeleteMapping("/students/{id}")
      public String deleteStudentById(@PathVariable("id") Long studentId) {
    	  studentService.deleteStudentById(studentId);
    	  return "student deleted Successfully!!";
    	  
      }
       @PutMapping("/students/{id}")
     public Student updateStudentById(@PathVariable("id") Long studentId,@RequestBody Student student)
      { 
         return studentService.updateStudentById(studentId,student);
      }  
         @GetMapping("/students/name/{name}")
        public Student getStudentByName(@PathVariable("name") String studentName ) {
       	 return studentService.getStudentByName(studentName);
      
         
      }
      }	 
     
