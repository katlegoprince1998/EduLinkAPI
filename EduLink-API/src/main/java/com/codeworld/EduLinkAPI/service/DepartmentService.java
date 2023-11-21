package com.codeworld.EduLinkAPI.service;

import com.codeworld.EduLinkAPI.entity.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> getAllDepartments();
    Department getDepartmentById(Long departmentId);
}
