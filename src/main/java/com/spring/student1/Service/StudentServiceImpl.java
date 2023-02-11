package com.spring.student1.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.student1.Entity.Student;
import com.spring.student1.Repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student) ;

	}

	@Override
  public List<Student> getAllStudentList() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	
	
	}

	@Override
	public Student getStudentById(Long studentId) {
		// TODO Auto-generated method stub
		return studentRepository.findById(studentId).get();
	
	}

	@Override
	public void deleteStudentById(Long studentId) {
		// TODO Auto-generated method stub
		 studentRepository.deleteById(studentId);
	}

	/**
	 *
	 */
	@Override
	public Student updateStudentById(Long studentId, Student student) {
		// TODO Auto-generated method stub
		Student sDB=studentRepository.findById(studentId).get();
	
		if(Objects.nonNull(student.getStudentName())&&!"".equalsIgnoreCase(student.getStudentName()))
				{
		sDB.setStudentName(student.getStudentName());
		}if(Objects.nonNull(student.getStudentAddress())&&!"".equalsIgnoreCase(student.getStudentAddress()))
		{
	         sDB.setStudentAddress(student.getStudentAddress());
}      if(Objects.nonNull(student.getStudentCode())&&!"".equalsIgnoreCase(student.getStudentCode()))
{
        sDB.setStudentCode(student.getStudentCode());
        return studentRepository.save(sDB);
}
           return sDB;
	}

	@Override
	public Student getStudentByName(String studentName) {
		// TODO Auto-generated method stub
	return studentRepository.findByStudentNameIgnoreCase(studentName);
	
	}

}
	


