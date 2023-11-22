package com.codeworld.EduLinkAPI.service;

import com.codeworld.EduLinkAPI.entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> getAllCourses();
    Course getCourseById(Long courseId);
    void deleteCourseById(Long courseId);
    Course updateCourse(Course course, Long courseId);
    Course saveCourse(Course course);

}
