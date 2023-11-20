package com.codeworld.EduLinkAPI.controller;

import com.codeworld.EduLinkAPI.entity.Lecture;
import com.codeworld.EduLinkAPI.service.LectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LectureController {
    @Autowired
    private LectureService lectureService;
    @GetMapping("/")
    public String home(){
        return "Welcome To EduLink API";
    }
    @GetMapping("/edulinkapi/lecture")
    public List<Lecture> getAllLectures(){
        return lectureService.getAllLectures();
    }
    @GetMapping("/edulinkapi/lecture/{id}")
    public Lecture getLectureById(@PathVariable("id") Long lectureId){
        return lectureService.getLectureById(lectureId);
    }
    @PostMapping("/edulinkapi/lecture/create")
    public Lecture createLecture(@RequestBody  Lecture lecture){
        return lectureService.saveLecture(lecture);
    }

}

