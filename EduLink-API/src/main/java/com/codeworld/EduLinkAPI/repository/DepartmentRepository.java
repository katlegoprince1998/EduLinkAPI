package com.codeworld.EduLinkAPI.repository;

import com.codeworld.EduLinkAPI.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{
}
