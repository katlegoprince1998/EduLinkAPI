package com.codeworld.EduLinkAPI.repository;

import com.codeworld.EduLinkAPI.entity.Module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuleRepository extends JpaRepository<Module, Long> {
}
