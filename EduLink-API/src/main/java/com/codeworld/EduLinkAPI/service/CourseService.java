package com.codeworld.EduLinkAPI.service;

import com.codeworld.EduLinkAPI.entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> getAllCourses();
    Course getCourseById(Long courseId);

}
