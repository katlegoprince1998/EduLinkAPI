package com.codeworld.EduLinkAPI.service;

import com.codeworld.EduLinkAPI.entity.Lecture;

import java.util.List;

public interface LectureService {
    Lecture saveLecture(Lecture lecture);
    List<Lecture> getAllLectures();
    Lecture getLectureById(Long lectureId);

}
