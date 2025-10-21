package com.wgcode.Student_Service.dto;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "students") // Specify table name if required
public class StudentDTO {

    @Id
    @SequenceGenerator(
            name = "student_service_sequence",
            sequenceName = "student_service_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_service_sequence"
    )
    private Long studentId;
    private String studentName;
    private String studentEmail;
    private LocalDateTime studentDateOfBirth;

    @Transient
    private Integer studentAge;

    // Constructors, getters, setters, and toString remain unchanged
}
