package com.codeworld.EduLinkAPI.controller;

import com.codeworld.EduLinkAPI.entity.Course;
import com.codeworld.EduLinkAPI.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/edulinkapi/save")
    public Course saveCourse(Course course){
        return courseService.saveCourse(course);
    }

    @DeleteMapping("/edulinkapi/delete/{id}")
    public String deleteCourse(@PathVariable("id") Long courseId){
        courseService.deleteCourseById(courseId);
        return "Course Deleted Successfully";
    }

    @PutMapping("/edulinkapi/update/{id}")
    public Course updateCourse(@RequestBody Course course, @PathVariable("id") Long courseId){
        return courseService.updateCourse(course, courseId);
    }

}
