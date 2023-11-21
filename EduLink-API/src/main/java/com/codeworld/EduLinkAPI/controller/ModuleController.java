package com.codeworld.EduLinkAPI.controller;

import com.codeworld.EduLinkAPI.entity.Module;
import com.codeworld.EduLinkAPI.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ModuleController {
    @Autowired
    private ModuleService moduleService;
    @GetMapping("/edulinkapi/modules")
    public List<Module> getAllModules(){
        return moduleService.getAllModules();
    }
    @GetMapping("/edulink/module/{id}")
    public Module getModuleById(@PathVariable("id") Long moduleId){
        return moduleService.getModuleById(moduleId);
    }

}
