package com.codeworld.EduLinkAPI.service;

import com.codeworld.EduLinkAPI.entity.Module;

import java.util.List;

public interface ModuleService {
    List<Module> getAllModules();
    Module getModuleById(Long moduleId);

}
