package com.codeworld.EduLinkAPI.service;

import com.codeworld.EduLinkAPI.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student getStudentById(Long studentId);
}
