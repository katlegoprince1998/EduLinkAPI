package com.codeworld.EduLinkAPI.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(
        name = "tbl_kinsman",
        uniqueConstraints = {@UniqueConstraint(

                name = "unique_email",
                columnNames = "email"
        ), @UniqueConstraint(
                name = "unique_cellNumber", columnNames = "cellNumber")}
)

@AttributeOverrides({
        @AttributeOverride(
                name = "fullname",
                column = @Column(name = "nok_fullnames")
        ),
        @AttributeOverride(
                name = "email",
                column = @Column(name = "nok_email")
        ),
        @AttributeOverride(
                name = "cellNumber",
                column = @Column(name = "nok_cell_number")
        )
})

public class Kinsman {
    @Column(
            name = "fullname",
            nullable = false
    )

    private String fullname;
    @Column(
            name = "email",
            nullable = false
    )
    private String email;
    @Column(
            name = "cellNumber",
            nullable = false
    )
    private String cellNumber;
}
