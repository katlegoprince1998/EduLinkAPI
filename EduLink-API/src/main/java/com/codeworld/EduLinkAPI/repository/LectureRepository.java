package com.codeworld.EduLinkAPI.repository;

import com.codeworld.EduLinkAPI.entity.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LectureRepository extends JpaRepository<Lecture, Long> {
    List<Lecture> findByFirstnameIgnoreCase(String firstname);
    @Query("select l from Lecture l where l.email = ?1")
    Lecture findByEmailAddress(String email);
}
