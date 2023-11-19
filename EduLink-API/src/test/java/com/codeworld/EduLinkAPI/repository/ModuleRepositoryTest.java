package com.codeworld.EduLinkAPI.repository;

import com.codeworld.EduLinkAPI.entity.Course;
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

        Course course = Course.builder()
                .name("Computer Science")
                .code("CS50")
                .credit(55)
                .build();

        Module module = Module.builder()
                .name("Software Development")
                .code("DSO34")
                .credit(14)
                .description("C++ module")
                .course(course)
                .build();

        moduleRepository.save(module);
    }

}