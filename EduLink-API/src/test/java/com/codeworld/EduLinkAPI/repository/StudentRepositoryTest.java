package com.codeworld.EduLinkAPI.repository;

import com.codeworld.EduLinkAPI.entity.Course;
import com.codeworld.EduLinkAPI.entity.Kinsman;
import com.codeworld.EduLinkAPI.entity.Qualification;
import com.codeworld.EduLinkAPI.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest

class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;
    @Test
    public void saveStudentWithCourse(){

        Random random = new Random();

        Qualification qualification = Qualification.builder()
                .highestAchievedQualification("National Senior Certificate")
                .schoolName("Siyifunile Secondary School")
                .gpa(24)
                .build();

        Kinsman kinsman = Kinsman.builder()
                .fullname("Monica Komane")
                .email("komanemonica@gmail.com")
                .cellNumber("079858545")
                .build();

        Course course = Course.builder()
                .name("Human Resource Management")
                .code("HR125")
                .credit(16)
                .build();

        Student student = Student.builder()
                .firstname("Thabile")
                .lastname("Mmala")
                .email("mmala@gmail.com")
                .studentNo(random.nextInt(200000000, 999999999))
                .course(course)
                .kinsman(kinsman)
                .qualification(qualification)
                .build();

        studentRepository.save(student);
    }

}