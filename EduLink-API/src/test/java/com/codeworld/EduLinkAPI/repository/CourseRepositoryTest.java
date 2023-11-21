package com.codeworld.EduLinkAPI.repository;

import com.codeworld.EduLinkAPI.entity.Course;
import com.codeworld.EduLinkAPI.entity.Department;
import com.codeworld.EduLinkAPI.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest

class CourseRepositoryTest {

    @Autowired
    private CourseRepository courseRepository;
    @Test

    public void saveCourse(){

        Department department = Department.builder()
                .name("Humanities")
                .code("HH2")
                .build();

         Course course = Course.builder()
                 .name("Office Admin")
                 .code("OA25")
                 .credit(55)
                 .department(department)
                 .build();
         courseRepository.save(course);
    }

}