package com.wgcode.Student_Service.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class StudentDTO {

    public Long studentId;
    public String studentName;
    public String studentEmail;
    public LocalDateTime studentDateOfBirth;
    public Integer studentAge;

    public StudentDTO(Long studentId, String studentName, String studentEmail,
                      LocalDateTime studentDateOfBirth, Integer studentAge) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.studentDateOfBirth = studentDateOfBirth;
        this.studentAge = studentAge;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                ", studentDateOfBirth=" + studentDateOfBirth +
                ", studentAge=" + studentAge +
                '}';
    }
}
