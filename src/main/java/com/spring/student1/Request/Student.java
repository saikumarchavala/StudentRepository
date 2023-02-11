package com.spring.student1.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
@Table
@Entity
public class Student {
 @Id
 @GeneratedValue(strategy=GenerationType.AUTO)	
  private Long studentId;
 @NotBlank(message="please add the student name")
  private String studentName;
  private String studentAddress;
  private String studentCode;
  
public Long getStudentId() {
	return studentId;
}
public void setStudentId(Long studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStudentAddress() {
	return studentAddress;
}
public void setStudentAddress(String studentAddress) {
	this.studentAddress = studentAddress;
}
public String getStudentCode() {
	return studentCode;
}
public void setStudentCode(String studentCode) {
	this.studentCode = studentCode;
}
public Student(Long studentId, String studentName, String studentAddress, String studentCode) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.studentAddress = studentAddress;
	this.studentCode = studentCode;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
			+ ", studentCode=" + studentCode + "]";

}
  
	
	
	
	
}
