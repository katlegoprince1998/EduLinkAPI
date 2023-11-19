package com.codeworld.EduLinkAPI.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(
        name = "tbl_course",
        uniqueConstraints = @UniqueConstraint(
                name = "unique_name",
                columnNames = "course_name"
        )
)

public class Course {
    @Id
    @SequenceGenerator(
            name = "course_sequence",
            sequenceName = "course_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "course_sequence"
    )
    @Column(
            name = "course_id"
    )
    private Long courseId;
    @Column(
            nullable = false,
            name = "course_name"

    )
    private String name;
    @Column(
            nullable = false
    )
    private String code;
    @Column(
            nullable = false
    )
    private int credit;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "departmentId", referencedColumnName = "departmentId")
    private Department department;


}
