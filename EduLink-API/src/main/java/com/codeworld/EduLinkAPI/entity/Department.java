package com.codeworld.EduLinkAPI.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(
        name = "tbl_department"
)

public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
    @Column(
            nullable = false
    )
    private String name;
    @Column(
            nullable = false
    )
    private String code;
}
