package com.codeworld.EduLinkAPI.controller;

import com.codeworld.EduLinkAPI.entity.Student;
import com.codeworld.EduLinkAPI.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/edulinkapi/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
    @GetMapping("/edulinkapi/student/{id}")
    public Student getStudentById(@PathVariable("id") Long studentId){
        return studentService.getStudentById(studentId);
    }
}
