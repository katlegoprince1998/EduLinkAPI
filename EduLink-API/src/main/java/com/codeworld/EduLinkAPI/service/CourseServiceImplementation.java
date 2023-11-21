package com.codeworld.EduLinkAPI.service;

import com.codeworld.EduLinkAPI.entity.Course;
import com.codeworld.EduLinkAPI.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CourseServiceImplementation implements CourseService{
    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course getCourseById(Long courseId) {
        return courseRepository.findById(courseId).get();
    }
}
