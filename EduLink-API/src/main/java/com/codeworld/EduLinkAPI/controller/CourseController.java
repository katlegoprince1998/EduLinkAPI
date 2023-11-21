package com.codeworld.EduLinkAPI.controller;

import com.codeworld.EduLinkAPI.entity.Course;
import com.codeworld.EduLinkAPI.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;
    @GetMapping("edulinkapi/courses")
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();

    }
    @GetMapping("/edulinkapi/course/{id}")
    public Course getCourseById(@PathVariable("id") Long courseId){
        return courseService.getCourseById(courseId);
    }
}
