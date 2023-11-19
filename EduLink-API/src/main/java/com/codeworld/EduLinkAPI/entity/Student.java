package com.codeworld.EduLinkAPI.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(
        name = "tbl_student",
        uniqueConstraints = {@UniqueConstraint(
                name = "unique_email",
                columnNames = "email_address"
        ), @UniqueConstraint(
                name = "unique_student_no",
                columnNames = "student_no"
        )}

)

public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    @Column(name = "id")
    private Long studentId;
    @Column(nullable = false)
    private String firstname;
    @Column(nullable = false)
    private String lastname;
    @Column(nullable = false, name = "email_address")
    private String email;
    @Column(nullable = false, name = "student_no")
    private int studentNo;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id", referencedColumnName = "course_id")
    private Course course;


    @Embedded
    private Kinsman kinsman;

    @Embedded
    private Qualification qualification;
}
