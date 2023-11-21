package com.codeworld.EduLinkAPI.repository;

import com.codeworld.EduLinkAPI.entity.Department;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class DepartmentRepositoryTest {
    @Autowired
    private DepartmentRepository departmentRepository;
    @Test
    public void saveDepartment(){
        Department department = Department.builder()
                .name("Communication")
                .code("CC35")
                .build();

        departmentRepository.save(department);
    }

}