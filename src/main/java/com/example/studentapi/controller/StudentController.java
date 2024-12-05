package com.example.studentapi.controller;

import com.example.studentapi.model.Student;
import com.example.studentapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/student")
    public String bonjour() {return "bonjour étudiant";}

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping("/all")
    public List<Student> getStudents() {
        return studentService.getAllStudents();
    }
}
