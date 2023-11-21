package com.codeworld.EduLinkAPI.service;

import com.codeworld.EduLinkAPI.entity.Module;
import com.codeworld.EduLinkAPI.repository.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModuleServiceImplementation implements ModuleService{
    @Autowired
    private ModuleRepository moduleRepository;

    @Override
    public List<Module> getAllModules() {
        return moduleRepository.findAll();
    }

    @Override
    public Module getModuleById(Long moduleId) {
        return moduleRepository.findById(moduleId).get();
    }
}
