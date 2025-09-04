package com.wgcode.Student_Service.dto;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Table
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
    public Long studentId;
    public String studentName;
    public String studentEmail;
    public LocalDateTime studentDateOfBirth;

    @Transient
    public Integer studentAge;

    public StudentDTO(Long studentId, String studentName, String studentEmail,
                      LocalDateTime studentDateOfBirth, Integer studentAge) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.studentDateOfBirth = studentDateOfBirth;
        this.studentAge = studentAge;
    }

    public StudentDTO(String studentName, String studentEmail,
                      LocalDateTime studentDateOfBirth, Integer studentAge) {
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.studentDateOfBirth = studentDateOfBirth;
        this.studentAge = studentAge;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public LocalDateTime getStudentDateOfBirth() {
        return studentDateOfBirth;
    }

    public void setStudentDateOfBirth(LocalDateTime studentDateOfBirth) {
        this.studentDateOfBirth = studentDateOfBirth;
    }

    public Integer getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(Integer studentAge) {
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
