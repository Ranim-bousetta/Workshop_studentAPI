package com.example.studentapi.service;

import com.example.studentapi.model.Student;
import com.example.studentapi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
   @Autowired
   private StudentRepository studentRepository;
   public StudentService(StudentRepository studentRepository) {
      super();
      this.studentRepository = studentRepository;
   }
   public List<Student> getAllStudents() {return studentRepository.findAll();}
}
