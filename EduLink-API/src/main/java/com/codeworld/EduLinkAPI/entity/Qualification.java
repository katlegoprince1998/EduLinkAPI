package com.codeworld.EduLinkAPI.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.File;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Qualification {
    @Column(
            nullable = false,
            name = "highest_achieved_qualification"
    )
    private String highestAchievedQualification;
    @Column(
            nullable = false,
            name = "school_name"
    )
    private String schoolName;
    @Column(
            nullable = false,
            name = "gpa"
    )
    private int gpa;
}
