package com.codeworld.EduLinkAPI.repository;

import com.codeworld.EduLinkAPI.entity.Course;
import com.codeworld.EduLinkAPI.entity.Lecture;
import com.codeworld.EduLinkAPI.entity.Module;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest

class ModuleRepositoryTest {
    @Autowired
    private ModuleRepository moduleRepository;
    @Test
    public void saveModuleWithCourse(){

        Lecture lecture = Lecture.builder()
                .firstname("Bob")
                .lastname("Makelane")
                .email("makelane@gmail.com")
                .title("Dr")
                .build();

        Course course = Course.builder()
                .name("Mechanical Engineering")
                .code("ME55")
                .credit(66)
                .build();

        Module module = Module.builder()
                .name("Maths")
                .code("MTH55")
                .credit(14)
                .description("Engineering maths")
                .course(course)
                .lecture(lecture)
                .build();

        moduleRepository.save(module);
    }

}