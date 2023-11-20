package com.codeworld.EduLinkAPI.service;

import com.codeworld.EduLinkAPI.entity.Lecture;
import com.codeworld.EduLinkAPI.repository.LectureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class LectureServiceImplementation implements LectureService{
    @Autowired
    private LectureRepository lectureRepository;
    @Override
    public Lecture saveLecture(Lecture lecture) {
        return lectureRepository.save(lecture);
    }
    @Override
    public List<Lecture> getAllLectures() {
        return lectureRepository.findAll();
    }

    @Override
    public Lecture getLectureById(Long lectureId) {
        return lectureRepository.findById(lectureId).get();
    }

}
