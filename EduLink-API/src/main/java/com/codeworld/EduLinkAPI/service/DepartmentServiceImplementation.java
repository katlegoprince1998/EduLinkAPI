package com.codeworld.EduLinkAPI.service;

import com.codeworld.EduLinkAPI.entity.Department;
import com.codeworld.EduLinkAPI.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class DepartmentServiceImplementation implements DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }
}
