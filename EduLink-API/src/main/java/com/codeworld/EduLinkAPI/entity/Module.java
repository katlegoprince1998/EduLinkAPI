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
        name = "tbl_module"
)

public class Module {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long moduleId;
    private String name;
    private String code;
    private String description;
    private int credit;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id",
            referencedColumnName = "course_id"
    )
    private Course course;
}
