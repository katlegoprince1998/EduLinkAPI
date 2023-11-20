package com.codeworld.EduLinkAPI.repository;

import com.codeworld.EduLinkAPI.entity.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LectureRepository extends JpaRepository<Lecture, Long> {
}
