package com.codeworld.EduLinkAPI.service;

import com.codeworld.EduLinkAPI.entity.Course;
import com.codeworld.EduLinkAPI.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

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

    @Override
    public void deleteCourseById(Long courseId) {
        courseRepository.deleteById(courseId);
    }

    @Override
    public Course updateCourse(Course course, Long courseId) {
        Course courseDb = courseRepository.findById(courseId).get();

        if(Objects.nonNull(course.getName()) &&
                !"".equalsIgnoreCase(course.getName())){
            courseDb.setName(course.getName());
        }

        if(Objects.nonNull(course.getCode()) &&
                !"".equalsIgnoreCase(course.getCode())){
                courseDb.setCode(course.getCode());
        }

        if(course.getCredit() != 0){
            courseDb.setCredit(course.getCredit());
        }
        return courseRepository.save(courseDb);
    }

    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }
}
